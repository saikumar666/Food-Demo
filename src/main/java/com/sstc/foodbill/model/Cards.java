package com.sstc.foodbill.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Cards")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class Cards implements Serializable {

	private static final long serialVersionUID = -350569603202449084L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Setter
	@Getter
	private Long id;

	@Setter
	@Getter
	@Column(name = "Type")
	private String type;

	@Setter
	@Getter
	@Column(name = "cost")
	private Double cost;

	@Setter
	@Getter
	@Column(name = "duration")
	private Date duration;

}
