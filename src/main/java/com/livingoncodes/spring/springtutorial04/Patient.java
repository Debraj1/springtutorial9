package com.livingoncodes.spring.springtutorial04;

public class Patient {
	
	private String id;
	private String name;
	
	private String nationalId;
	
	private Address address;
	
	
	
	
	
	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public Patient(String id, String name, String nationalId) {
		super();
		this.id = id;
		this.name = name;
		this.nationalId = nationalId;
	}


//national id
	public String getNationalId() {
		return nationalId;
	}



	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}


//patient
	public Patient() {
		super();
	}



	public Patient(String id, String name) {
		
		this.id = id;
		this.name = name;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void speak() {
		System.out.println("Help me!");
	}



	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", nationalId=" + nationalId + ", address=" + address + "]";
	}
	

}
