package com.springproject.eshop.service;

import java.util.List;

import com.springproject.eshop.domain.User;


public interface IUserDAO {
	public abstract List<User> getAll();

	public abstract void add(User user);

	public abstract User get(int userId);

	public abstract void update(int userId, User user);

	public abstract void delete(int userId);
}
