package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.impl.EmployeeServiceimpl;

@Controller
public class EmployeeController {
	

	
	@Autowired
    EmployeeServiceimpl EmpSerImp;
	
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		return EmpSerImp.saveEmployee(employee);
		
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public  Optional<Employee> getEmployeeById(@PathVariable Integer id){
		return EmpSerImp.getEmployeeById(id);
	}
	
	@GetMapping("/gettingAllEmployee")
	public List<Employee> getAllEmployees() {
        return EmpSerImp.getAllEmployees();
    }
	
	 @PutMapping("/{id}")
	    public Employee updateEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
	      
	        return EmpSerImp.saveEmployee(employee);
	    }
	
	 @DeleteMapping("/delete/{id}")
	 @ResponseBody
	    public String deleteEmployee(@PathVariable Integer id) {
	        EmpSerImp.deleteEmployee(id);
	        return "Employee data is deleted sucessfully";
	    }
	
	 
	 @GetMapping("/dummy")
	 @ResponseBody
	public String Dummy() {
		return "Dummy method call";
	}
    
}
