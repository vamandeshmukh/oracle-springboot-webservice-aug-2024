package com.oracle.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.demo.model.Employee;

@RestController
@RequestMapping("api")
public class EmployeeController {

	List<Employee> empList = new ArrayList<>(
			Arrays.asList(
			new Employee(101, "Sonu", 90.50),
			new Employee(102, "Monu", 95.25), 
			new Employee(103, "Tonu", 92.75)));

//	http://localhost:8080/api/emp 
	@GetMapping("emp")
	public List<Employee> getAllEmps() {
		return empList;
	}

//	http://localhost:8080/api/emp/101 
	@GetMapping("emp/{id}")
	public Employee getEmpById(@PathVariable(name = "id") Integer id) {
		
		return empList.get(0);
	}
}
