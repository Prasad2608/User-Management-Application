package com.Controller;

import java.util.List;

import com.Entity.User;

public interface UserService {

	User insert(User user);

	List<User> findAll();

	User findById(int id);

	User updateUser(int id, User user);

	void delete(int id);

}
