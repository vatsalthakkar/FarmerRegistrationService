/*
 * Authour: Vatsal Thakkar
 * Purpose: Controller for registration service  
 */

package com.kkd.registrationservice;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class KkdFarmerRegistrationServiceController {

	//Proxy instance to communicate with other service
	@Autowired
	private SaveFarmerDetailsServiceProxy proxy;

	//This will be called for registration purpose and will store data 
	@PostMapping("/farmer/register")
	public String addFarmer(@RequestBody FarmerData farmer) {
		
		String response = proxy.addFarmer(farmer);
		if(response==null) {
			return "not added";
		}
		String id=getLastUserId();
		return "successfully registered"+id;
	}
	//This service needs last user id to generate new id for new user
	public String getLastUserId() {
		String kkd_id=proxy.getLastUserId();
		return generateNewKkdId(kkd_id);
	}
	private String generateNewKkdId(String kkd_id) {
		//base value from where id will start.
		//the kk_id for first user will be kkd_1000
		int base=1000;
		//to get the number from kkd_id get substring from 9th index(0 starting index)
		String new_kkd_id="";
		try {
			new_kkd_id="kkd_farm_"+((int)Integer.valueOf(kkd_id.substring(9))+(int)1);
		}catch(Exception e) {
			return e.toString();
		}
		
		proxy.saveKkdId(new_kkd_id);
		return new_kkd_id;
	}
	
	//get one farmer,temp function to be deleted.
	//call 
	/*@GetMapping("/getOne")
	public FarmerData getOneData() {
		String [] cities=new String[3];
		cities[0]="city1";
		cities[1]="city2";
		cities[2]="city3";
		FarmerData temp=new FarmerData("adharNo", "mobileNo", "password", cities, "alternetNo",
				"status", 
				new CurrentAddress("pincode","state", "distric", "city","addressLine"),false, 
				new AdharData("adharNo","firstName","lastName",new Date(), "gender","fathersName","photoUrl"
				,new PermanentAddress("pincode","state", "district", "city", "addressLine")));
		
		return temp;
	}*/
}
