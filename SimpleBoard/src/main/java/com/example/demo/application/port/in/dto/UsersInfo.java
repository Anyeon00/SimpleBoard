package com.example.demo.application.port.in.dto;

import java.util.List;

import com.example.demo.application.domain.User;


public class UsersInfo {


	List<User> users;

	public static UsersInfo from(final List<User> userList) {
		return new UsersInfo(userList);
	}

	//** Constructor **//
	protected UsersInfo(final List<User> userList) {
		super();
		this.users = userList;
	}

	//** Getter **//
	public List<User> getUsers() {
		return users;
	}
}
