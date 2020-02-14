package com.poc.service;

import java.util.List;
import java.util.Optional;

import com.poc.model.Employee;

public interface EmployeeService {
	public String addEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	public void deleteEmployee(Integer id);
	public Optional<Employee> getEmployeeById(Integer id);
	public List<Employee> getAllEmployeesLessThanEnteredSalary(Double d);
	public List<Employee> getAllEmployeesGreaterThanEnteredSalary(Double d);
}
