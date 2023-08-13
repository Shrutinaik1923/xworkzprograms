package com.xworkz.encapsulation.app;

public class NammaYatri {
	    private String passengerName;
	    private String sourceLocation;
	    private String destinationLocation;
	    private String travelDate;
	    private String travelTime;
	    private String ticketType;
	    private String coachType;
	    private double ticketPrice;
	    private boolean isReturnTicket;
	    private boolean isSeniorCitizen;
	    private boolean isStudent;
	    private boolean hasLuggage;
	    private int numberOfPassengers;

	    public String getPassengerName() {
	        return passengerName;
	    }

	    public void setPassengerName(String passengerName) {
	        this.passengerName = passengerName;
	    }

	    public String getSourceLocation() {
	        return sourceLocation;
	    }

	    public void setSourceLocation(String sourceLocation) {
	        this.sourceLocation = sourceLocation;
	    }

	    public String getDestinationLocation() {
	        return destinationLocation;
	    }

	    public void setDestinationLocation(String destinationLocation) {
	        this.destinationLocation = destinationLocation;
	    }

	    public String getTravelDate() {
	        return travelDate;
	    }

	    public void setTravelDate(String travelDate) {
	        this.travelDate = travelDate;
	    }

	    public String getTravelTime() {
	        return travelTime;
	    }

	    public void setTravelTime(String travelTime) {
	        this.travelTime = travelTime;
	    }

	    public String getTicketType() {
	        return ticketType;
	    }

	    public void setTicketType(String ticketType) {
	        this.ticketType = ticketType;
	    }

	    public String getCoachType() {
	        return coachType;
	    }

	    public void setCoachType(String coachType) {
	        this.coachType = coachType;
	    }

	    public double getTicketPrice() {
	        return ticketPrice;
	    }

	    public void setTicketPrice(double ticketPrice) {
	        this.ticketPrice = ticketPrice;
	    }

	    public boolean isReturnTicket() {
	        return isReturnTicket;
	    }

	    public void setReturnTicket(boolean returnTicket) {
	        isReturnTicket = returnTicket;
	    }

	    public boolean isSeniorCitizen() {
	        return isSeniorCitizen;
	    }

	    public void setSeniorCitizen(boolean seniorCitizen) {
	        isSeniorCitizen = seniorCitizen;
	    }

	    public boolean isStudent() {
	        return isStudent;
	    }

	    public void setStudent(boolean student) {
	        isStudent = student;
	    }

	    public boolean hasLuggage() {
	        return hasLuggage;
	    }

	    public void setHasLuggage(boolean hasLuggage) {
	        this.hasLuggage = hasLuggage;
	    }

	    public int getNumberOfPassengers() {
	        return numberOfPassengers;
	    }

	    public void setNumberOfPassengers(int numberOfPassengers) {
	        this.numberOfPassengers = numberOfPassengers;
	    }


	}



