package annotation;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "ADDRESS")
	private String address;
	@Transient
	private boolean x;
	
	 @Column(length = 100,name ="CITY" )
	private String city;
	 @Column(name = "added_date")
	private Date date;
	public Address(int id, String name, String address, boolean x, String city, Date date) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.x = x;
		this.city = city;
		this.date = date;
	}
	public Address() {
		super();
		  
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isX() {
		return x;
	}
	public void setX(boolean x) {
		this.x = x;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	

}
