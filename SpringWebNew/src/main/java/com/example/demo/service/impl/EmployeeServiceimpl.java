package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceimpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository EmpRep;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return EmpRep.findAll();
	}

	@Override
	public Optional<Employee> getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return EmpRep.findById(id);
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return EmpRep.save(employee);
	}

	@Override
	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		EmpRep.deleteById(id);
		
	}

	
}
