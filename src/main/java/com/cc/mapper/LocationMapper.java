package com.cc.mapper;
import java.util.*;
import com.cc.entity.Location;
/**
 * location
 */
public interface LocationMapper{
   
	
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
	public List<Location> getLocation(Location location);  
	 
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
	public void  deleteLocationByIds (String[] id);
	
}