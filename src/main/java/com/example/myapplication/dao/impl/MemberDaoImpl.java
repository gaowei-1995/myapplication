package com.example.myapplication.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.myapplication.entity.Member;
import com.example.myapplication.dao.MemberDao;

@Repository("memberDao")
public class MemberDaoImpl implements MemberDao {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public Member selectMemberByUsernameAndPassword(Member member) {
		return sqlSessionTemplate.selectOne("MemberMapper.selectMemberByUsernameAndPassword", member);
	}

	@Override
	public Integer updateMemberUpateTime(Member member) {
		return sqlSessionTemplate.update("MemberMapper.updateMemberUpateTime", member.getId());
	}

	@Override
	public Integer updateMemberMobile(Member member) {
		return sqlSessionTemplate.update("MemberMapper.updateMemberMobile", member.getId());
	}

}
