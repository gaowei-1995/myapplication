package com.example.myapplication.service;

import com.example.myapplication.entity.Member;

public interface MemberService {

	public Member loginHandle(Member member);
	
	public Integer updateMemberUpateTime(Member member);
	
	public Integer updateMemberMobile(Member member);
	
}
