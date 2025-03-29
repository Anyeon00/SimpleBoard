package com.example.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<?> errorResponse(final Exception e){
		return ResponseEntity.status(500).body(e.getMessage());
	}
}
