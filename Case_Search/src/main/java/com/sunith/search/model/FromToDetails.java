package com.sunith.search.model;

public class FromToDetails {
	
	
	private String from;
	private String to;
	
	public FromToDetails(String from, String to) {
		super();
		this.from = from;
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public String getTo() {
		return to;
	}
	
	@Override
	public String toString() {
		return "FromToDetails [From=" + from + ", To=" + to + "]";
	}
	
	
}
