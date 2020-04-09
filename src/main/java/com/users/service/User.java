package com.users.service;

import java.util.List;

public interface User {
	public List<User> getAllUser();
	public boolean addUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(User user);
	public boolean getUser(User user);
}
