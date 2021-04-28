package com.sstc.foodbill.model.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sstc.foodbill.model.Payment;
import com.sstc.foodbill.model.repository.PaymentRepository;
import com.sstc.foodbill.model.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	PaymentRepository paymentRepository;

	@Override
	public List<Payment> findAll() {
		return paymentRepository.findAll();
	}

	@Override
	public Payment saveOrUpdate(Payment payment) {
		return paymentRepository.save(payment);
	}

	@Override
	public void deletebyId(Long id) {
		paymentRepository.deleteById(id);
	}

	@Override
	public Payment findById(Long id) {
		return paymentRepository.getOne(id);
	}

	@Override
	public Boolean isExist(Long id) {
		return paymentRepository.existsById(id);
	}

}
