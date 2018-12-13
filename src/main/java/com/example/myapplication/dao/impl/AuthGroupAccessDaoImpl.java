package com.example.myapplication.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.myapplication.dao.AuthGroupAccessDao;
import com.example.myapplication.entity.Member;

@Repository("authGroupAccessDao")
public class AuthGroupAccessDaoImpl implements AuthGroupAccessDao {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<String> selectRoleByUsername(Member member) {
		return sqlSessionTemplate.selectList("AuthGroupAccessMapper.selectRoleByUsername", member);
	}

}
