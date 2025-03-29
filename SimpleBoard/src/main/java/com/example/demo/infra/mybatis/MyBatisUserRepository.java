package com.example.demo.infra.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.application.domain.User;

@Mapper
public interface MyBatisUserRepository {

	Long save(User user);

	List<User> findAll();
	
	void remove(Long userId);
}

