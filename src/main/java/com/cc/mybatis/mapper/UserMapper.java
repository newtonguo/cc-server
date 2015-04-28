package com.cc.mybatis.mapper;

import com.cc.model.User;

public interface UserMapper {
	
	User selectByPrimaryKey(String ID);
}