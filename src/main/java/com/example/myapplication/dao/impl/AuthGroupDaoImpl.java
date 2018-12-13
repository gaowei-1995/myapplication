package com.example.myapplication.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.myapplication.dao.AuthGroupDao;
import com.example.myapplication.entity.Member;

@Repository("authGroupDao")
public class AuthGroupDaoImpl implements AuthGroupDao {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<String> selectRuleByUsername(Member member) {
		return sqlSessionTemplate.selectList("AuthGroupMapper.selectRuleByUsername", member);
	}

}
