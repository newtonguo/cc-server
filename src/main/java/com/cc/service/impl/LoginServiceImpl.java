package com.cc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.entity.User;
import com.cc.mapper.UserMapper;
import com.cc.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired(required = true)
	private UserMapper userMapper;

	public User getUser(String userName, String password) {
		User user = new User();
		user.setPassword(password);
		user.setUserName(userName);
		List<User> list = this.userMapper.getUser(user);
		if (list.size() > 0) {
			return list.get(0);

		} else {
			return null;
		}
	}

}
