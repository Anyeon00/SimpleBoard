package com.example.demo.application.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.application.domain.Board;
import com.example.demo.application.port.in.BoardService;
import com.example.demo.application.port.in.dto.BoardInfo;
import com.example.demo.application.port.in.dto.BoardsInfo;
import com.example.demo.application.port.in.dto.UpdateBoardInfo;
import com.example.demo.application.port.in.dto.WriteBoardInfo;
import com.example.demo.application.port.out.BoardRepository;

@Service
@Transactional(readOnly = true)
public class BoardServiceImpl implements BoardService {

	private final BoardRepository boardRepository;

	public BoardServiceImpl(final BoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}

	@Override
	@Transactional
	public Long writeBoard(final WriteBoardInfo writeBoardInfo) {
		//toDomain() 보다는, Board.create(...)가 나은 듯
		return boardRepository.save(writeBoardInfo.toDomain());
	}

	@Override
	public BoardsInfo findBoards() {
		List<Board> boardList = boardRepository.findAll();
		return BoardsInfo.from(boardList);
	}

	@Override
	public BoardInfo findBoard(final Long boardId) {
		Board board = boardRepository.find(boardId);
		return BoardInfo.from(board);
	}

	@Override
	@Transactional
	public Long updateBoard(final UpdateBoardInfo updateBoardInfo) {
		return boardRepository.update(
				updateBoardInfo.getBoardId(), 
				Board.create(
						null, 
						updateBoardInfo.getTitle(), 
						updateBoardInfo.getContent()));
	}

	@Override
	@Transactional
	public void removeBoard(final Long boardId) {
		boardRepository.remove(boardId);
	}

}
