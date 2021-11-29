package com.dailyactivityservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.employee.model.Employee;

@FeignClient(name = "EMPLOYEE-CLIENT", url = "http://localhost:9090", path = "/api/employee")
public interface EmployeeClient {

	@GetMapping("/{code}")
	public Employee getEmployee(@PathVariable("code") Integer code);
	
	@GetMapping("/name/{name}")
	public Employee getEmployeeByName(@PathVariable("name") String name);
}
