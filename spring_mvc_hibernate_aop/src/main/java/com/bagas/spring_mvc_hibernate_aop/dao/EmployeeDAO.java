package com.bagas.spring_mvc_hibernate_aop.dao;

import java.util.List;

import com.bagas.spring_mvc_hibernate_aop.Employee;

public interface EmployeeDAO {
	public List<Employee> getAllEmployees();

	public void saveEmployee(Employee employee);

	public Employee getEmployee(int id);

	public void deleteEmployee(int id);
}
