/*
 *  Author:Vatsal Thakkar
 *  Purpose: To get all the data of farmer.
 */


package com.kkd.registrationservice;

import org.springframework.beans.factory.annotation.Autowired;

public class FarmerData {
	/*Adhar no. required to get all the details for farmer*/
	private String adharNo="";
	private String mobileNo="";
	private String password="";
	private String [] cities;
	private String  alternateNo="";
	private String status="";//Active or Inactive
	@Autowired
	CurrentAddress currentAddress;
	private boolean autoConfirm=false;//false by default
	@Autowired
	AdharData adharData;
	public FarmerData() {
		
	}
	
	public FarmerData(String adharNo, String mobileNo, String password, String[] cities, String alternateNo,
			String status, CurrentAddress currentAddress, boolean autoConfirm, AdharData adharData) {
		super();
		this.adharNo = adharNo;
		this.mobileNo = mobileNo;
		this.password = password;
		this.cities = cities;
		this.alternateNo = alternateNo;
		this.status = status;
		this.currentAddress = currentAddress;
		this.autoConfirm = autoConfirm;
		this.adharData = adharData;
	}

	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String[] getCities() {
		return cities;
	}
	public void setCities(String[] cities) {
		this.cities = cities;
	}
	public String getAlternateNo() {
		return alternateNo;
	}
	public void setAlternateNo(String alternateNo) {
		this.alternateNo = alternateNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public CurrentAddress getCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(CurrentAddress currentAddress) {
		this.currentAddress = currentAddress;
	}
	public boolean isAutoConfirm() {
		return autoConfirm;
	}
	public void setAutoConfirm(boolean autoConfirm) {
		this.autoConfirm = autoConfirm;
	}
	public AdharData getAdharData() {
		return adharData;
	}
	public void setAdharData(AdharData adharData) {
		this.adharData = adharData;
	}
	
}
