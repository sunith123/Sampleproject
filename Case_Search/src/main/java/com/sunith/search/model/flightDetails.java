package com.sunith.search.model;

import org.springframework.data.annotation.Id;

public class flightDetails {
	    @Id
		private String flightId;
		private String departure;
		private String destination;
		private int price;
		public flightDetails(String flightId, String departure, String destination, int price) {
			super();
			this.flightId = flightId;
			this.departure = departure;
			this.destination = destination;
			this.price = price;
		}
		@Override
		public String toString() {
			return "FlightDetails [FlightId=" + flightId + ", departure=" + departure + ", destination=" + destination
					+ ", price=" + price + "]";
		}
		public String getFlightId() {
			return flightId;
		}
		public String getDeparture() {
			return departure;
		}
		public String getDestination() {
			return destination;
		}
		public int getPrice() {
			return price;
		}
}
