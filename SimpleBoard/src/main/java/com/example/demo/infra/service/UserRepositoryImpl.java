package com.example.demo.infra.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.application.domain.User;
import com.example.demo.application.port.out.UserRepository;
import com.example.demo.infra.mybatis.MyBatisUserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository {

	private final MyBatisUserRepository myBatisUserRepository;

	public UserRepositoryImpl(final MyBatisUserRepository myBatisUserRepository) {
		super();
		this.myBatisUserRepository = myBatisUserRepository;
	}

	@Override
	public Long save(final User user) {
		myBatisUserRepository.save(user);
		return user.getUserId();
	}

	@Override
	public List<User> findAll() {
		return myBatisUserRepository.findAll();
	}

	@Override
	public void remove(final Long userId) {
		myBatisUserRepository.remove(userId);
	}
}
