package com.sstc.foodbill.model.service;

import java.util.List;

import com.sstc.foodbill.model.User;

public interface UserService {

	List<User> findAll();

	User saveOrUpdate(User user);

	void deletebyId(Long id);

	User findById(Long id);

	Boolean isExist(Long id);

}
