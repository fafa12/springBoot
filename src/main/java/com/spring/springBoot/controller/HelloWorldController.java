package com.spring.springBoot.controller;

import com.spring.springBoot.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 * 创建人：menglingfa
 * 创建时间：2018/11/1
 * 版本：1.0
 */
@RestController
public class HelloWorldController
{
	@RequestMapping("/hello")
	public String index()
	{
		return "Hello World2";
	}

	@RequestMapping("/getUser")
	public User getUser()
	{
		User user = new User();
		user.setUserName("小明");
		user.setPassWord("xxxx");
		return user;
	}
}
