package com.example.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.api.request.SignUpRequest;
import com.example.demo.api.response.UserListResponse;
import com.example.demo.application.port.in.UserService;
import com.example.demo.application.port.in.dto.RegisterUserInfo;
import com.example.demo.application.port.in.dto.UsersInfo;

@RestController
@RequestMapping("/api/user")
public class UserController {

	private final UserService userService;

	public UserController(final UserService userService) {
		super();
		this.userService = userService;
	}

//	회원 생성
//	회원 전체조회
//	회원 삭제
//	POST	/api/user
//	GET		/api/user
//	DELETE	/api/user

	@PostMapping
	public ResponseEntity<Long> signUp(@RequestBody final SignUpRequest signUpRequest) {
		Long userId = userService
				.registerUser(RegisterUserInfo.create(signUpRequest.getUsername(), signUpRequest.getPassword()));
		return ResponseEntity.ok(userId);
	}

	@GetMapping
	public ResponseEntity<UserListResponse> getAllUsers() {
		UsersInfo usersInfo = userService.findUsers();
		return ResponseEntity.ok(UserListResponse.from(usersInfo));
	}

	@DeleteMapping("/{userId}")
	public ResponseEntity<Void> deleteUser(@PathVariable("userId") Long userId) {
		userService.removeUser(userId);
		return ResponseEntity.ok(null);
	}
}
