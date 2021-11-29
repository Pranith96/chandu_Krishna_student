package com.dailyactivityservice.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailyactivityservice.client.EmployeeClient;
import com.dailyactivityservice.dto.ActivityDto;
import com.dailyactivityservice.dto.DailyActivitesDto;
import com.dailyactivityservice.dto.DailyActivityDto;
import com.dailyactivityservice.model.Activity;
import com.dailyactivityservice.service.ActivityService;

@RefreshScope
@RestController
@RequestMapping("/dailyactivity")
public class ActivityController {

	@Autowired
	ActivityService activityService;

	@Autowired
	EmployeeClient employeeClient;

	@PostMapping("/add")
	public ResponseEntity<String> addActivity(@RequestBody Activity activity) throws Exception {
		String activityResponse = activityService.addActivity(activity);
		return ResponseEntity.status(HttpStatus.CREATED).body(activityResponse);
	}

	@GetMapping("/")
	public ResponseEntity<List<Activity>> getAllActivities(@RequestBody DailyActivitesDto dailyActivitesDto) throws Exception {
		List<Activity> activityResponse = activityService.getAllActivities(dailyActivitesDto);
		return ResponseEntity.status(HttpStatus.OK).body(activityResponse);
	}

	@GetMapping("/{name}")
	public ResponseEntity<DailyActivityDto> getActivityByName(@PathVariable("name") String name) throws Exception {
		DailyActivityDto activityResponse = activityService.getActivityByName(name);
		return ResponseEntity.status(HttpStatus.OK).body(activityResponse);
	}

	@PatchMapping("/edit")
	public ResponseEntity<String> editActivityDetails(@RequestBody ActivityDto activity) throws Exception {
		String activityResponse = activityService.editActivityDetails(activity);
		return ResponseEntity.status(HttpStatus.OK).body(activityResponse);
	}

	@GetMapping("/date/{activityDate}")
	public ResponseEntity<List<Activity>> getActivitiesByDate(
			@PathVariable("activityDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date activityDate)
			throws Exception {
		List<Activity> activityResponse = activityService.getActivitiesByDate(activityDate);
		return ResponseEntity.status(HttpStatus.OK).body(activityResponse);
	}

}
