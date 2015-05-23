package com.cc.service;

import com.cc.entity.User;

public interface LoginService {
	/**
	 * 
	 * 获取用户根据用户名和密码
	 * 
	 * @param userName
	 * @param password
	 * @return <b>Date:</b>2014-8-20上午10:48:20<br>
	 * @author: cuicong
	 */
	public User getUser(String userName, String password);

}
