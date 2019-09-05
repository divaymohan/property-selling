package com.onlinepropertysell.pojos;

public class userAddressPOJO {
	private int addressId;
	private int userId;
	private String street;
	private String areaName;
	private String city;
	private int pinNumber;
	public userAddressPOJO(int addressId, int userId, String street, String areaName, String city, int pinNumber) {
		super();
		this.addressId = addressId;
		this.userId = userId;
		this.street = street;
		this.areaName = areaName;
		this.city = city;
		this.pinNumber = pinNumber;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	@Override
	public String toString() {
		return "userAddressPOJO [addressId=" + addressId + ", userId=" + userId + ", street=" + street + ", areaName="
				+ areaName + ", city=" + city + ", pinNumber=" + pinNumber + "]";
	}
	
	

}
