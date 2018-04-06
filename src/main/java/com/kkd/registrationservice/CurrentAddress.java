package com.kkd.registrationservice;

public class CurrentAddress {
	
	private String pincode="";
	private String state="";
	private String distric="";
	private String city="";
	private String addressLine="";
	public CurrentAddress() {
		super();
	}
	public CurrentAddress(String pincode, String state, String distric, String city, String addressLine) {
		super();
		this.pincode = pincode;
		this.state = state;
		this.distric = distric;
		this.city = city;
		this.addressLine = addressLine;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistric() {
		return distric;
	}
	public void setDistric(String distric) {
		this.distric = distric;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
}
