package com.oracle.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.demo.model.Employee;
import com.oracle.demo.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	EmployeeRepository empRepository;

	@Override
	public List<Employee> getAllEmployees() {
		return empRepository.findAll();
	}

	// complete the following code

	@Override
	public Employee getEmployeeById(Integer id) {
		Optional<Employee> empOpt = empRepository.findById(id);
		if (empOpt.isPresent())
			return empOpt.get();
		return null;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return empRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return empRepository.save(employee);
	}

	@Override
	public Employee deleteEmployee(Integer id) {
		Employee emp = this.getEmployeeById(id);
		empRepository.deleteById(id);
		return emp;
		
	}

}

//package com.oracle.demo.service;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.stereotype.Service;
//
//import com.oracle.demo.model.Employee;
//
//@Service
//public class EmployeeService implements IEmployeeService {
//
//	private List<Employee> empList = new ArrayList<>(Arrays.asList(new Employee(101, "Sonu", 90.50),
//			new Employee(102, "Monu", 95.25), new Employee(103, "Tonu", 92.75)));
//
//	@Override
//	public List<Employee> getAllEmployees() {
//		return empList;
//	}
//
//	// complete the following code
//
//	@Override
//	public Employee getEmployeeById(Integer id) {
//		Optional<Employee> empOpt = empList.stream().filter(e -> e.getId().equals(id)).findFirst();
//		if (empOpt.isPresent())
//			return empOpt.get();
//		return null;
//	}
//
//	@Override
//	public Employee addEmployee(Employee employee) {
//		empList.add(employee);
//		return employee;
//	}
//
//	@Override
//	public Employee updateEmployee(Employee employee) {
//		empList.set(empList.indexOf(getEmployeeById(employee.getId())), employee);
//
//		return employee;
//	}
//
//	@Override
//	public Employee deleteEmployee(Integer id) {
//		Optional<Employee> empOpt = empList.stream().filter(e -> e.getId().equals(id)).findFirst();
//		if (empOpt.isPresent())
//			empList.remove(empOpt.get());
//		return empOpt.get();
//	}
//
//}
