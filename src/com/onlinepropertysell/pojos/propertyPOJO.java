package com.onlinepropertysell.pojos;

public class propertyPOJO {
	private int propertyId;
	private int sellerId;
	private float price;
	private String status;
	private String ownerShip;
	private String overLooking;
	private String facing;
	private int propertyrating;
	private String propertyType;
	public propertyPOJO(int propertyId, int sellerId, float price, String status, String ownerShip, String overLooking,
			String facing, int propertyrating, String propertyType) {
		super();
		this.propertyId = propertyId;
		this.sellerId = sellerId;
		this.price = price;
		this.status = status;
		this.ownerShip = ownerShip;
		this.overLooking = overLooking;
		this.facing = facing;
		this.propertyrating = propertyrating;
		this.propertyType = propertyType;
	}
	/**
	 * @return the propertyId
	 */
	public int getPropertyId() {
		return propertyId;
	}
	/**
	 * @param propertyId the propertyId to set
	 */
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	/**
	 * @return the sellerId
	 */
	public int getSellerId() {
		return sellerId;
	}
	/**
	 * @param sellerId the sellerId to set
	 */
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the ownerShip
	 */
	public String getOwnerShip() {
		return ownerShip;
	}
	/**
	 * @param ownerShip the ownerShip to set
	 */
	public void setOwnerShip(String ownerShip) {
		this.ownerShip = ownerShip;
	}
	/**
	 * @return the overLooking
	 */
	public String getOverLooking() {
		return overLooking;
	}
	/**
	 * @param overLooking the overLooking to set
	 */
	public void setOverLooking(String overLooking) {
		this.overLooking = overLooking;
	}
	/**
	 * @return the facing
	 */
	public String getFacing() {
		return facing;
	}
	/**
	 * @param facing the facing to set
	 */
	public void setFacing(String facing) {
		this.facing = facing;
	}
	/**
	 * @return the propertyrating
	 */
	public int getPropertyrating() {
		return propertyrating;
	}
	/**
	 * @param propertyrating the propertyrating to set
	 */
	public void setPropertyrating(int propertyrating) {
		this.propertyrating = propertyrating;
	}
	/**
	 * @return the propertyType
	 */
	public String getPropertyType() {
		return propertyType;
	}
	/**
	 * @param propertyType the propertyType to set
	 */
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "propertyPOJO [propertyId=" + propertyId + ", sellerId=" + sellerId + ", price=" + price + ", status="
				+ status + ", ownerShip=" + ownerShip + ", overLooking=" + overLooking + ", facing=" + facing
				+ ", propertyrating=" + propertyrating + ", propertyType=" + propertyType + "]";
	}
	
	
	

}
