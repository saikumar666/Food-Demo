package com.sstc.foodbill.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sstc.foodbill.model.Cards;

@Repository
public interface CardsRepository extends JpaRepository<Cards, Long> {

}
