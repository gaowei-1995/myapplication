package com.example.myapplication.shiro;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.example.myapplication.entity.Member;
import com.example.myapplication.service.AuthGroupAccessService;
import com.example.myapplication.service.AuthGroupService;
import com.example.myapplication.service.MemberService;

public class CustomRealm extends AuthorizingRealm {
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private AuthGroupAccessService authGroupAccessService;
	
	@Autowired
	private AuthGroupService authGroupService;

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken upToken = (UsernamePasswordToken) token;
		
		String username = upToken.getUsername();
		String password = upToken.getPassword() == null ? null :new String(upToken.getPassword());
		if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            throw new AccountException();
        }
		
		Member member = memberService.loginHandle(new Member(username, password));
		if (member == null) {
            throw new UnknownAccountException();
        }
		
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(username, password.toCharArray(), getName());
		
		return info;
	}

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		if (principals == null) {
            throw new AuthorizationException();
        }
		
		String username = (String) getAvailablePrincipal(principals);
		
		List<String> roleList = authGroupAccessService.selectMemberRole(new Member(username));
		Set<String> roleSet = new LinkedHashSet<String>(roleList);
		
		List<String> ruleList = authGroupService.selectMemberRule(new Member(username));
		Set<String> permissionSet = new LinkedHashSet<String>();
		for (String rule : ruleList) {
			String[] permissionArray = rule.split(",");
			for (String permission : permissionArray) {
				permissionSet.add(permission);
			}
		}
		
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roleSet);
		info.setStringPermissions(permissionSet);
		
		return info;
	}

}
