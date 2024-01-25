package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EmployeeNew")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Emp_Id")
   private Integer EmployeeId;
	@Column(name="Emp_Name")
   private String EmployeeName;
   @Column(name="Emp_Salary")
   private Double EmployeeSalary;
   @Column(name="Emp_Desgn")
   private String Desgination;
   
   
   
   
   
   
   
   
   
}
