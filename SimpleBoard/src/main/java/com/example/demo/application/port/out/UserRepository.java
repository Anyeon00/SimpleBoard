package com.example.demo.application.port.out;

import java.util.*;

import com.example.demo.application.domain.User;

public interface UserRepository {
	
	Long save(User user);
	
	List<User> findAll();
	
	void remove(Long userId);
}
