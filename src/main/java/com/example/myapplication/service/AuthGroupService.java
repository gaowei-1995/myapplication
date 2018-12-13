package com.example.myapplication.service;

import java.util.List;

import com.example.myapplication.entity.Member;

public interface AuthGroupService {
	
	public List<String> selectMemberRule(Member member);

}
