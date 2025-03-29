package com.example.demo.api.request;

public class WriteBoardRequest {
	
	private Long userId;
	
	private String title;
	
	private String content;

	//** Constructor **//
	public WriteBoardRequest() {
		super();
	}
	
	//** Getter Setter **//
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	
}
