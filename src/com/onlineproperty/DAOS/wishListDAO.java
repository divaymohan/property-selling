package com.onlineproperty.DAOS;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.onlinepropertysell.pojos.cartPOJO;;

public class wishListDAO {
	private Connection connection;
	private PreparedStatement stmtInsert;
//	private PreparedStatement stmtUpdate;
//	private PreparedStatement stmtDelete;
	private PreparedStatement stmtSelect;
	public wishListDAO() throws Exception
	{
		this.connection = DBUtils.getConnection();
		this.stmtInsert = this.connection.prepareStatement("insert into cart(buyerId,propertyId) values(?,?)");
		//this.stmtUpdate = this.connection.prepareStatement("update cart set price=? where book_id=?");
		//this.stmtDelete = this.connection.prepareStatement("delete from cart where book_id=?");
		 this.stmtSelect = this.connection.prepareStatement("select * from cart where buyerId=?");
	}
	public int insert( cartPOJO cart )throws Exception
	{

		this.stmtInsert.setInt(1,cart.getBuyerId());
		this.stmtInsert.setInt(2,cart.getPropertyId());
		
		
		int updateCount = this.stmtInsert.executeUpdate();
		return updateCount;
	}
	public cartPOJO getCart(int buyerID )throws Exception
	{
		this.stmtSelect.setInt(1, buyerID);
		
		cartPOJO cart = new cartPOJO(0, 0 ,0 );
		try( ResultSet rs = this.stmtSelect.executeQuery())
		{
			
			while(rs.next()){
				cart.setCartId(rs.getInt(1));
				cart.setBuyerId(rs.getInt(2));
		        cart.setPropertyId(rs.getInt(3));
			}
			
		}
		return cart;
	}

	public void close() throws IOException 
	{
		try 
		{
			DBUtils.closeConnection();
		}
		catch (Exception e) 
		{
			throw new IOException(e);
		}
	}


}
