package com.oracle.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public Object handleEmployeeNotFoundException(EmployeeNotFoundException e) {
		System.err.println(e.getMessage());
		return null;
	}

}
