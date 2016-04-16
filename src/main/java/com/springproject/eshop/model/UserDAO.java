package com.springproject.eshop.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.springproject.eshop.domain.User;
import com.springproject.eshop.service.IUserDAO;


public class UserDAO implements IUserDAO{

	private static int idCount = 1;
	private Map<Integer, User> users = new HashMap<Integer, User>();

	public UserDAO() {

	}

	@Override
	public List<User> getAll() {
		return new ArrayList<User>(users.values());
	}

	@Override
	public void add(User user) {
		user.setId(idCount);
		users.put(idCount, user);
		idCount++;
	}

	@Override
	public User get(int id) {
		User result = users.get(id);

		if (result == null) {
//			throw new NoSuchResourceException("User", id);
		}

		return result;
	}

	@Override
	public void update(int userId, User user) {
		users.put(userId, user);
	}

	@Override
	public void delete(int userId) {
		User removed = users.remove(userId);
		if (removed == null) {
//			throw new NoSuchResourceException("User", userId);
		}
	}

}
