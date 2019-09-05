package com.onlineproperty.DAOS;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.onlinepropertysell.pojos.buyerPOJO;
import com.onlinepropertysell.pojos.userPOJO;

public class buyerDAO implements Closeable {
	private Connection connection;
	private PreparedStatement stmtInsert;
//	private PreparedStatement stmtUpdate;
//	private PreparedStatement stmtDelete;
	private PreparedStatement stmtSelect;
	public buyerDAO() throws Exception
	{
		this.connection = DBUtils.getConnection();
		this.stmtInsert = this.connection.prepareStatement("insert into buyer(buyerId,userId,cartId) values(?,?,?)");
		//this.stmtUpdate = this.connection.prepareStatement("update buyer set price=? where book_id=?");
		//this.stmtDelete = this.connection.prepareStatement("delete from buyer where book_id=?");
		  this.stmtSelect = this.connection.prepareStatement("select * from buyer where Email=?");
	}
	public int insert( buyerPOJO buyer )throws Exception
	{

		this.stmtInsert.setInt(1,buyer.getBuyerId());
		this.stmtInsert.setInt(2,buyer.getUserId());
		this.stmtInsert.setInt(3,buyer.getCartId());
			
		int updateCount = this.stmtInsert.executeUpdate();
		return updateCount;
	}
	public buyerPOJO getUser(String email )throws Exception
	{
		this.stmtSelect.setString(1, email);
		
		buyerPOJO buyer = new buyerPOJO(0,0,0);
		try( ResultSet rs = this.stmtSelect.executeQuery())
		{
			
			while(rs.next()){
				buyer.setBuyerId(rs.getInt(1));
				buyer.setUserId(rs.getInt(2));
				buyer.setCartId(rs.getInt(3));

			}
			
		}
		return buyer;
	}

	@Override
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
