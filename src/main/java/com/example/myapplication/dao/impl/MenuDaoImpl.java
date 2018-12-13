package com.example.myapplication.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.myapplication.dao.MenuDao;
import com.example.myapplication.entity.Menu;

@Repository("menuDao")
public class MenuDaoImpl implements MenuDao {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<Menu> selectMenuList() {
		return sqlSessionTemplate.selectList("MenuMapper.selectMenuList");
	}

}
