package com.pizzAppl.entities;
import java.util.Date;

public class customer {
	
	private String id;
	private String name;
	private Address addr;
	private String paymentDetails;
	
	public customer() {
		this.id = new Date().toString();
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
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public String getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", addr=" + addr + ", paymentDetails=" + paymentDetails + "]";
	}
	


}
