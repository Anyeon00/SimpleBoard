package com.example.demo.application.port.in;

import com.example.demo.application.port.in.dto.BoardInfo;
import com.example.demo.application.port.in.dto.BoardsInfo;
import com.example.demo.application.port.in.dto.UpdateBoardInfo;
import com.example.demo.application.port.in.dto.WriteBoardInfo;

public interface BoardService {
//	게시글 작성
//	게시글 전체 조회 -> 추후 페이징 처리
//	게시글 상세 조회
//	게시글 수정
//	게시글 삭제
	
	Long writeBoard(WriteBoardInfo writeBoardInfo);
	
	BoardsInfo findBoards();
	
	BoardInfo findBoard(Long boardId);
	
	Long updateBoard(UpdateBoardInfo updateBoardInfo);
	
	void removeBoard(Long boardId);
}
