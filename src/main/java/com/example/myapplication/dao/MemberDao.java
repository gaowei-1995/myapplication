package com.example.myapplication.dao;

import com.example.myapplication.entity.Member;

public interface MemberDao {

	public Member selectMemberByUsernameAndPassword(Member member);
	
	public Integer updateMemberUpateTime(Member member);
	
	public Integer updateMemberMobile(Member member);
	
}
