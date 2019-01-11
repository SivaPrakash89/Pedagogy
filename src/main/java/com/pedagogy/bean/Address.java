package com.pedagogy.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	private String email;
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int addressId;
	private String plotNo;
	private String street;
	private String area;
	private String city;
	private String state;
	private String country;
	private long pincode;
	private String landmark;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPlotNo() {
		return plotNo;
	}
	public void setPlotNo(String plotNo) {
		this.plotNo = plotNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public Address(String email, int addressId, String plotNo, String street, String area, String city, String state, String country,
			long pincode, String landmark) {
		super();
		this.email = email;
		this.addressId=addressId;
		this.plotNo = plotNo;
		this.street = street;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.landmark = landmark;
	}
	public Address() {
		super();
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	
}

