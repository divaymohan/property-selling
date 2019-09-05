package com.onlineproperty.DAOS;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.onlinepropertysell.pojos.sellerPOJO;
import com.onlinepropertysell.pojos.userPOJO;

public class sellerDAO implements Closeable {
	private Connection connection;
	private PreparedStatement stmtInsert;
//	private PreparedStatement stmtUpdate;
//	private PreparedStatement stmtDelete;
	private PreparedStatement stmtSelect;
	public sellerDAO() throws Exception
	{
		this.connection = DBUtils.getConnection();
		this.stmtInsert = this.connection.prepareStatement("insert into seller(sellerId,userId,sellerType,sellerRating) values(?,?,?,?)");
		//this.stmtUpdate = this.connection.prepareStatement("update seller set price=? where book_id=?");
		//this.stmtDelete = this.connection.prepareStatement("delete from seller where book_id=?");
		  this.stmtSelect = this.connection.prepareStatement("select * from seller where userId=?");
	}
	public int insert( sellerPOJO seller )throws Exception
	{

		this.stmtInsert.setInt(1,seller.getSellerId());
		this.stmtInsert.setInt(2,seller.getUserId());
		this.stmtInsert.setString(3,seller.getSellerType());
		this.stmtInsert.setInt(4,seller.getSellerRating());
		
		int updateCount = this.stmtInsert.executeUpdate();
		return updateCount;
	}
	public sellerPOJO getUser(int userId )throws Exception
	{
		this.stmtSelect.setInt(1, userId);
		
		sellerPOJO seller = new sellerPOJO(0, 0, "" ,0);
		try( ResultSet rs = this.stmtSelect.executeQuery())
		{
			
			while(rs.next()){
				seller.setSellerId(rs.getInt(1));
				seller.setUserId(rs.getInt(2));
				seller.setSellerType(rs.getString(3));
				seller.setSellerRating(rs.getInt(4));
			}
			
		}
		return seller;
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
