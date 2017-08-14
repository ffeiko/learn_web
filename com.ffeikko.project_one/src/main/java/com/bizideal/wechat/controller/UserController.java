package com.bizideal.wechat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bizideal.wechat.entity.User;
import com.bizideal.wechat.service.UserService;


@Controller
@RequestMapping(value="/user")
public class UserController {
		
	@Autowired
	private UserService userService;
	
	/**
	 * 查询用户数据
	 * @param pageame
	 * @return
	 */
	@RequestMapping(value="/toIndex")
	public String toIndex(Model model){
		List<User> selecList = userService.selecList();
		model.addAttribute("selecList", selecList);
		return "index";
	}
	
}
