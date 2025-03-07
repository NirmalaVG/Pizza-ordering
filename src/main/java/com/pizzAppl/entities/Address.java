package com.pizzAppl.entities;

public class Address {
	private String city;
	private int pin;
	private String landmark;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	

	@Override
	public String toString() {
		return "Address [city=" + city + ", pin=" + pin + ", landmark=" + landmark + "]";
	}
	
}
