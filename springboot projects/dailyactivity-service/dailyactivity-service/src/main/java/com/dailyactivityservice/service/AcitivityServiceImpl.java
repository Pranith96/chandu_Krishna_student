package com.dailyactivityservice.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailyactivityservice.client.EmployeeClient;
import com.dailyactivityservice.dto.ActivityDto;
import com.dailyactivityservice.dto.DailyActivitesDto;
import com.dailyactivityservice.dto.DailyActivityDto;
import com.dailyactivityservice.model.Activity;
import com.dailyactivityservice.repository.ActivityRepository;
import com.employee.model.Employee;

@Service
@Transactional
public class AcitivityServiceImpl implements ActivityService {

	@Autowired
	ActivityRepository activityRepository;

	@Autowired
	EmployeeClient employeeClient;

	@Override
	public String addActivity(Activity activity) throws Exception {
		Employee employee = employeeClient.getEmployeeByName(activity.getEmployeeName());
		if (employee == null) {
			throw new Exception("Data not found");
		}

		activity.setEmployeeName(employee.getName());
		Activity response = activityRepository.save(activity);
		if (response == null) {
			return "Activity Details not Added Successfully";
		}
		return "Activity Details Added Successfully";
	}

	@Override
	public List<Activity> getAllActivities(DailyActivitesDto dailyActivitesDto) throws Exception {
		Date fromDate = dailyActivitesDto.getFromDate();
		Date toDate = dailyActivitesDto.getToDate();
		List<Activity> response = activityRepository.getAllActivitiesByDates(fromDate, toDate);
		if (null == response || response.isEmpty()) {
			throw new Exception("Activity Details are empty");
		}
		return response;
	}

	@Override
	public DailyActivityDto getActivityByName(String name) throws Exception {

		Optional<Activity> response = activityRepository.findByEmployeeName(name);
		if (!response.isPresent()) {
			throw new Exception("Activity details not found");
		}

		Employee employee = employeeClient.getEmployeeByName(name);
		if (employee == null) {
			throw new Exception("Data not found");
		}

		DailyActivityDto dailyActivityDto = new DailyActivityDto();
		dailyActivityDto.setEmployeeName(response.get().getEmployeeName());
		dailyActivityDto.setJobTitle(employee.getJobTitle());
		dailyActivityDto.setEmailId(employee.getEmailId());
		dailyActivityDto.setActivityStatus(response.get().getActivityStatus());
		dailyActivityDto.setActivityDescription(response.get().getActivityDescription());
		dailyActivityDto.setActivityDate(response.get().getActivityDate());
		return dailyActivityDto;
	}

	@Override
	public String editActivityDetails(ActivityDto activity) throws Exception {
		Optional<Activity> response = activityRepository.findByEmployeeName(activity.getEmployeeName());
		if (!response.isPresent()) {
			throw new Exception("Activity details not found");
		}

		if (activity.getActivityDescription() != null) {
			response.get().setActivityDescription(activity.getActivityDescription());
		}
		if (activity.getActivityStatus() != null) {
			response.get().setActivityStatus(activity.getActivityStatus());
		}
		activityRepository.save(response.get());

		return "Daily Activity Edited Successfiully";
	}

	@Override
	public List<Activity> getActivitiesByDate(Date activityDate) throws Exception {
		List<Activity> response = activityRepository.findByActivityDate(activityDate);
		if (null == response || response.isEmpty()) {
			throw new Exception("Activity details are empty for given date");
		}
		return response;
	}

}
