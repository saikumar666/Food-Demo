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
@Table(name = "schedule")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Schedule implements Serializable{
	
	private static final long serialVersionUID = 514877104382906423L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Setter
	@Getter
	@Column(name = "id")
	private Long id;

	@Setter
	@Getter
	@Column(name = "userId")
	private Long userId;

	@Setter
	@Getter
	@Column(name = "homeId")
	private Long homeId;

	@Setter
	@Getter
	@Column(name = "morning")
	private String morning;

	@Setter
	@Getter
	@Column(name = "evening")
	private String evening;

	@Setter
	@Getter
	@Column(name = "dinner")
	private String dinner;

	@Setter
	@Getter
	@Column(name = "snacksOne")
	private String snacksOne;

	@Setter
	@Getter
	@Column(name = "snacksTwo")
	private String snacksTwo;

	@Setter
	@Getter
	@Column(name = "date")
	private Date date;

}
