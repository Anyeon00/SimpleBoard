package com.example.demo.infra.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.application.domain.Board;

@Mapper
public interface MyBatisBoardRepository {

	Long save(Board board);

	List<Board> findAll();

	Board findByBoardId(Long boardId);

	void update(@Param("boardId") Long boardId, @Param("updateBoard") Board updateBoard);

	void remove(Long boardId);

}
