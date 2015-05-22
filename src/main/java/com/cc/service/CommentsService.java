package com.cc.service;
import java.util.*;
import com.cc.entity.Comments;

/**
 * comments
 */
public interface CommentsService{
   
	
	/**
	 * 根据条件 查询全部listPageAccount
	 */
	 
	public List<Comments> listPageComments(Comments comments);
	
	/**
	 *  获取Comments的数量
	 */
	public Integer getCommentsCount();
	
	/**
	 *插入
	 */
	public void insert(Comments comments);
	
	/**
	 * 根据主键查询(唯一)
	 */
	public Comments getCommentsById(Integer id);
	
	/**
	 * 根据根据条件查询Comments 
	 */
	public List<Comments> getComments(Comments comments);  
	 
	 /**
	 * 更新Comments
	 */
	public void updateComments(Comments comments);
	
	 /**
	 * 很据实体类删除
	 */
	
	public void  deleteComments(Comments comments);
	
	 /**
	 * 根据主键删除
	 */
	public void  deleteCommentsByIds (String[] ids);
	
}