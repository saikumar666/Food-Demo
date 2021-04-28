package com.sstc.foodbill.model.service;

import java.util.List;

import com.sstc.foodbill.model.Schedule;

public interface ScheduleService {
	
	
	List<Schedule> findAll();

	Schedule saveOrUpdate(Schedule schedule);

	void deletebyId(Long id);

	Schedule findById(Long id);

	Boolean isExist(Long id);

}
