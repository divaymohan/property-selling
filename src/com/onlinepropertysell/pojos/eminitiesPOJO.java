package com.onlinepropertysell.pojos;

public class eminitiesPOJO {
	private int eminitiesId;
	private int propertyId;
	private float carpetArea;
	private int floors;
	private String landmark;
	private float landMarkDistance;
	private float marketDistance;
	private String comment;
	public eminitiesPOJO(int eminitiesId, int propertyId, float carpetArea, int floors, String landmark,
			float landMarkDistance, float marketDistance, String comment) {
		super();
		this.eminitiesId = eminitiesId;
		this.propertyId = propertyId;
		this.carpetArea = carpetArea;
		this.floors = floors;
		this.landmark = landmark;
		this.landMarkDistance = landMarkDistance;
		this.marketDistance = marketDistance;
		this.comment = comment;
	}
	/**
	 * @return the eminitiesId
	 */
	public int getEminitiesId() {
		return eminitiesId;
	}
	/**
	 * @param eminitiesId the eminitiesId to set
	 */
	public void setEminitiesId(int eminitiesId) {
		this.eminitiesId = eminitiesId;
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
	 * @return the carpetArea
	 */
	public float getCarpetArea() {
		return carpetArea;
	}
	/**
	 * @param carpetArea the carpetArea to set
	 */
	public void setCarpetArea(float carpetArea) {
		this.carpetArea = carpetArea;
	}
	/**
	 * @return the floors
	 */
	public int getFloors() {
		return floors;
	}
	/**
	 * @param floors the floors to set
	 */
	public void setFloors(int floors) {
		this.floors = floors;
	}
	/**
	 * @return the landmark
	 */
	public String getLandmark() {
		return landmark;
	}
	/**
	 * @param landmark the landmark to set
	 */
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	/**
	 * @return the landMarkDistance
	 */
	public float getLandMarkDistance() {
		return landMarkDistance;
	}
	/**
	 * @param landMarkDistance the landMarkDistance to set
	 */
	public void setLandMarkDistance(float landMarkDistance) {
		this.landMarkDistance = landMarkDistance;
	}
	/**
	 * @return the marketDistance
	 */
	public float getMarketDistance() {
		return marketDistance;
	}
	/**
	 * @param marketDistance the marketDistance to set
	 */
	public void setMarketDistance(float marketDistance) {
		this.marketDistance = marketDistance;
	}
	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "eminitiesPOJO [eminitiesId=" + eminitiesId + ", propertyId=" + propertyId + ", carpetArea=" + carpetArea
				+ ", floors=" + floors + ", landmark=" + landmark + ", landMarkDistance=" + landMarkDistance
				+ ", marketDistance=" + marketDistance + ", comment=" + comment + "]";
	}
	
	

}
