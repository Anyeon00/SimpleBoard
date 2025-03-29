package com.example.demo.api.response;

import com.example.demo.application.domain.Board;
import com.example.demo.application.port.in.dto.BoardInfo;

public class BoardResponse {

	private Long boardId;
	
	private Long userId;
	
	private String title;
	
	private String content;
	
	//** Factory Method **/
	public static BoardResponse from(final BoardInfo boardInfo) {
		Board board = boardInfo.getBoard();
		return new BoardResponse(board.getBoardId(), board.getUserId(), board.getTitle(), board.getContent());
	}
	
	//** Constructor **//
	public BoardResponse() {
		super();
	}
	
	private BoardResponse(final Long boardId, final Long userId, final String title, final String content) {
		super();
		this.boardId = boardId;
		this.userId = userId;
		this.title = title;
		this.content = content;
	}

	//** Getter Setter **//
	public Long getBoardId() {
		return boardId;
	}


	public void setBoardId(Long boardId) {
		this.boardId = boardId;
	}


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
