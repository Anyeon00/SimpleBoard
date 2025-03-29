package com.example.demo.api.response;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.application.port.in.dto.BoardInfo;
import com.example.demo.application.port.in.dto.BoardsInfo;

public class BoardListResponse {

	private List<BoardResponse> boardResponseList = new ArrayList<>();
	
	//** Factory Method **//
	public static BoardListResponse from(final BoardsInfo boardListInfo) {
		List<BoardResponse> boardResponseList = new ArrayList<>();
		boardListInfo.getBoardList()
		.stream()
		.map(BoardInfo::from)
		.map(BoardResponse::from)
		.forEach(boardResponseList::add);
		return new BoardListResponse(boardResponseList);
	}

	
	//** Constructor **//
	public BoardListResponse() {
		super();
	}
	
	private BoardListResponse(final List<BoardResponse> boardListResponse) {
		super();
		this.boardResponseList = boardListResponse;
	}


	//** Getter Setter **//
	public List<BoardResponse> getBoardList() {
		return boardResponseList;
	}

	public void setBoardList(List<BoardResponse> boardResponseList) {
		this.boardResponseList = boardResponseList;
	}

	
}
