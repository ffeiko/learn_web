package com.bizideal.wechat.service;

import java.util.List;

import com.bizideal.wechat.entity.User;

public interface UserService {

	public List<User> selecList();

	public Integer save(User user);

	public Integer deleteByIds(List<Object> ids);

}
