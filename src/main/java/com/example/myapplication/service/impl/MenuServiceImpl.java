package com.example.myapplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myapplication.dao.MenuDao;
import com.example.myapplication.entity.Menu;
import com.example.myapplication.service.MenuService;

@Service("menuService")
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	private MenuDao menudao;

	@Override
	public List<Menu> selectMenuList() {
		return menudao.selectMenuList();
	}

}
