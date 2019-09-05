package com.onlineproperty.DAOS;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.onlinepropertysell.pojos.propertyAddressPOJO;
import com.onlinepropertysell.pojos.userPOJO;

public class propertyAddressDAO implements Closeable {
	private Connection connection;
	private PreparedStatement stmtInsert;
//	private PreparedStatement stmtUpdate;
//	private PreparedStatement stmtDelete;
	private PreparedStatement stmtSelect;
	public propertyAddressDAO() throws Exception
	{
		this.connection = DBUtils.getConnection();
		this.stmtInsert = this.connection.prepareStatement("insert into propertyAddress(propertyAddressId,propertyId,locality,floor,city,street,pin) values(?,?,?,?,?,?,?)");
		//this.stmtUpdate = this.connection.prepareStatement("update propertyAddress set price=? where book_id=?");
		//this.stmtDelete = this.connection.prepareStatement("delete from propertyAddress where book_id=?");
		  this.stmtSelect = this.connection.prepareStatement("select * from propertyAddress where propertyId=?");
	}
	public int insert( propertyAddressPOJO propertyAddress )throws Exception
	{

		this.stmtInsert.setInt(1,propertyAddress.getPropertyAddressId());
		this.stmtInsert.setInt(2,propertyAddress.getPropertyId());
		this.stmtInsert.setString(3,propertyAddress.getLocality());
		this.stmtInsert.setInt(2,propertyAddress.getFloor());
		this.stmtInsert.setString(5,propertyAddress.getCity());
		this.stmtInsert.setString(6,propertyAddress.getStreet());
		this.stmtInsert.setInt(7,propertyAddress.getPinNumber());
		
		int updateCount = this.stmtInsert.executeUpdate();
		return updateCount;
	}
	public propertyAddressPOJO getPropertyAddress(int PId )throws Exception
	{
		this.stmtSelect.setInt(1, PId);
		
		propertyAddressPOJO propertyAddress = new propertyAddressPOJO(0,0,"",0,"","",0);
		try( ResultSet rs = this.stmtSelect.executeQuery())
		{
			
			while(rs.next()){
				propertyAddress.setPropertyAddressId(rs.getInt(1));
				propertyAddress.setPropertyId(rs.getInt(2));
				propertyAddress.setLocality(rs.getString(3));
				propertyAddress.setFloor(rs.getInt(4));
				propertyAddress.setCity(rs.getString(5));
				propertyAddress.setStreet(rs.getString(6));
				propertyAddress.setPinNumber(rs.getInt(7));

			}
			
		}
		return propertyAddress;
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
