package com.cc.mapper;

import java.util.List;

import com.cc.entity.Menu;

public interface MenuMapper {
	/**
	 * 
	 * 获取用户所属的菜单
	 * 
	 * @param menuId
	 * @return <b>Date:</b>2014-9-11上午11:08:18<br>
	 * @author: cuicong
	 */
	public List<Menu> queryBelongMenu(Integer userId);

	/**
	 * 
	 * 获取所有的菜单
	 * 
	 * @return <b>Date:</b>2014-9-11上午11:09:17<br>
	 * @author: cuicong
	 */
	public List<Menu> queryAllMenu();

	public List<Menu> queryByRoleId(int roleId);

	/**
	 * 
	 * get
	 * 
	 * @param menuId
	 * @return <b>Date:</b>2014-9-11上午11:10:33<br>
	 * @author: cuicong
	 */

	public List<Menu> get(Integer menuId);

	public Integer add(Menu menu);

	public void delete(int menuId);

	public List<Menu> queryByPId(Integer PId);

	public int update(Menu menu);

	public List<Menu> queryPageList(Menu menu);

	public int count(Menu userSerach);

}
