package com.example.myapplication.service;

import java.util.List;

import com.example.myapplication.entity.Member;

public interface AuthGroupAccessService {
	
	public List<String> selectMemberRole(Member member);

}
