package com.accenture.springboot.banking.dao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Customer extends User {

	@Column(name = "ADDRESS")
	private String address;
}
