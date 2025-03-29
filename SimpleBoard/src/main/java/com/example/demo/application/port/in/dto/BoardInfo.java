package com.example.demo.application.port.in.dto;

import com.example.demo.application.domain.Board;

public class BoardInfo {
	
	private Board board;

	//** Factory Method **//
	public static BoardInfo from(final Board board) {
		return new BoardInfo(board);
		
	}

	//** Constructor **//
	protected BoardInfo(final Board board) {
		super();
		this.board = board;
	}

	//** Getter **//
	public Board getBoard() {
		return board;
	}

	

}
