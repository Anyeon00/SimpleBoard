package com.example.demo.application.port.in.dto;

import com.example.demo.application.domain.User;

public class RegisterUserInfo {
//	user - id, username, password

	private String username;

	private String password;

	// ** Factory Method **//
	public static RegisterUserInfo create(final String username, final String password) {
		return new RegisterUserInfo(username, password);
	}

	public User toDomain() {
		return User.create(username, password);
	}

	// ** Constructor **//
	protected RegisterUserInfo() {
	}

	private RegisterUserInfo(final String username, final String password) {
		super();
		this.username = username;
		this.password = password;
	}

	// ** Getter **/
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}
