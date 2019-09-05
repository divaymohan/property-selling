package com.onlinepropertysell.pojos;

public class buyerPOJO {
	private int buyerId;
	private int userId;
	private int cartId;
	public buyerPOJO(int buyerId, int userId, int cartId) {
		super();
		this.buyerId = buyerId;
		this.userId = userId;
		this.cartId = cartId;
	}
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	@Override
	public String toString() {
		return "buyerPOJO [buyerId=" + buyerId + ", userId=" + userId + ", cartId=" + cartId + "]";
	}
	
	

}
