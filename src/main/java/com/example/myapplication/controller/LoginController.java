package com.example.myapplication.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.myapplication.entity.Member;
import com.example.myapplication.service.MemberService;
import com.example.myapplication.tool.EncryptTool;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private MemberService memberService;
	
	@PostMapping("/loginHandle")
	@ResponseBody
	public Boolean loginHandle(@RequestBody Member member) {
		Boolean isLogin = true;
		Subject currentUser = SecurityUtils.getSubject();
		if ( !currentUser.isAuthenticated() ) {
			String username = member.getUsername();
			String password = EncryptTool.dataMd5Key(member.getPassword());
			UsernamePasswordToken token = new UsernamePasswordToken(username, password);
			try {
				currentUser.login(token);
			} catch ( AuthenticationException e ) {
				isLogin = false;
			}
		}
		return isLogin;
	}
	
	@GetMapping("/loginOut")
	@ResponseBody
	public Boolean loginOut() {
		Subject currentUser = SecurityUtils.getSubject();
		currentUser.logout();
		return true;
	}
	
	@PostMapping("/editMember")
	@ResponseBody
	@Transactional
	public Integer editMember(@RequestBody Member member) {
		Integer count2 = memberService.updateMemberMobile(member);
		int a = 11/0;
		Integer count = memberService.updateMemberUpateTime(member);
		return count+count2;
	}

}
