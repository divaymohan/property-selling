package com.onlinepropertysell.pojos;

public class userTypePOJO {
	private int userTyteId;
	private int userId;
	private String userType;
	public userTypePOJO(int userTyteId, int userId, String userType) {
		super();
		this.userTyteId = userTyteId;
		this.userId = userId;
		this.userType = userType;
	}
	public int getUserTyteId() {
		return userTyteId;
	}
	public void setUserTyteId(int userTyteId) {
		this.userTyteId = userTyteId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	@Override
	public String toString() {
		return "userTypePOJO [userTyteId=" + userTyteId + ", userId=" + userId + ", userType=" + userType + "]";
	}
	
	

}
