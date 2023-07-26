package com.retailstore.retailstore.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class OnlineStoreController {

	
	 @RequestMapping(method = RequestMethod.POST, value = "/employer/create")
	public String getItems() {
		return "Mobile Phones";
	}
	
	@Getmapping("/paymentStatus")
	public String paymentStatus() {
		return "Payment Success";
	}

}
