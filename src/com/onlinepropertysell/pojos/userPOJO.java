package com.onlinepropertysell.pojos;

public class userPOJO {
	private int userId;
	private String userEmail;
	private String userName;
	private String password;
	private String phoneNumber;
	public userPOJO(int userId, String userEmail, String userName, String password, String phoneNumber) {
		super();
		this.userId = userId;
		this.userEmail = userEmail;
		this.userName = userName;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "userPOJO [userId=" + userId + ", userEmail=" + userEmail + ", userName=" + userName + ", password="
				+ password + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
	
	

}
