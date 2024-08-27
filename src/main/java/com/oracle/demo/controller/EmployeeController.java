package com.oracle.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.demo.model.Employee;
import com.oracle.demo.service.IEmployeeService;

@RestController
@RequestMapping("api")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {

//	private IEmployeeService empService = new EmployeeService();

	@Autowired
	private IEmployeeService empService;

//	http://localhost:8080/api/emp 
	@GetMapping("emp")
	public List<Employee> getAllEmps() {
		return empService.getAllEmployees();
	}

//	http://localhost:8080/api/emp/101 
	@GetMapping("emp/{id}")
	public Employee getEmpById(@PathVariable(name = "id") Integer id) {
		return empService.getEmployeeById(id);
	}

//	http://localhost:8080/api/emp/name/Sonu
	@GetMapping("emp/name/{name}")
	public List<Employee> getEmpByName(@PathVariable(name = "name") String name) {
		return empService.getEmployeeByName(name);
	}

	@GetMapping("emp2")
	public List<Employee> getEmpByName2(@RequestParam(name = "name") String name) {
	    return empService.getEmployeeByName(name);
	}

	
	//	http://localhost:8080/api/emp 
//	@PostMapping("emp")
	@RequestMapping(method = RequestMethod.POST, path = "emp", consumes = "application/json", produces = "application/json")
	public Employee addEmp(@RequestBody Employee employee) {
		return empService.addEmployee(employee);
	}

	@PutMapping("emp")
	public Employee updateEmp(@RequestBody Employee employee) {
		return empService.updateEmployee(employee);
	}

	@DeleteMapping("emp/{id}")
	public Employee deleteEmpById(@PathVariable(name = "id") Integer id) {
		return empService.deleteEmployee(id);
	}
}

//package com.oracle.demo.controller;
//
//import java.util.List;
//
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.oracle.demo.model.Employee;
//import com.oracle.demo.service.IEmployeeService;
//
//@RestController
//@RequestMapping("api")
//public class EmployeeController {
//
//	private IEmployeeService empService;
//
////	http://localhost:8080/api/emp 
//	@GetMapping("emp")
//	public List<Employee> getAllEmps() {
//		return empService.getAllEmployees();
//	}
//
////	http://localhost:8080/api/emp/101 
//	@GetMapping("emp/{id}")
//	public Employee getEmpById(@PathVariable(name = "id") Integer id) {
//		return empService.getEmployeeById(id);
//	}
//
////	http://localhost:8080/api/emp 
//	@PostMapping("emp")
//	public Employee addEmp(@RequestBody Employee employee) {
//		return empService.addEmployee(employee);
//	}
//
//	@PutMapping("emp")
//	public Employee updateEmp(@RequestBody Employee employee) {
//		return empService.updateEmployee(employee);
//	}
//
//	@DeleteMapping("emp/{id}")
//	public Employee deleteEmpById(@PathVariable(name = "id") Integer id) {
//		return empService.deleteEmployee(id);
//	}
//}
