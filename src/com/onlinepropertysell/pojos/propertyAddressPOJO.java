package com.onlinepropertysell.pojos;

public class propertyAddressPOJO {
	private int propertyAddressId;
	private int propertyId;
	private String locality;
	private int floor;
	private String city;
	private String street;
	private int pinNumber;
	public propertyAddressPOJO(int propertyAddressId, int propertyId, String locality, int floor, String city,
			String street, int pinNumber) {
		super();
		this.propertyAddressId = propertyAddressId;
		this.propertyId = propertyId;
		this.locality = locality;
		this.floor = floor;
		this.city = city;
		this.street = street;
		this.pinNumber = pinNumber;
	}
	public int getPropertyAddressId() {
		return propertyAddressId;
	}
	public void setPropertyAddressId(int propertyAddressId) {
		this.propertyAddressId = propertyAddressId;
	}
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	@Override
	public String toString() {
		return "propertyAddressPOJO [propertyAddressId=" + propertyAddressId + ", propertyId=" + propertyId
				+ ", locality=" + locality + ", floor=" + floor + ", city=" + city + ", street=" + street
				+ ", pinNumber=" + pinNumber + "]";
	}
	
	

}
