package com.kkd.registrationservice;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

public class AdharData {
	
	private String adharNo="";
	private String firstName="";
	private String lastName="";
	private Date dob;
	private String gender="";
	private String fathersName="";
	private String photoUrl="";
	@Autowired
	private PermanentAddress permanentAddress;
	public AdharData() {
		
	}
	public AdharData(String adharNo, String firstName, String lastName, Date dob, String gender, String fathersName,
			String photoUrl, PermanentAddress permanentAddress) {
		super();
		this.adharNo = adharNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.fathersName = fathersName;
		this.photoUrl = photoUrl;
		this.permanentAddress = permanentAddress;
	}

	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFathersName() {
		return fathersName;
	}
	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public PermanentAddress getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(PermanentAddress permanentAddress) {
		this.permanentAddress = permanentAddress;
	}	
}
