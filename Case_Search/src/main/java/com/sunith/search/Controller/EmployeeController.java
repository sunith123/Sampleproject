package com.sunith.search.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sunith.search.Service.EmployeeService;
import com.sunith.search.model.FromToDetails;
import com.sunith.search.model.flightDetails;

@RestController
public class EmployeeController {
	
	
	@Autowired
	EmployeeService employeeService;
	 @GetMapping("/employee") 
	 public List<flightDetails> getAllEmployee() {
		return employeeService.getAllEmployee();
	}
	
	  @PostMapping("/details") 
	  public void Match(@RequestBody FromToDetails fromToDetails) 
	  { 
		  
		  System.out.println(fromToDetails);
	       employeeService.Matching(fromToDetails);
			  
	  }

	
	
	  @PostMapping("/employee") 
	  public int saveEmployee(@RequestBody flightDetails employee) 
	  { employeeService.save(employee);
	  
	  return employeeService.getId(); }
	 
}
