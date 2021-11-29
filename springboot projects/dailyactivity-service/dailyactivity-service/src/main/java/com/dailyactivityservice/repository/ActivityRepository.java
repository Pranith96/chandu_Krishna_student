package com.dailyactivityservice.repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

import com.dailyactivityservice.model.Activity;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Integer> {

	Optional<Activity> findByEmployeeName(String name);

	List<Activity> findByActivityDate(Date activityDate);

	@Query("select a from Activity a where a.activityDate BETWEEN :fromDate AND :toDate")
	List<Activity> getAllActivitiesByDates(@Param("fromDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate,
			@Param("toDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date toDate);

}
