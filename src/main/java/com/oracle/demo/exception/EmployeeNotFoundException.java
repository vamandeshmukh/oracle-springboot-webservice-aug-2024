package com.oracle.demo.exception;

public class EmployeeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 2263042050487527964L;

	public EmployeeNotFoundException() {
		super();
	}

	public EmployeeNotFoundException(String message) {
		super(message);
	}
}
