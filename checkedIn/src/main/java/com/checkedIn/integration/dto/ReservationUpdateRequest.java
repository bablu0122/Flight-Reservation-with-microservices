package com.checkedIn.integration.dto;

public class ReservationUpdateRequest {

	private Long id;
	private int numberOfBags;
	private boolean checkInStatus;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	public boolean isCheckInStatus() {
		return checkInStatus;
	}
	public void setCheckInStatus(boolean checkInStatus) {
		this.checkInStatus = checkInStatus;
	}
	
	
}
