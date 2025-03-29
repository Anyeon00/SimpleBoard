package com.example.demo.application.domain;

public class User {

//	user - id, username, password

	private Long userId;

	private String username;

	private String password;

	// ** Static Factory Method **//
	public static User create(final String username, final String password) {
		return new User(username, password);
	}

	// ** Constructor **//
	protected User() {

	}

	private User(final String username, final String password) {
		super();
		this.username = username;
		this.password = password;
	}

	// ** Getter **//
	public Long getUserId() {
		return userId;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	//** Setter **//
	//selectKey에서 PK 주입을 위해 필요
	public void setUserId(Long userId) {
		this.userId = userId;
	}
}
