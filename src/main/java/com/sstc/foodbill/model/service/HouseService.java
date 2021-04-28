package com.sstc.foodbill.model.service;

import java.util.List;

import com.sstc.foodbill.model.House;

public interface HouseService {
	
	List<House> findAll();

	House saveOrUpdate(House house);

	void deletebyId(Long id);

	House findById(Long id);

	Boolean isExist(Long id);

}
