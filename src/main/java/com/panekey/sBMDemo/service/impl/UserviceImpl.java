package com.panekey.sBMDemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panekey.sBMDemo.mapper.UserMapper;
import com.panekey.sBMDemo.pojo.User;
import com.panekey.sBMDemo.service.UserService;

@Service
public class UserviceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public List<User> selectUser() {
		// TODO Auto-generated method stub
		return userMapper.selectUser();
	}

}
