package com.cc.service;

import java.util.List;

import com.cc.entity.Menu;
import com.cc.entity.User;

public interface LoginService {
	/**
	 * 
	 * ��ȡ�û������û���������
	 * 
	 * @param userName
	 * @param password
	 * @return <b>Date:</b>2014-8-20����10:48:20<br>
	 * @author: cuicong
	 */
	public User getUser(String userName, String password);

	// ����id��ȡ�����û������Ĳ˵�
	public List<Menu> ListMenuByUserId(User user);// ����id��ȡ�����û������Ĳ˵�

}
