package com.example.demo.application.port.in.dto;

import java.util.List;

import com.example.demo.application.domain.Board;


public class BoardsInfo {

	private List<Board> boardList;
	
	
	//** Factory Method **//
	public static BoardsInfo from(final List<Board> boardList) {
		return new BoardsInfo(boardList);
	}

	// ** Constructor **//
	protected BoardsInfo(final List<Board> boardList) {
		super();
		this.boardList = boardList;
	}

	// ** Getter **//
	public List<Board> getBoardList() {
		return boardList;
	}

}
