package com.cc.service;
import java.util.*;
import com.cc.entity.Location;

/**
 * location
 */
public interface LocationService{
   
	
	/**
	 * �������� ��ѯȫ��listPageAccount
	 */
	 
	public List<Location> listPageLocation(Location location);
	
	/**
	 *  ��ȡLocation������
	 */
	public Integer getLocationCount();
	
	/**
	 *����
	 */
	public void insert(Location location);
	
	/**
	 * ����������ѯ(Ψһ)
	 */
	public Location getLocationById(Integer id);
	
	/**
	 * ���ݸ���������ѯLocation 
	 */
	public List<Location> listLocation(Location location);  
	 
	 /**
	 * ����Location
	 */
	public void updateLocation(Location location);
	
	 /**
	 * �ܾ�ʵ����ɾ��
	 */
	
	public void  deleteLocation(Location location);
	
	 /**
	 * ��������ɾ��
	 */
	public void  deleteLocationByIds (String[] ids);
	/**
	 *有条件的更新
	 */
	
	public void insertSelective(Location location);
	/**
	 *根据主键有条件的更新
	 */
	
	public void updateByPrimaryKeySelective(Location location);
	
}