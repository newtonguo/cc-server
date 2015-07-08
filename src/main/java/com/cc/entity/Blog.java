package com.cc.entity;

/**
 * blog
 */
public class Blog {

	/**
	 * 博客id（主键）
	 */
	private Integer blogId;

	/**
	 * 博客标题
	 */
	private String blogTitle;

	/**
	 * 博文描述
	 */
	private String blogDescription;

	/**
	 * 创建人
	 */
	private Integer createUser;

	/**
	 * 创建时间
	 */
	private java.util.Date createTime;

	/**
	 * 跟新人
	 */
	private Integer updateUser;

	/**
	 * 跟新时间
	 */
	private java.util.Date updateTime;

	/**
	 * 博客作者
	 */
	private Integer blogger;

	/**
	 * 博客类型
	 */
	private Integer blogType;

	/**
	   
	 */
	private Integer start;

	/**
	 * 文章内容
	 */
	private byte[] blogContent;

	public Integer getBlogId() {
		return blogId;
	}

	public void setBlogId(Integer blogId) {
		this.blogId = blogId;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getBlogDescription() {
		return blogDescription;
	}

	public void setBlogDescription(String blogDescription) {
		this.blogDescription = blogDescription;
	}

	public Integer getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}

	public java.util.Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

	public Integer getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Integer updateUser) {
		this.updateUser = updateUser;
	}

	public java.util.Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getBlogger() {
		return blogger;
	}

	public void setBlogger(Integer blogger) {
		this.blogger = blogger;
	}

	public Integer getBlogType() {
		return blogType;
	}

	public void setBlogType(Integer blogType) {
		this.blogType = blogType;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public byte[] getBlogContent() {
		return blogContent;
	}

	public void setBlogContent(byte[] blogContent) {
		this.blogContent = blogContent;
	}

}
