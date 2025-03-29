package com.example.demo.api.request;

public class UpdateBoardRequest {
	
	private String title;
	
	private String content;

	//** Constructor **//
	public UpdateBoardRequest() {
		super();
	}

	//** Getter Stter **//
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
