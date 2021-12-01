package com.sunith.search.Service;

import java.util.ArrayList;
import com.sunith.search.repo.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunith.search.Controller.EmployeeController;
import com.sunith.search.model.FromToDetails;
import com.sunith.search.model.flightDetails;
@Service
public class EmployeeService {
public static String dep;
public static String des;
	@Autowired
	flightDetailsRepository employeeRepository;
	FromToDetails fromToDetails;


	public  List<flightDetails> getAllEmployee() {
		System.out.println(dep +"inside  "+  des);
		
		List<flightDetails> flights = new ArrayList<flightDetails>();
		List<flightDetails> Match = new ArrayList<flightDetails>();
		
		employeeRepository.findAll().forEach(e1 -> flights.add(e1)); 
		
		
		  for(flightDetails f: flights) {
		  if(f.getDeparture().equals("Kochi") && f.getDestination().equals("Chennai"))
		  { 
			  Match.add(f);
			  System.out.println(Match);
		  
		  }
		  }
		 
		
		
		return Match;
		
		 
	}


	
	  public void Matching(FromToDetails fromToDetails) {
	  
	  
	  String dep = fromToDetails.getFrom(); String des = fromToDetails.getTo();
	  
	  
	  System.out.println(dep +"  "+ des); }
	 
	

	public void save(flightDetails employee) {
		
		employeeRepository.save(employee);
		
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	

	

	

	

}
