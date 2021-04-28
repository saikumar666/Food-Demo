package com.sstc.foodbill.model;

import java.io.Serializable;

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
@Table(name = "House")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class House implements Serializable {

	private static final long serialVersionUID = 7925246258591354610L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Setter
	@Getter
	@Column(name = "id")
	private Long id;

	@Setter
	@Getter
	@Column(name = "name")
	private String name;

	@Setter
	@Getter
	@Column(name = "address")
	private String address;

	@Setter
	@Getter
	@Column(name = "imageOne")
	private String imageOne;

	@Setter
	@Getter
	@Column(name = "imageTwo")
	private String imageTwo;

	@Setter
	@Getter
	@Column(name = "imageThree")
	private String imageThree;

	@Setter
	@Getter
	@Column(name = "contactNumber")
	private String contactNumber;

	@Setter
	@Getter
	@Column(name = "emailId")
	private String emailId;

	@Setter
	@Getter
	@Column(name = "userId")
	private Long userId;

}
