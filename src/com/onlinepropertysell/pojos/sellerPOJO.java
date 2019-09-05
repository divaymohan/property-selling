package com.onlinepropertysell.pojos;

public class sellerPOJO {
	private int sellerId;
	private int userId;
	private String sellerType;
	private int sellerRating;
	public sellerPOJO(int sellerId, int userId, String sellerType, int sellerRating) {
		super();
		this.sellerId = sellerId;
		this.userId = userId;
		this.sellerType = sellerType;
		this.sellerRating = sellerRating;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getSellerType() {
		return sellerType;
	}
	public void setSellerType(String sellerType) {
		this.sellerType = sellerType;
	}
	public int getSellerRating() {
		return sellerRating;
	}
	public void setSellerRating(int sellerRating) {
		this.sellerRating = sellerRating;
	}
	@Override
	public String toString() {
		return "sellerPOJO [sellerId=" + sellerId + ", userId=" + userId + ", sellerType=" + sellerType
				+ ", sellerRating=" + sellerRating + "]";
	}
	
	
	

}
