package com.seasia.movie.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CustomException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public CustomException(String message) {
		super(message);
	}
	
	public CustomException(String message, Throwable t) {
		super(message, t);
	}
}
