package com.sstc.foodbill.model.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sstc.foodbill.model.House;
import com.sstc.foodbill.model.repository.HouseRepository;
import com.sstc.foodbill.model.service.HouseService;

@Service
public class HouseServiceImpl implements HouseService {

	@Autowired
	HouseRepository houseRepository;

	@Override
	public List<House> findAll() {
		return houseRepository.findAll();
	}

	@Override
	public House saveOrUpdate(House house) {
		return houseRepository.save(house);
	}

	@Override
	public void deletebyId(Long id) {
		houseRepository.deleteById(id);

	}

	@Override
	public House findById(Long id) {
		return houseRepository.getOne(id);
	}

	@Override
	public Boolean isExist(Long id) {
		return houseRepository.existsById(id);
	}

}
