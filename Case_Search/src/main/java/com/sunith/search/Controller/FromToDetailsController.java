package com.sunith.search.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sunith.search.Service.FromToDetailsService;
import com.sunith.search.model.flightDetails;

@RestController
public class FromToDetailsController {
	
	/* GuestUser */
	 @Autowired
	 FromToDetailsService Service;
	 
	 @GetMapping("/flightdetails/{dep1}/{des1}/{date}") 
	 public List<flightDetails> getAllflightDetails(@PathVariable String dep1,@PathVariable String des1,@PathVariable String date) {
		 
		return Service.getAllflightDetails(dep1, des1,date);
	}
	
	
}
