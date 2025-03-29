package com.example.demo.api.response;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.application.domain.User;
import com.example.demo.application.port.in.dto.UsersInfo;

public class UserListResponse {
	
	//TODO : List 안의 User 엔티티도 UserResponse로 변환 필요 _BoardListResponse 참고
	private List<User> userList;
	
	//** Factory Method **//
	public static UserListResponse from(final UsersInfo usersInfo) {
		List<User> userList = new ArrayList<>(); 
		usersInfo.getUsers().stream().forEach(userList::add);
		return new UserListResponse(userList);
	}
	
	//** Constructor **//
	public UserListResponse(final List<User> userList) {
		super();
		this.userList = userList;
	}

	public UserListResponse() {
		super();
	}

	//** Getter Setter **//
	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
}
