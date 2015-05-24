package com.cc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cc.entity.User;
import com.cc.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
	@Autowired
	private LoginService loginService;

	/**
	 * 
	 * 登录
	 * 
	 * @param reques
	 * @param name
	 * @param password
	 * @param text
	 * @return <b>Date:</b>2014-8-19下午3:53:27<br>
	 * @author: cuicong
	 */
	@RequestMapping("login")
	public User login(HttpServletRequest reques, @RequestBody User user) {
		return this.loginService
				.getUser(user.getUserName(), user.getPassword());
	}

}