package com.cc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.entity.Menu;
import com.cc.entity.User;
import com.cc.mapper.MenuMapper;
import com.cc.mapper.UserMapper;
import com.cc.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired(required = true)
	private UserMapper userMapper;

	@Autowired
	private MenuMapper menuMapper;

	public User getUser(String userName, String password) {
		User user = new User();
		user.setPassword(password);
		user.setUserName(userName);
		List<User> list = this.userMapper.getUser(user);
		if (list.size() > 0) {
			user = list.get(0);
			user.setInfo("登录成功");
			return user;

		} else {
			user = new User();
			user.setInfo("用户名或者密码不正确");
			return user;
		}
	}

	@Override
	public List<Menu> ListMenuByUserId(User user) {
		List<Menu> menuList = this.menuMapper.queryBelongMenu(user.getUserId());
		List<Menu> reMenus = new ArrayList<Menu>();
		for (Menu m : menuList) {
			boolean mark = false;
			for (Menu m1 : menuList) {
				if (m.getPId() != null
						&& m.getPId().intValue() == m1.getMenuId().intValue()) {
					mark = true;
					if (m1.getChildren() == null)
						m1.setChildren(new ArrayList<Menu>());
					m1.getChildren().add(m);
					break;
				}
			}
			if (!mark && m.getLevel() == 2) {
				reMenus.add(m);
			}
		}

		return reMenus;
	}
}
