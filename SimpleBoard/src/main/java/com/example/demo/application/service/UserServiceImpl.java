package com.example.demo.application.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.application.port.in.UserService;
import com.example.demo.application.port.in.dto.RegisterUserInfo;
import com.example.demo.application.port.in.dto.UsersInfo;
import com.example.demo.application.port.out.UserRepository;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	public UserServiceImpl(final UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	@Transactional
	public Long registerUser(final RegisterUserInfo registerUserInfo) {

		return userRepository.save(registerUserInfo.toDomain());
	}

	@Override
	public UsersInfo findUsers() {
		return UsersInfo.from(userRepository.findAll());
	}

	@Override
	@Transactional
	public void removeUser(final Long userId) {
		userRepository.remove(userId);
	}
}
