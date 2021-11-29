package com.employee.service;

import java.util.List;

import com.employee.exception.EmployeeNoContentException;
import com.employee.exception.EmployeeNotFoundException;
import com.employee.model.Employee;

public interface EmployeeService {

	String addEmployee(Employee employee);

	List<Employee> getAllEmployees() throws EmployeeNoContentException;

	Employee getEmployee(Integer code) throws EmployeeNotFoundException;

	String editEmployee(Employee employee) throws EmployeeNotFoundException;

	Employee getEmployeeByName(String name) throws EmployeeNotFoundException;

}
