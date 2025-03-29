package com.example.demo.application.domain;


public class Board {

	private Long boardId;
	
	private Long userId;

	private String title;

	private String content;
	
	
	//** Static Factory Method **//
	public static Board create(final Long userId, final String title, final String content) {
		return new Board(userId, title, content);
	}
	
	//** Constructor **//
	protected Board() {}

	protected Board(final Long userId, final String title, final String content) {
		this.userId = userId;
		this.title = title;
		this.content = content;
	}

	//** Getter **//
	
	public Long getBoardId() {
		return boardId;
	}

	public Long getUserId() {
		return userId;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	
	//** Setter **//
	//selectKey에서 PK 주입을 위해 필요
	public void setBoardId(Long boardId) {
		this.boardId = boardId;
	}
}
