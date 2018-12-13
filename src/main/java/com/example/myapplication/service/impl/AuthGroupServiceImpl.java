package com.example.myapplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myapplication.dao.AuthGroupDao;
import com.example.myapplication.entity.Member;
import com.example.myapplication.service.AuthGroupService;

@Service("authGroupService")
public class AuthGroupServiceImpl implements AuthGroupService {
	
	@Autowired
	private AuthGroupDao authGroupDao;
	
	@Override
	public List<String> selectMemberRule(Member member) {
		return authGroupDao.selectRuleByUsername(member);
	}

}
