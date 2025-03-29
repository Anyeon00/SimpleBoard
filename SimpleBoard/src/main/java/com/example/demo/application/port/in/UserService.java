package com.example.demo.application.port.in;

import com.example.demo.application.port.in.dto.RegisterUserInfo;
import com.example.demo.application.port.in.dto.UsersInfo;

public interface UserService {
//	회원 생성
//	회원 전체조회
//	회원 삭제
	
	Long registerUser(RegisterUserInfo registerUserInfo);
	
	UsersInfo findUsers();
	
	void removeUser(Long userId);
}
