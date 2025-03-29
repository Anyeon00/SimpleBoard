package com.example.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.api.request.UpdateBoardRequest;
import com.example.demo.api.request.WriteBoardRequest;
import com.example.demo.api.response.BoardListResponse;
import com.example.demo.api.response.BoardResponse;
import com.example.demo.application.port.in.BoardService;
import com.example.demo.application.port.in.dto.BoardInfo;
import com.example.demo.application.port.in.dto.BoardsInfo;
import com.example.demo.application.port.in.dto.UpdateBoardInfo;
import com.example.demo.application.port.in.dto.WriteBoardInfo;


@RestController
@RequestMapping("/api/board")
public class BoardController {
	
	private final BoardService boardService;
	
	public BoardController(final BoardService boardService) {
		super();
		this.boardService = boardService;
	}

	
//	POST	/api/board
//	GET		/api/board
//	GET		/api/board/{boardId}
//	PUT		/api/board/{boardId}
//	DELETE	/api/board/{boardId}
	
//	Long writeBoard(WriteBoardInfo writeBoardInfo);
//	
//	BoardsInfo findBoards();
//	
//	BoardInfo findBoard(Long boardId);
//	
//	Long updateBoard(UpdateBoardInfo updateBoardInfo);
//	
//	void removeBoard(Long boardId);
	
	@PostMapping
	public ResponseEntity<Long> postBoard(@RequestBody WriteBoardRequest request){
		Long boardId = boardService.writeBoard(
				WriteBoardInfo.create(
						request.getUserId(), 
						request.getTitle(), 
						request.getContent()));
		return ResponseEntity.ok(boardId);
	}
	
	@GetMapping
	public ResponseEntity<BoardListResponse> getAllBoards(){
		BoardsInfo boardListInfo = boardService.findBoards();
		return ResponseEntity.ok(BoardListResponse.from(boardListInfo));
	}
	
	@GetMapping("/{boardId}")
	public ResponseEntity<BoardResponse> getBoard(@PathVariable("boardId") Long boardId){
		BoardInfo boardInfo = boardService.findBoard(boardId);
		return ResponseEntity.ok(BoardResponse.from(boardInfo));
	}
	
	@PutMapping("/{boardId}")
	public ResponseEntity<Long> putBoard(
			@PathVariable("boardId") Long boardId, @RequestBody UpdateBoardRequest request){
		Long updatedId = boardService.updateBoard(
				UpdateBoardInfo.create(
						boardId, 
						request.getTitle(), 
						request.getContent()));
		return ResponseEntity.ok(updatedId);
	}
	
	@DeleteMapping("/{boardId}")
	public ResponseEntity<Void> deleteBoard(@PathVariable("boardId") Long boardId){
		boardService.removeBoard(boardId);
		return ResponseEntity.ok(null);
	}
}














