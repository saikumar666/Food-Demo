package com.sstc.foodbill.model.service;

import java.util.List;

import com.sstc.foodbill.model.Payment;

public interface PaymentService {
	
	List<Payment> findAll();

	Payment saveOrUpdate(Payment payment);

	void deletebyId(Long id);

	Payment findById(Long id);

	Boolean isExist(Long id);

}
