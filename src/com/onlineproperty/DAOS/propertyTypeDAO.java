package com.onlineproperty.DAOS;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.onlinepropertysell.pojos.propertyTypePOJO;
import com.onlinepropertysell.pojos.userPOJO;

public class propertyTypeDAO implements Closeable {
	private Connection connection;
	private PreparedStatement stmtInsert;
//	private PreparedStatement stmtUpdate;
//	private PreparedStatement stmtDelete;
	private PreparedStatement stmtSelect;
	public propertyTypeDAO() throws Exception
	{
		this.connection = DBUtils.getConnection();
		this.stmtInsert = this.connection.prepareStatement("insert into propertytype(propertyTypeId,propertyId,officeType,flatType,landType,shopType) values(?,?,?,?,?,?)");
		//this.stmtUpdate = this.connection.prepareStatement("update propertytype set price=? where book_id=?");
		//this.stmtDelete = this.connection.prepareStatement("delete from propertytype where book_id=?");
		  this.stmtSelect = this.connection.prepareStatement("select * from propertytype where propertyId=?");
	}
	public int insert( propertyTypePOJO propertyType )throws Exception
	{

		this.stmtInsert.setInt(1,propertyType.getPropertyTypeId());
		this.stmtInsert.setInt(2,propertyType.getPropertyId());
		this.stmtInsert.setString(3,propertyType.getOfficeType());
		this.stmtInsert.setString(4,propertyType.getFlatType());
		this.stmtInsert.setString(5,propertyType.getLandType());
		this.stmtInsert.setString(6,propertyType.getShopType());
		
		int updateCount = this.stmtInsert.executeUpdate();
		return updateCount;
	}
	public propertyTypePOJO getPropertyType(int pId )throws Exception
	{
		this.stmtSelect.setInt(1, pId);
		
		propertyTypePOJO propertyType = new propertyTypePOJO(0, 0, "", "", "", "");
		try( ResultSet rs = this.stmtSelect.executeQuery())
		{
			
			while(rs.next()){
				propertyType.setPropertyTypeId(rs.getInt(1));
				propertyType.setPropertyId(rs.getInt(2));
				propertyType.setOfficeType(rs.getString(3));
				propertyType.setFlatType(rs.getString(4));
				propertyType.setLandType(rs.getString(5));
				propertyType.setShopType(rs.getString(6));

			}
			
		}
		return propertyType;
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

