package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.exception.EmployeeNoContentException;
import com.employee.exception.EmployeeNotFoundException;
import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/add")
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
		String employeeResponse = employeeService.addEmployee(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body(employeeResponse);
	}

	@GetMapping("/")
	public ResponseEntity<List<Employee>> getAllEmployee() throws EmployeeNoContentException {
		List<Employee> employeeResponse = employeeService.getAllEmployees();
		return ResponseEntity.status(HttpStatus.OK).body(employeeResponse);
	}

	@GetMapping("/{code}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("code") Integer code) throws EmployeeNotFoundException {
		Employee employeeResponse = employeeService.getEmployee(code);
		return ResponseEntity.status(HttpStatus.OK).body(employeeResponse);
	}

	@PatchMapping("/edit")
	public ResponseEntity<String> editEmployeeDetails(@RequestBody Employee employee) throws EmployeeNotFoundException {
		String employeeResponse = employeeService.editEmployee(employee);
		return ResponseEntity.status(HttpStatus.OK).body(employeeResponse);
	}

	@GetMapping("/name/{name}")
	public ResponseEntity<Employee> getEmployeeByName(@PathVariable("name") String name) throws EmployeeNotFoundException {
		Employee employeeResponse = employeeService.getEmployeeByName(name);
		return ResponseEntity.status(HttpStatus.OK).body(employeeResponse);
	}
}
