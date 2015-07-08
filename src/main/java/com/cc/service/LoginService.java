package com.cc.service;

import java.util.List;

import com.cc.entity.Menu;
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

	// 根据id获取所以用户所属的菜单
	public List<Menu> ListMenuByUserId(User user);// 根据id获取所以用户所属的菜单

}
