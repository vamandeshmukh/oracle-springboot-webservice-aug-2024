package com.oracle.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
//@NamedQueries(
//		@NamedQuery(name = "findByName", query = "select e from Employee e where name = ?1" )
//		)
public class Employee {
	
	// 1. find out and use several other annotations in this class 

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Integer id;
	private String name;
	private Double salary;

	// constructors, getters, setters, toString etc

	public Employee() {
		super();
	}

	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

//	hashCode 

//	equals 

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
