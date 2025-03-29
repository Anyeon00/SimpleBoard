package com.example.demo.application.port.out;

import java.util.*;
import com.example.demo.application.domain.Board;

public interface BoardRepository {

//	Long writeBoard(WriteBoardDTO writeBoardDTO);
//	
//	BoardsInfoDTO findBoards();
//	
//	BoardInfoDTO findBoard(Long boardId);
//	
//	Long updateBoard(UpdateBoardDTO updateBoardDTO);
//	
//	void removeBoard(Long boardId);
	
	Long save(Board board);
	
	List<Board> findAll();
	
	Board find(Long boardId);
	
	Long update(Long boardId, Board updateBoard);
	
	void remove(Long boardId);
}
