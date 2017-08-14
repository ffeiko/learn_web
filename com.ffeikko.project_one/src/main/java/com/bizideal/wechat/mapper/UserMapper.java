package com.bizideal.wechat.mapper;

import java.util.List;

import com.bizideal.wechat.entity.User;



public interface UserMapper {

	public List<User> queryAllUser();

	public Integer saveUser(User user);
}
