package com.dailyactivityservice.dto;

import java.time.LocalDateTime;

public class DailyActivityDto {

	private String employeeName;
	private String jobTitle;
	private String emailId;
	private String activityStatus;
	private String activityDescription;
	private LocalDateTime activityDate;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
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

	public String getActivityStatus() {
		return activityStatus;
	}

	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}

	public String getActivityDescription() {
		return activityDescription;
	}

	public void setActivityDescription(String activityDescription) {
		this.activityDescription = activityDescription;
	}

	public LocalDateTime getActivityDate() {
		return activityDate;
	}

	public void setActivityDate(LocalDateTime activityDate) {
		this.activityDate = activityDate;
	}

	public DailyActivityDto() {
	}

	public DailyActivityDto(String employeeName, String jobTitle, String emailId, String activityStatus,
			String activityDescription, LocalDateTime activityDate) {
		this.employeeName = employeeName;
		this.jobTitle = jobTitle;
		this.emailId = emailId;
		this.activityStatus = activityStatus;
		this.activityDescription = activityDescription;
		this.activityDate = activityDate;
	}

	@Override
	public String toString() {
		return "DailyActivityDto [employeeName=" + employeeName + ", jobTitle=" + jobTitle + ", emailId=" + emailId
				+ ", activityStatus=" + activityStatus + ", activityDescription=" + activityDescription
				+ ", activityDate=" + activityDate + "]";
	}

}
