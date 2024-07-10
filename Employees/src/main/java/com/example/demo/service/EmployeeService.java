package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {
	 public Employee saveEmployee(Employee employee);
	 
	public List<Employee> fetchEmployeeList();

	public Employee fetchEmployeetById(Long id);

	public void deleteEmployeeById(Long id);

	public Employee updateEmployee(Long id, Employee employee);


	


}
