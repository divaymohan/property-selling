package com.onlineproperty.getFilteredProperties;

public class getFilteredPropertiesPOJO {
	private String cityName;
	private String landmark;
	private String order;
	private String propertyType;
	public getFilteredPropertiesPOJO(String cityName, String landmark, String order, String propertyType) {
		super();
		this.cityName = cityName;
		this.landmark = landmark;
		this.order = order;
		this.propertyType = propertyType;
	}
	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
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
	 * @return the order
	 */
	public String getOrder() {
		return order;
	}
	/**
	 * @param order the order to set
	 */
	public void setOrder(String order) {
		this.order = order;
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
		return "getFilteredPropertiesPOJO [cityName=" + cityName + ", landmark=" + landmark + ", order=" + order
				+ ", propertyType=" + propertyType + "]";
	}
	
	
	
}