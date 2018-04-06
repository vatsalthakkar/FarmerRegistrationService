/*
 * Authour: Vatsal Thakkar
 * Purpose: Proxy for feign client 
 */
package com.kkd.registrationservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



/*url and name to be changed. not hardcoded url. just temp.*/ 
@FeignClient(name="save-farmer-details-service",url="localhost:8000")
public interface SaveFarmerDetailsServiceProxy {

	//Post mapping to be changed
	@PostMapping("/farmer/register")
	public String addFarmer(@RequestBody FarmerData farmer);
	@GetMapping("/lastUserId")
	public String getLastUserId();
	@PostMapping("/savekkdid")
	public void saveKkdId(@RequestBody String new_kkd_id);
	
}
