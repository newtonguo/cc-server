package com.cc.mapper;

import com.cc.entity.User;

public interface UserMapper {
	
	User selectByPrimaryKey(String ID);
}