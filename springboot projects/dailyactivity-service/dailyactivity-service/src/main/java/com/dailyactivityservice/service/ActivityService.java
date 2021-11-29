package com.dailyactivityservice.service;

import java.sql.Date;
import java.util.List;

import com.dailyactivityservice.dto.ActivityDto;
import com.dailyactivityservice.dto.DailyActivitesDto;
import com.dailyactivityservice.dto.DailyActivityDto;
import com.dailyactivityservice.model.Activity;

public interface ActivityService {

	String addActivity(Activity activity) throws Exception;

	List<Activity> getAllActivities(DailyActivitesDto dailyActivitesDto) throws Exception;

	DailyActivityDto getActivityByName(String name) throws Exception;

	String editActivityDetails(ActivityDto activity) throws Exception;

	List<Activity> getActivitiesByDate(Date activityDate) throws Exception;

}
