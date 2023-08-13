package com.xworkz.encapsulation.app;

public class Uber {
		private String driverName;
	    private String carModel;
	    private String licensePlate;
	    private double currentLatitude;
	    private double currentLongitude;
	    private int passengers;
	    private double ridePrice;
	    private boolean available;
	    private double ratings;
	    private int totalRides;
	    private String paymentMethod;
	    private String promoCode;
	    private boolean onTrip;
	    private String destination;



	    public String getDriverName() {
	        return this.driverName;
	    }

	    public void setDriverName(String driverName) {
	        this.driverName = driverName;
	    }

	    public String getCarModel() {
	        return this.carModel;
	    }

	    public void setCarModel(String carModel) {
	        this.carModel = carModel;
	    }

	    public String getLicensePlate() {
	        return this.licensePlate;
	    }

	    public void setLicensePlate(String licensePlate) {
	        this.licensePlate = licensePlate;
	    }

	    public double getCurrentLatitude() {
	        return this.currentLatitude;
	    }

	    public void setCurrentLatitude(double currentLatitude) {
	        this.currentLatitude = currentLatitude;
	    }

	    public double getCurrentLongitude() {
	        return this.currentLongitude;
	    }

	    public void setCurrentLongitude(double currentLongitude) {
	        this.currentLongitude = currentLongitude;
	    }

	    public int getPassengers() {
	        return this.passengers;
	    }

	    public void setPassenger(int passengers) {
	        this.passengers=passengers;
	    }

	    public double getRidePrice() {
	        return this.ridePrice;
	    }

	    public void setRidePrice(double ridePrice) {
	        this.ridePrice = ridePrice;
	    }

	    public boolean isAvailable() {
	        return this.available;
	    }

	    public void setAvailable(boolean available) {
	        this.available = available;
	    }

	    public double getRatings() {
	        return this.ratings;
	    }

	    public void setRating(double ratings) {
	        this.ratings=ratings;
	    }

	    public int getTotalRides() {
	        return totalRides;
	    }

	    public void setTotalRides(int totalRides) {
	        this.totalRides = totalRides;
	    }

	    public String getPaymentMethod() {
	        return paymentMethod;
	    }

	    public void setPaymentMethod(String paymentMethod) {
	        this.paymentMethod = paymentMethod;
	    }

	    public String getPromoCode() {
	        return promoCode;
	    }

	    public void setPromoCode(String promoCode) {
	        this.promoCode = promoCode;
	    }

	    public boolean isOnTrip() {
	        return this.onTrip;
	    }

	    public void setOnTrip(boolean onTrip) {
	        this.onTrip = onTrip;
	    }

	    public String getDestination() {
	        return destination;
	    }

	    public void setDestination(String destination) {
	        this.destination = destination;
	    }

	}
	 