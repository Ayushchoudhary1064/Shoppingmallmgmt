package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository er1;
	
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return er1.save(employee);
	}


	public List<Employee> fetchEmployeeList() {
		// TODO Auto-generated method stub
		return er1.findAll();
	}


	public Employee fetchEmployeetById(Long id) {
		// TODO Auto-generated method stub
		return er1.findById(id).get();
	}


	public void deleteEmployeeById(Long id) {
		// TODO Auto-generated method stub
		er1.deleteById(id);
	}




	public Employee updateEmployee(Long id, Employee employee) {
		// TODO Auto-generated method stub
		Employee empDB = er1.findById(id).get();

	       if(Objects.nonNull(employee.getName()) &&
	       !"".equalsIgnoreCase(employee.getName())) {
	           empDB.setName(employee.getName());
	       }

	       if(Objects.nonNull(employee.getSalary())) {
	           empDB.setSalary(employee.getSalary());
	       }

	       if(Objects.nonNull(employee.getAddress()) &&
	               !"".equalsIgnoreCase(employee.getAddress())) {
	           empDB.setAddress(employee.getAddress());
	       }
	       if(Objects.nonNull(employee.getDesignation()) &&
	               !"".equalsIgnoreCase(employee.getDesignation())) {
	           empDB.setAddress(employee.getDesignation());
	       }
	       


	       return er1.save(empDB);
	}

	    
	  
}



