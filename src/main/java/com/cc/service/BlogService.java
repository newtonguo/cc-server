package com.cc.service;
import java.util.*;
import com.cc.entity.Blog;

/**
 * blog
 */
public interface BlogService{
   
	
	/**
	 * �������� ��ѯȫ��listPageAccount
	 */
	 
	public List<Blog> listPageBlog(Blog blog);
	
	/**
	 *  ��ȡBlog������
	 */
	public Integer getBlogCount();
	
	/**
	 *����
	 */
	public void insert(Blog blog);
	
	/**
	 * ����������ѯ(Ψһ)
	 */
	public Blog getBlogById(Integer id);
	
	/**
	 * ���ݸ���������ѯBlog 
	 */
	public List<Blog> getBlog(Blog blog);  
	 
	 /**
	 * ����Blog
	 */
	public void updateBlog(Blog blog);
	
	 /**
	 * �ܾ�ʵ����ɾ��
	 */
	
	public void  deleteBlog(Blog blog);
	
	 /**
	 * ��������ɾ��
	 */
	public void  deleteBlogByIds (String[] ids);
	
}