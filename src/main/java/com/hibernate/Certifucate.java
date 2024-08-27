package com.hibernate;

import jakarta.persistence.Embeddable;

@Embeddable
public class Certifucate {
	private String Coures;
	private String Duration;
	public Certifucate() {
		super();
		
	}
	public String getCoures() {
		return Coures;
	}
	public void setCoures(String coures) {
		Coures = coures;
	}
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
	public Certifucate(String coures, String duration) {
		super();
		Coures = coures;
		Duration = duration;
	}
	@Override
	public String toString() {
		return "Certifucate [Coures=" + Coures + ", Duration=" + Duration + "]";
	}
	
}
