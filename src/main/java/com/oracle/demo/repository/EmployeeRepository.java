package com.oracle.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oracle.demo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
//	for basic CRUD operations, no need to write any methods 
	// INSERT save() 
	// UPDATE save() 
	// DELETE deleteById()
	// SELECT findAll()
	// SELECT findById()

//	for business specific operations only, methods need to declared here 
	
	// 2. use this method 
	public abstract List<Employee> findByName(String name);

//	1/ 
	
	// re-run your code with - 
	// remove @Repository
	// remove @Autowired 
	// remove @Entity
	// remove @Id 
	// remove 
//	public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//	public interface EmployeeRepository extends JpaRepository<> {
	
//	copy error messages and save in a txt file. 
	

}
