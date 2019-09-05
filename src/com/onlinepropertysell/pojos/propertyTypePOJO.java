package com.onlinepropertysell.pojos;

public class propertyTypePOJO {
	private int propertyTypeId;
	private int propertyId;
	private String officeType;
	private String flatType;
	private String landType;
	private String shopType;
	public propertyTypePOJO(int propertyTypeId, int propertyId, String officeType, String flatType, String landType,
			String shopType) {
		super();
		this.propertyTypeId = propertyTypeId;
		this.propertyId = propertyId;
		this.officeType = officeType;
		this.flatType = flatType;
		this.landType = landType;
		this.shopType = shopType;
	}
	public int getPropertyTypeId() {
		return propertyTypeId;
	}
	public void setPropertyTypeId(int propertyTypeId) {
		this.propertyTypeId = propertyTypeId;
	}
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	public String getOfficeType() {
		return officeType;
	}
	public void setOfficeType(String officeType) {
		this.officeType = officeType;
	}
	public String getFlatType() {
		return flatType;
	}
	public void setFlatType(String flatType) {
		this.flatType = flatType;
	}
	public String getLandType() {
		return landType;
	}
	public void setLandType(String landType) {
		this.landType = landType;
	}
	public String getShopType() {
		return shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}
	@Override
	public String toString() {
		return "propertyTypePOJO [propertyTypeId=" + propertyTypeId + ", propertyId=" + propertyId + ", officeType="
				+ officeType + ", flatType=" + flatType + ", landType=" + landType + ", shopType=" + shopType + "]";
	}
	
	

}
