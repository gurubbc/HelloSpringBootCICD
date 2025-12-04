package com.dashen;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// In SpringMVC, we used @Controller annotation
// @Controller is used to return the views (JSP)
// We are creating REST APIs
// Webservices return DATA **NOT VIEWS*
// So, here we should use @RestController annotation
// We don't have JSP files
@RestController
public class HelloController {

	@RequestMapping(value="/banks", method=RequestMethod.GET)
	public String fetchAllBanks() {
		return "returning all the bank details attempt2 3 4 5 6";
	}
	
	@RequestMapping(value="/customers", method=RequestMethod.GET)
	public String fetchAllCustomers() {
		return "returning all customers details - dummy message for testing";
	}
	
	@RequestMapping(value="/banks", method=RequestMethod.POST)
	public String createANewBank() {
		return "Successsfully created the given bank"; // this is the response, not the view name
	}
	
	@RequestMapping(value="/banks", method=RequestMethod.PUT)
	public String updateBankById() {
		return "The bank (complete) details are updated for the given bank  id"; // this is the response, not the view name
	}
	
	@RequestMapping(value="/banks", method=RequestMethod.PATCH)
	public String patchBanksById() {
		return "The bank (partial) details are updated for the given bank  id"; // this is the response, not the view name
	}
	
	@RequestMapping(value="/banks", method=RequestMethod.DELETE)
	public String deleteBankById() {
		return "The bank is deleted for  the given bank  id"; // this is the response, not the view name
	}

	
	
	

}
