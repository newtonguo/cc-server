package com.cc.service;
import java.util.*;
import com.cc.entity.Comments;

/**
 * comments
 */
public interface CommentsService{
   
	
	/**
	 * �������� ��ѯȫ��listPageAccount
	 */
	 
	public List<Comments> listPageComments(Comments comments);
	
	/**
	 *  ��ȡComments������
	 */
	public Integer getCommentsCount();
	
	/**
	 *����
	 */
	public void insert(Comments comments);
	
	/**
	 * ����������ѯ(Ψһ)
	 */
	public Comments getCommentsById(Integer id);
	
	/**
	 * ���ݸ���������ѯComments 
	 */
	public List<Comments> getComments(Comments comments);  
	 
	 /**
	 * ����Comments
	 */
	public void updateComments(Comments comments);
	
	 /**
	 * �ܾ�ʵ����ɾ��
	 */
	
	public void  deleteComments(Comments comments);
	
	 /**
	 * ��������ɾ��
	 */
	public void  deleteCommentsByIds (String[] ids);
	
}