package com.employee.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.exception.EmployeeNoContentException;
import com.employee.exception.EmployeeNotFoundException;
import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public String addEmployee(Employee employee) {
		Employee response = employeeRepository.save(employee);
		if (response == null) {
			return "Employee Details not Added Successfully";
		}
		return "Employee Details Added Successfully";
	}

	@Override
	public List<Employee> getAllEmployees() throws EmployeeNoContentException {
		List<Employee> response = employeeRepository.findAll();
		if (null == response || response.isEmpty()) {
			throw new EmployeeNoContentException("Employee Details are empty");
		}
		return response;
	}

	@Override
	public Employee getEmployee(Integer code) throws EmployeeNotFoundException {
		Employee response = employeeRepository.findById(code)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee details not found"));
		return response;
	}

	@Override
	public String editEmployee(Employee employee) throws EmployeeNotFoundException {
		Employee response = employeeRepository.findById(employee.getCode())
				.orElseThrow(() -> new EmployeeNotFoundException("Employee details not found"));

		if (employee.getName() != null) {
			response.setName(employee.getName());
		}
		if (employee.getEmailId() != null) {
			response.setEmailId(employee.getEmailId());
		}
		if (employee.getExperience() != null) {
			response.setExperience(employee.getExperience());
		}
		if (employee.getJobTitle() != null) {
			response.setJobTitle(employee.getJobTitle());
		}
		if (employee.getLocation() != null) {
			response.setLocation(employee.getLocation());
		}
		if (employee.getPhoneNumber() != null) {
			response.setPhoneNumber(employee.getPhoneNumber());
		}
		if (employee.getProjectStatus() != null) {
			response.setProjectStatus(employee.getProjectStatus());
		}

		employeeRepository.save(response);
		return "Employee Details Edited Successfully";
	}

	@Override
	public Employee getEmployeeByName(String name) throws EmployeeNotFoundException {
		Employee response = employeeRepository.findByName(name)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee details not found"));
		return response;
	}

}
