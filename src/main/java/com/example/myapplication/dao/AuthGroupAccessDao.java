package com.example.myapplication.dao;

import java.util.List;

import com.example.myapplication.entity.Member;

public interface AuthGroupAccessDao {

	public List<String> selectRoleByUsername(Member member);

}
