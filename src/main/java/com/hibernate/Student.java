package com.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private  int id;
	private String name;
	private String city;
	
	private Certifucate cert;

	public Student(int id, String name, String city, Certifucate cert) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.cert = cert;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Certifucate getCert() {
		return cert;
	}

	public void setCert(Certifucate cert) {
		this.cert = cert;
	}

	@Override
	public String toString() {
		return this.id+" "+this.name+" "+this.city;
	}
	
	
	

}
