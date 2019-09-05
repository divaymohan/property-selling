package com.onlinepropertysell.pojos;

public class imagesPOJO {
	private int imageId;
	private int propertyId;
	private String imageType;
	private String imagePath;
	public imagesPOJO(int imageId, int propertyId, String imageType, String imagePath) {
		super();
		this.imageId = imageId;
		this.propertyId = propertyId;
		this.imageType = imageType;
		this.imagePath = imagePath;
	}
	/**
	 * @return the imageId
	 */
	public int getImageId() {
		return imageId;
	}
	/**
	 * @param imageId the imageId to set
	 */
	public void setImageId(int imageId) {
		this.imageId = imageId;
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
	 * @return the imageType
	 */
	public String getImageType() {
		return imageType;
	}
	/**
	 * @param imageType the imageType to set
	 */
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	/**
	 * @return the imagePath
	 */
	public String getImagePath() {
		return imagePath;
	}
	/**
	 * @param imagePath the imagePath to set
	 */
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "imagesPOJO [imageId=" + imageId + ", propertyId=" + propertyId + ", imageType=" + imageType
				+ ", imagePath=" + imagePath + "]";
	}
	
	
	

}
