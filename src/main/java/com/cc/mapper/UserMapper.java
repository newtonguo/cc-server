package com.cc.mapper;

import com.cc.model.User;

public interface UserMapper {
	
	User selectByPrimaryKey(String ID);
}