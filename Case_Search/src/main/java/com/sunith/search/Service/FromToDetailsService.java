package com.sunith.search.Service;

import java.util.ArrayList;
import com.sunith.search.repo.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunith.search.model.flightDetails;
@Service
public class FromToDetailsService {


	@Autowired
	flightDetailsRepository flightRepository;
	/* FromToDetails fromToDetails; */
	

	public  List<flightDetails> getAllflightDetails(String dep1,String des1,String date) {
		
		List<flightDetails> flights = new ArrayList<flightDetails>();
		List<flightDetails> Match = new ArrayList<flightDetails>();
		
		flightRepository.findAll().forEach(e1 -> flights.add(e1)); 
		
		
		  for(flightDetails f: flights) {
		  if(f.getDeparture().equals(dep1) && f.getDestination().equals(des1) && f.getDate().equals(date))
		  { 
			  Match.add(f);
			  
		  
		  }
		  }
		 
		
		System.out.println(Match);
		return Match;
		
		 
	}



	public void save(flightDetails f1) {
		
		flightRepository.save(f1);		
	}
	
	public int getId() {
		
		return 0;
	}

	
	
	/* Admin */
	
	public List<flightDetails> getflightDetails() {
		List<flightDetails> f2 = new ArrayList<flightDetails>();
		flightRepository.findAll().forEach(e1 -> f2.add(e1));
		return f2; 
		
			
		}


	public flightDetails getflightDetailsByName(String id) {
		return flightRepository.findById(id).get(); 
	}



	public String deleteflightDetails(String id) {
		flightRepository.deleteById(id);
		return ("Deleted flight id "+id);
		
	}



	public void saveOrUpdate(flightDetails data) {
		flightRepository.save(data); 
		
	}
	

	

}
