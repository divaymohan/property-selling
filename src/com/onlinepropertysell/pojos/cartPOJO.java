package com.onlinepropertysell.pojos;

public class cartPOJO {
	private int cartId;
	private int buyerId;
	private int propertyId;
	public cartPOJO(int cartId, int buyerId, int propertyId) {
		super();
		this.cartId = cartId;
		this.buyerId = buyerId;
		this.propertyId = propertyId;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	@Override
	public String toString() {
		return "cartPOJO [cartId=" + cartId + ", buyerId=" + buyerId + ", propertyId=" + propertyId + "]";
	}
	
	

}
