package com.oracle.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.oracle.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
//	for basic CRUD operations, no need to write any methods 
	// INSERT save() 
	// UPDATE save() 
	// DELETE deleteById()
	// SELECT findAll()
	// SELECT findById()

//	for business specific operations only, methods need to declared here 

	// guide -  
//	https://docs.spring.io/spring-data/jpa/docs/current-SNAPSHOT/reference/html/#jpa.query-methods.query-creation 
	
	// 2. use this method 

	public abstract List<Employee> findByName(String name);

	public abstract List<Employee> findByNameIgnoreCase(String name);

//	public abstract List<Employee> findBySalary(Double salary);

	public abstract List<Employee> findBySalaryGreaterThan(Double salary);
	
	public abstract List<Employee> findBySalaryBetween(Double salary1, Double salary2);

	@Query(value = "select e from Employee e where salary = ?1")
	public abstract List<Employee> findBySalary(Double salary);

	//	public abstract List<Employee> findByEmail(String email); // CE 

	//	public abstract List<Employee> findByName(String name);

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
