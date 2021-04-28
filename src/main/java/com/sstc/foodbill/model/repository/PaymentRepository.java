package com.sstc.foodbill.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sstc.foodbill.model.Payment;
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
