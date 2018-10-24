package com.panekey.sBMDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.panekey.sBMDemo.pojo.Message;
import com.panekey.sBMDemo.pojo.User;
import com.panekey.sBMDemo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/api/user", method = RequestMethod.GET)
	public Message selectUser()
	{   
		List <User> list = userService.selectUser();
		return Message.ok().put("result", list);
	}

}
