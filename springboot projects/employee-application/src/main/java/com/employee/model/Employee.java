package com.employee.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_table")
public class Employee {

	@Id
	private Integer code;
	private String name;
	private String jobTitle;
	private String emailId;
	private String experience;
	private String phoneNumber;
	private String location;
	private String projectStatus;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getProjectStatus() {
		return projectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}

	public Employee(Integer code, String name, String jobTitle, String emailId, String experience, String phoneNumber,
			String location, String projectStatus) {
		this.code = code;
		this.name = name;
		this.jobTitle = jobTitle;
		this.emailId = emailId;
		this.experience = experience;
		this.phoneNumber = phoneNumber;
		this.location = location;
		this.projectStatus = projectStatus;
	}

	public Employee() {
	}

	@Override
	public String toString() {
		return "Employee [code=" + code + ", name=" + name + ", jobTitle=" + jobTitle + ", emailId=" + emailId
				+ ", experience=" + experience + ", phoneNumber=" + phoneNumber + ", location=" + location
				+ ", projectStatus=" + projectStatus + "]";
	}

}
