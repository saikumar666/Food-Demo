package com.sstc.foodbill.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sstc.foodbill.model.Schedule;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

}
