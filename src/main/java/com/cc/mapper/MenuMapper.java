package com.cc.mapper;

import java.util.List;

import com.cc.entity.Menu;

public interface MenuMapper {
	/**
	 * 
	 * ��ȡ�û������Ĳ˵�
	 * 
	 * @param menuId
	 * @return <b>Date:</b>2014-9-11����11:08:18<br>
	 * @author: cuicong
	 */
	public List<Menu> queryBelongMenu(Integer userId);

	/**
	 * 
	 * ��ȡ���еĲ˵�
	 * 
	 * @return <b>Date:</b>2014-9-11����11:09:17<br>
	 * @author: cuicong
	 */
	public List<Menu> queryAllMenu();

	public List<Menu> queryByRoleId(int roleId);

	/**
	 * 
	 * get
	 * 
	 * @param menuId
	 * @return <b>Date:</b>2014-9-11����11:10:33<br>
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
