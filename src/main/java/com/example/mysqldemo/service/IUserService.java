package com.example.mysqldemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.mysqldemo.entity.User;

@Service
public interface IUserService {
	int save(User user);

	List<User> getUsers();

	Optional<User> getUser(Integer userId);

	void updateUser(User user);
}
