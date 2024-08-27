package com.tut;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Transient;
@Entity
public class Student_Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Address_id")
	private	int Addressid;
	
	@Column(name = "Street",length = 50)
	private String street;
	
	@Column(name = "CITY", length = 50)
	private String city;
	@Column(name = "is_Open")
	private boolean isOpen;
	@Transient
	private double x;
	
	private Date addeDate;
	@Lob
	private byte[] image;
	public Student_Address(int addressid, String street, String city, boolean isOpen, double x, Date addeDate,
			byte[] image) {
		super();
		Addressid = addressid;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addeDate = addeDate;
		this.image = image;
	}
	public Student_Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAddressid() {
		return Addressid;
	}
	public void setAddressid(int addressid) {
		Addressid = addressid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getAddeDate() {
		return addeDate;
	}
	public void setAddeDate(Date addeDate) {
		this.addeDate = addeDate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
	
	

}
