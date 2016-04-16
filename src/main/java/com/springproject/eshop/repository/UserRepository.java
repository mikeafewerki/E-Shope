package com.springproject.eshop.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.springproject.eshop.domain.User;
@Component
@Transactional(readOnly = true) 
public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findByUserName(String userName);
}
