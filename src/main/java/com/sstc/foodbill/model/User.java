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
@Table(name = "user")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class User implements Serializable {

	private static final long serialVersionUID = -6239051412087335544L;

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
	@Column(name = "parentName")
	private String parentName;

	@Setter
	@Getter
	@Column(name = "idProof")
	private String idProof;

	@Setter
	@Getter
	@Column(name = "password")
	private String password;

	@Setter
	@Getter
	@Column(name = "address")
	private String address;

	@Setter
	@Getter
	@Column(name = "phoneNumber")
	private String phoneNumber;

	@Setter
	@Getter
	@Column(name = "email")
	private String email;

	@Setter
	@Getter
	@Column(name = "imagePath")
	private String imagePath;

	@Setter
	@Getter
	@Column(name = "role")
	private String role;

	@Setter
	@Getter
	@Column(name = "createdDate")
	private Date createdDate;

	@Setter
	@Getter
	@Column(name = "active")
	private String active;

}
