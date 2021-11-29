package com.dailyactivityservice.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "daily_activity")
public class Activity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer activityId;
	private String employeeName;
	@Column(columnDefinition = "DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@CreationTimestamp
	private LocalDateTime activityDate;
	@Size(max = 3000)
	@Column(name = "activity_description")
	private String activityDescription;
	@Size(max = 10)
	@Column(name = "activity_status")
	private String activityStatus;

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public LocalDateTime getActivityDate() {
		return activityDate;
	}

	public void setActivityDate(LocalDateTime activityDate) {
		this.activityDate = activityDate;
	}

	public String getActivityDescription() {
		return activityDescription;
	}

	public void setActivityDescription(String activityDescription) {
		this.activityDescription = activityDescription;
	}

	public String getActivityStatus() {
		return activityStatus;
	}

	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}

	public Activity(Integer activityId, String employeeName, LocalDateTime activityDate, String activityDescription,
			String activityStatus) {
		this.activityId = activityId;
		this.employeeName = employeeName;
		this.activityDate = activityDate;
		this.activityDescription = activityDescription;
		this.activityStatus = activityStatus;
	}

	public Activity() {
	}

	@Override
	public String toString() {
		return "Activity [activityId=" + activityId + ", employeeName=" + employeeName + ", activityDate="
				+ activityDate + ", activityDescription=" + activityDescription + ", activityStatus=" + activityStatus
				+ "]";
	}

}
