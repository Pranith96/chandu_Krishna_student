package com.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NO_CONTENT, reason = "No Data exists")
public class EmployeeNoContentException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EmployeeNoContentException(String message) {
		super(message);
	}
}
