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
@Table(name = "Payment")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Payment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4012660469055195090L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Setter
	@Getter
	@Column(name = "id")
	private Long id;

	@Setter
	@Getter
	@Column(name = "cardId")
	private Long cardId;

	@Setter
	@Getter
	@Column(name = "userId")
	private Long userId;

	@Setter
	@Getter
	@Column(name = "houseId")
	private Long houseId;

	@Setter
	@Getter
	@Column(name = "paymentMode")
	private String paymentMode;

	@Setter
	@Getter
	@Column(name = "paymentStatus")
	private String paymentStatus;

	@Setter
	@Getter
	@Column(name = "paymentDate")
	private Date paymentDate;

}
