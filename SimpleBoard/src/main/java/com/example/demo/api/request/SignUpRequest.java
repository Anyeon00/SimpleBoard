package com.example.demo.api.request;

//@Data
//or
//@NoArgsConstructor
//@Getter @Setter 
//json 직렬화/역직렬화에 사용
public class SignUpRequest {

	private String username;
	
	private String password;



	//** @Data **//
	public SignUpRequest() {
		super();
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
}
