package com.onlineproperty.DAOS;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.onlinepropertysell.pojos.userAddressPOJO;
import com.onlinepropertysell.pojos.userPOJO;

public class useraddressDAO implements Closeable {
	private Connection connection;
	private PreparedStatement stmtInsert;
//	private PreparedStatement stmtUpdate;
//	private PreparedStatement stmtDelete;
	private PreparedStatement stmtSelect;
	public useraddressDAO() throws Exception
	{
		this.connection = DBUtils.getConnection();
		this.stmtInsert = this.connection.prepareStatement("insert into useraddress(addressId,userId,street,areaName,city,pin) values(?,?,?,?,?,?)");
		//this.stmtUpdate = this.connection.prepareStatement("update useraddress set price=? where book_id=?");
		//this.stmtDelete = this.connection.prepareStatement("delete from useraddress where book_id=?");
		  this.stmtSelect = this.connection.prepareStatement("select * from useraddress where userId=?");
	}
	public int insert( userAddressPOJO userAddress )throws Exception
	{

		this.stmtInsert.setInt(1,userAddress.getAddressId());
		this.stmtInsert.setInt(2,userAddress.getUserId());
		this.stmtInsert.setString(3,userAddress.getStreet());
		this.stmtInsert.setString(4,userAddress.getAreaName());
		this.stmtInsert.setString(5,userAddress.getCity());
		this.stmtInsert.setInt(6,userAddress.getPinNumber());
		
		int updateCount = this.stmtInsert.executeUpdate();
		return updateCount;
	}
	public userAddressPOJO getUser(String email )throws Exception
	{
		this.stmtSelect.setString(1, email);
		
		userAddressPOJO userAddress = new userAddressPOJO(0,0,"","","",0);
		try( ResultSet rs = this.stmtSelect.executeQuery())
		{
			
			while(rs.next()){
				userAddress.setAddressId(rs.getInt(1));
				userAddress.setUserId(rs.getInt(2));
				userAddress.setStreet(rs.getString(3));
				userAddress.setAreaName(rs.getString(4));
				userAddress.setCity(rs.getString(5));
				userAddress.setPinNumber(rs.getInt(6));

			}
			
		}
		return userAddress;
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
