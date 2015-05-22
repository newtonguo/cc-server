package com.cc.service;
import java.util.*;
import com.cc.entity.Blog;

/**
 * blog
 */
public interface BlogService{
   
	
	/**
	 * 根据条件 查询全部listPageAccount
	 */
	 
	public List<Blog> listPageBlog(Blog blog);
	
	/**
	 *  获取Blog的数量
	 */
	public Integer getBlogCount();
	
	/**
	 *插入
	 */
	public void insert(Blog blog);
	
	/**
	 * 根据主键查询(唯一)
	 */
	public Blog getBlogById(Integer id);
	
	/**
	 * 根据根据条件查询Blog 
	 */
	public List<Blog> getBlog(Blog blog);  
	 
	 /**
	 * 更新Blog
	 */
	public void updateBlog(Blog blog);
	
	 /**
	 * 很据实体类删除
	 */
	
	public void  deleteBlog(Blog blog);
	
	 /**
	 * 根据主键删除
	 */
	public void  deleteBlogByIds (String[] ids);
	
}