package com.users.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.users.dao.UserRepository;

public class UserImpl implements User{

	@Autowired
	UserRepository user;
	@Override
	public List<User> getAllUser() {
		return user.findAll();
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
