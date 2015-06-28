package com.cc.entity;

/**
 * location
 */
public class Location {

	/**
	   
	 */
	private Integer id;

	/**
	 * 用户id
	 */
	private short userId;

	/**
	 * 经度
	 */
	private String lng;

	/**
	 * 纬度
	 */
	private String lat;

	/**
	 * 创建时间
	 */
	private Integer createtime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public short getUserId() {
		return userId;
	}

	public void setUserId(short userId) {
		this.userId = userId;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public Integer getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Integer createtime) {
		this.createtime = createtime;
	}

}
