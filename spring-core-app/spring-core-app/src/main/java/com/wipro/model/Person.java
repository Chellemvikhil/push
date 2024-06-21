package com.wipro.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
	private Long adharCard;
	private String name;
	private LocalDate birthdate;
	
	//The @Autowired is byType   by default
//	@Autowired
//	private Address temporaryAddress;
//	@Autowired
//	private Address permanentAddress;
	
	
	// The @Autowired changed to byName
	@Autowired(required = false)
	@Qualifier(value = "addressBean1")
	private Address temporaryAddress;
	@Autowired(required = false)
	@Qualifier(value = "addressBean2")
	private Address permanentAddress;
	
	
	public Person() {
		
	}


	public Person(Long adharCard, String name, LocalDate birthdate, Address temporaryAddress,
			Address permanentAddress) {
		super();
		this.adharCard = adharCard;
		this.name = name;
		this.birthdate = birthdate;
		this.temporaryAddress = temporaryAddress;
		this.permanentAddress = permanentAddress;
	}
	
	
	public Person(Long adharCard, String name, String birthdate, Address temporaryAddress,
			Address permanentAddress) {
		super();
		this.adharCard = adharCard;
		this.name = name;
		this.birthdate = LocalDate.parse(birthdate);
		this.temporaryAddress = temporaryAddress;
		this.permanentAddress = permanentAddress;
	}


	public Long getAdharCard() {
		return adharCard;
	}


	public void setAdharCard(Long adharCard) {
		this.adharCard = adharCard;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public LocalDate getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public void setCustomBirthdate(String birthdate) {
		this.birthdate = LocalDate.parse(birthdate);
	}

	public Address getTemporaryAddress() {
		return temporaryAddress;
	}


	public void setTemporaryAddress(Address temporaryAddress) {
		this.temporaryAddress = temporaryAddress;
	}


	public Address getPermanentAddress() {
		return permanentAddress;
	}


	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}


	@Override
	public String toString() {
		return "Person [adharCard=" + adharCard + ", name=" + name + ", birthdate=" + birthdate + ", temporaryAddress="
				+ temporaryAddress + ", permanentAddress=" + permanentAddress + "]";
	}
	
	
	
	
}
