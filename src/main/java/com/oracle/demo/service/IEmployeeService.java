package com.oracle.demo.service;

import java.util.List;

import com.oracle.demo.model.Employee;

public interface IEmployeeService {
	
	public abstract List<Employee> getAllEmployees();

	public abstract List<Employee> getEmployeeByName(String name);

	public abstract Employee getEmployeeById(Integer id);

	public abstract Employee addEmployee(Employee employee);

	public abstract Employee updateEmployee(Employee employee);

	public abstract Employee deleteEmployee(Integer id);

}
