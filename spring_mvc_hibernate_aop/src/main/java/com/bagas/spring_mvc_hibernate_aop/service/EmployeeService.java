package com.bagas.spring_mvc_hibernate_aop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bagas.spring_mvc_hibernate_aop.Employee;
import com.bagas.spring_mvc_hibernate_aop.dao.EmployeeDAO;

public interface EmployeeService {
	
	
	
	public List<Employee> getAllEmployees();
	
	public void saveEmployee(Employee employee);
	
	public Employee getEmployee(int id);
	
	public void deleteEmployee(int id);
	
}
