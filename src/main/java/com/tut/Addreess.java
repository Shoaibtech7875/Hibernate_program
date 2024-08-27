package com.tut;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Addreess {
	@Id
	int id;
	String name;
	String city;
	public Addreess(int id, String name, String city) {
		
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public Addreess() {
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
	@Override
	public String toString() {
		return "Addreess [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	

}
