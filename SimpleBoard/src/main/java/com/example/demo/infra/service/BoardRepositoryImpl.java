package com.example.demo.infra.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.application.domain.Board;
import com.example.demo.application.port.out.BoardRepository;
import com.example.demo.infra.mybatis.MyBatisBoardRepository;

@Repository
public class BoardRepositoryImpl implements BoardRepository{
	
	private final MyBatisBoardRepository myBatisBoardRepository;
	
	public BoardRepositoryImpl(final MyBatisBoardRepository myBatisBoardRepository) {
		this.myBatisBoardRepository = myBatisBoardRepository;
	}

	@Override
	public Long save(final Board board) {
		myBatisBoardRepository.save(board);
		return board.getBoardId();
	}

	@Override
	public List<Board> findAll() {
		return myBatisBoardRepository.findAll();
	
	}

	@Override
	public Board find(final Long boardId) {
		return myBatisBoardRepository.findByBoardId(boardId);
		
	}

	@Override
	public Long update(final Long boardId, final Board updateBoard) {
		myBatisBoardRepository.update(boardId, updateBoard);
		return boardId;
	}

	@Override
	public void remove(final Long boardId) {
		myBatisBoardRepository.remove(boardId);
	}
	
}
