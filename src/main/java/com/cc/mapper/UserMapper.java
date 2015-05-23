package com.cc.mapper;

import java.util.List;

import com.cc.entity.User;

public interface UserMapper {
	/**
	 * 
	 * 根据用户名和密码查询
	 * 
	 * @param user
	 * @return <b>Date:</b>2014-9-10下午4:36:44<br>
	 * @author: cuicong
	 */
	public List<User> getUser(User user);

	/**
	 * 
	 * 根据主键id查询
	 * 
	 * @param userId
	 * @return <b>Date:</b>2014-9-10下午4:37:15<br>
	 * @author: cuicong
	 */
	public List<User> getUserById(int userId);

	/**
	 * 
	 * 查询�?��的用�?
	 * 
	 * @return <b>Date:</b>2014-9-10下午4:40:06<br>
	 * @author: cuicong
	 */
	public List<User> queryAllUser();

	public int add(User user);

	public int update(User user);

	public void delete(int userId);

	public List<User> queryPageList(User userSerach);

	public List<User> query(User userSerach);

	public int count(User userSerach);
}
