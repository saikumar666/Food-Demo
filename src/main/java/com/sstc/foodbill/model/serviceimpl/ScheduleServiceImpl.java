package com.sstc.foodbill.model.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sstc.foodbill.model.Schedule;
import com.sstc.foodbill.model.repository.ScheduleRepository;
import com.sstc.foodbill.model.service.ScheduleService;

@Service
public class ScheduleServiceImpl implements ScheduleService {

	@Autowired
	ScheduleRepository scheduleRepository;

	@Override
	public List<Schedule> findAll() {
		return scheduleRepository.findAll();
	}

	@Override
	public Schedule saveOrUpdate(Schedule schedule) {
		return scheduleRepository.save(schedule);
	}

	@Override
	public void deletebyId(Long id) {

	}

	@Override
	public Schedule findById(Long id) {
		return scheduleRepository.getOne(id);
	}

	@Override
	public Boolean isExist(Long id) {
		return scheduleRepository.existsById(id);
	}

}
