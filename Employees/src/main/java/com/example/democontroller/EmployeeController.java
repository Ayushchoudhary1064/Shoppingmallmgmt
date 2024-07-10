package com.example.democontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
     EmployeeService es1;
	

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee) {
       
        return es1.saveEmployee(employee);
    }
    @GetMapping("/users")
    public List<Employee> fetchEmployeeList() {
        //LOGGER.info("Inside fetchDepartmentList of DepartmentController");
        return es1.fetchEmployeeList();
    }
    


    @GetMapping("/employee/{id}")
    public Employee fetchEmployeeById(@PathVariable("id") Long id)
            {
        return es1.fetchEmployeetById(id);
    }
    
    @DeleteMapping("/employee/{id}")
    public String deleteEmployeeById(@PathVariable("id") Long id) {
        es1.deleteEmployeeById(id);
        return "Employee deleted Successfully!!";
    }
    @PutMapping("/users/{id}")
    public Employee updateEmployee(@PathVariable("id") Long id,
                                       @RequestBody Employee employee) {
        return es1.updateEmployee(id,employee);
    }
}


