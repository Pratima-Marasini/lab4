package com.example.demo.client;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	
	@ManyToOne
	private Address address;
	@OneToMany
	private List<Account> account;
	
	public Customer(String string, String string2) {}
	/*
	public Customer( String firstName,String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	*/
	
public Customer(String firstName, String lastName, com.example.demo.client.Address address,
			List<com.example.demo.client.Account> account) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.account = account;
	}

public Address getAddress() {
		return address;
	}

 

}
