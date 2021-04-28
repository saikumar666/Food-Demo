package com.sstc.foodbill.model.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sstc.foodbill.model.User;
import com.sstc.foodbill.model.repository.UserRepository;
import com.sstc.foodbill.model.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User saveOrUpdate(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deletebyId(Long id) {
		userRepository.deleteById(id);

	}

	@Override
	public User findById(Long id) {
		return userRepository.getOne(id);
	}

	@Override
	public Boolean isExist(Long id) {
		return userRepository.existsById(id);
	}

}
