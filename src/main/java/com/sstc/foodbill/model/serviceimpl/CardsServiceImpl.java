package com.sstc.foodbill.model.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sstc.foodbill.model.Cards;
import com.sstc.foodbill.model.repository.CardsRepository;
import com.sstc.foodbill.model.service.CardsService;

@Service
public class CardsServiceImpl implements CardsService {

	@Autowired
	CardsRepository crepo;

	@Override
	public List<Cards> findAll() {
		return crepo.findAll();
	}

	@Override
	public Cards saveOrUpdate(Cards cards) {
		return crepo.save(cards);
	}

	@Override
	public void deletebyId(Long id) {
		crepo.deleteById(id);
	}

	@Override
	public Cards findById(Long id) {
		return crepo.getOne(id);
	}

	@Override
	public Boolean isExist(Long id) {
		return crepo.existsById(id);
	}

}
