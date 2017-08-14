package com.bizideal.wechat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bizideal.wechat.entity.User;
import com.bizideal.wechat.mapper.UserMapper;
import com.bizideal.wechat.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	
	@Override
	public Integer save(User user) {

		return null;
	}

	@Override
	public Integer deleteByIds(List<Object> ids) {
		
		return null;
	}

	
	
	@Override
	public List<User> selecList() {
		List<User> queryAllUser = userMapper.queryAllUser();		
		return queryAllUser;
	}



}
