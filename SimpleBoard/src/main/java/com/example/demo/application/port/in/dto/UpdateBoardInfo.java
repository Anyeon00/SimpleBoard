package com.example.demo.application.port.in.dto;

//@Data
public class UpdateBoardInfo {

	private Long boardId;
	
	private String title;
	
	private String content;

	
	//** Factory Method **//
	public static UpdateBoardInfo create(final Long boardId, final String title, final String content) {
		return new UpdateBoardInfo(boardId, title, content);
	}
	
	//** Constructor **//
	protected UpdateBoardInfo() {}
	
	private UpdateBoardInfo(final Long boardId, final String title, final String content) {
		super();
		this.boardId = boardId;
		this.title = title;
		this.content = content;
	}
	
	//** Getter **//
	public Long getBoardId() {
		return boardId;
	}


	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}
	
	
}
