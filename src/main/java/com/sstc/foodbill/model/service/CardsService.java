package com.sstc.foodbill.model.service;

import java.util.List;

import com.sstc.foodbill.model.Cards;

public interface CardsService {

	List<Cards> findAll();

	Cards saveOrUpdate(Cards cards);

	void deletebyId(Long id);

	Cards findById(Long id);

	Boolean isExist(Long id);

}
