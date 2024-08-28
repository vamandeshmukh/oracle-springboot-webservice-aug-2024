package com.oracle.demo.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.oracle.demo.model.Employee;

@ControllerAdvice
public class GlobalExceptionHandler {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<Employee> handleEmployeeNotFoundException(EmployeeNotFoundException e) {
		String errorMessage = e.getMessage();
//		LOG.info(errorMessage);
//		LOG.warn(errorMessage);
		LOG.error(errorMessage);
		HttpStatus status = HttpStatus.NOT_FOUND;
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", errorMessage);
		ResponseEntity<Employee> response = new ResponseEntity<Employee>(null, headers, status);
		return response;
	}

}

//package com.oracle.demo.exception;
//
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//@ControllerAdvice
//public class GlobalExceptionHandler {
//
//	@ExceptionHandler(EmployeeNotFoundException.class)
//	public ResponseEntity<Object> handleEmployeeNotFoundException(EmployeeNotFoundException e) {
//		String errorMessage = e.getMessage();
//		System.err.println(errorMessage);
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("message", errorMessage);
//		HttpStatus status = HttpStatus.NOT_FOUND;
//		ResponseEntity<Object> response = new ResponseEntity<Object>(null, headers, status);
//		return response;
//	}
//	
//	// other exception handlers 
//
//}
