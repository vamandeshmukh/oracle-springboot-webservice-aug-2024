package com.oracle.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.oracle.demo.model.Employee;

public class EmployeeService implements IEmployeeService {

	private List<Employee> empList = new ArrayList<>(Arrays.asList(new Employee(101, "Sonu", 90.50),
			new Employee(102, "Monu", 95.25), new Employee(103, "Tonu", 92.75)));

	@Override
	public List<Employee> getAllEmployees() {
		return empList;
	}
	
//	@Override
//	public List<Employee> getEmployeeByName(String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	// complete the following code 

	@Override
	public Employee getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
