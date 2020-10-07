package com.klayrocha.crud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -5288467348971103354L;

	public ResourceNotFoundException(String exception) {
		super(exception);
	}
}
