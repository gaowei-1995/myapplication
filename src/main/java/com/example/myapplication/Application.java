package com.example.myapplication;

import java.util.List;

import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.cache.MemoryConstrainedCacheManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.myapplication.entity.Menu;
import com.example.myapplication.service.MenuService;
import com.example.myapplication.shiro.CustomRealm;

@SpringBootApplication
@EnableTransactionManagement
public class Application {
	
	@Autowired
	private MenuService menuService;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public Realm realm() {
		return new CustomRealm();
	}
	
	@Bean
	public ShiroFilterChainDefinition shiroFilterChainDefinition() {
		DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();
		
		List<Menu> menuList = menuService.selectMenuList();
		for (Menu menu : menuList) {
			chainDefinition.addPathDefinition("/" + menu.getUrl(), "authc, perms[" + menu.getId() + "]");
		}
		
		chainDefinition.addPathDefinition("/js/*", "anon");
		chainDefinition.addPathDefinition("/css/*", "anon");
		chainDefinition.addPathDefinition("/img/*", "anon");
		chainDefinition.addPathDefinition("/favicon.ico", "anon");
		chainDefinition.addPathDefinition("/login/loginHandle", "anon");
		chainDefinition.addPathDefinition("/**", "authc");
		
		return chainDefinition;
	}
	
	@Bean
	protected CacheManager cacheManager() {
		return new MemoryConstrainedCacheManager();
	}

	@Bean
    public static DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator(){
        DefaultAdvisorAutoProxyCreator proxyCreator = new DefaultAdvisorAutoProxyCreator();
        proxyCreator.setUsePrefix(true);
        return proxyCreator;
    }
}