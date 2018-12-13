package com.example.myapplication.dao;

import java.util.List;

import com.example.myapplication.entity.Member;

public interface AuthGroupDao {
	
	public List<String> selectRuleByUsername(Member member);
	
}
