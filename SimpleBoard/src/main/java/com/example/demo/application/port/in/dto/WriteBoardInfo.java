package com.example.demo.application.port.in.dto;

import com.example.demo.application.domain.Board;

public class WriteBoardInfo {

	public Long userId;
	
	public String title;
	
	public String content;

	
	//** Factory Method **//
	public static WriteBoardInfo create(final Long userId, final String title, final String content) {
		return new WriteBoardInfo(userId, title, content);
	}
	
	public Board toDomain() {
		return Board.create(userId, title, content);
	}

	
	//** Constructor **//
	protected WriteBoardInfo() {
		super();
	}
	
	protected WriteBoardInfo(final Long userId, final String title, final String content) {
		super();
		this.userId = userId;
		this.title = title;
		this.content = content;
	}

	//** Getter **//
	public Long getUserId() {
		return userId;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}
	
}
