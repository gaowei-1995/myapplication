package com.example.myapplication.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myapplication.dao.MemberDao;
import com.example.myapplication.entity.Member;
import com.example.myapplication.service.MemberService;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDao memberDao;

	@Override
	public Member loginHandle(Member member) {
		return memberDao.selectMemberByUsernameAndPassword(member);
	}

	@Override
	public Integer updateMemberUpateTime(Member member) {
		return memberDao.updateMemberUpateTime(member);
	}

	@Override
	public Integer updateMemberMobile(Member member) {
		return memberDao.updateMemberMobile(member);
	}

}
