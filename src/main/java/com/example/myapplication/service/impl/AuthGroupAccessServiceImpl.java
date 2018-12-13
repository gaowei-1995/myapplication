package com.example.myapplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myapplication.dao.AuthGroupAccessDao;
import com.example.myapplication.entity.Member;
import com.example.myapplication.service.AuthGroupAccessService;

@Service("authGroupAccessService")
public class AuthGroupAccessServiceImpl implements AuthGroupAccessService {
	
	@Autowired
	private AuthGroupAccessDao authGroupAccessDao;

	@Override
	public List<String> selectMemberRole(Member member) {
		return authGroupAccessDao.selectRoleByUsername(member);
	}

}
