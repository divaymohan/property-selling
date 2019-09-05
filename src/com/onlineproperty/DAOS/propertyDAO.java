package com.onlineproperty.DAOS;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.onlinepropertysell.pojos.propertyPOJO;
import com.onlinepropertysell.pojos.userPOJO;

public class propertyDAO implements Closeable {
	
	private Connection connection;
	private PreparedStatement stmtInsert;
 	private PreparedStatement stmtUpdate;
	private PreparedStatement stmtDelete;
	private PreparedStatement stmtSelect;
	private PreparedStatement stmtSelectproperty;
	private PreparedStatement stmtSelectAllproperty;
	private PreparedStatement stmtSelectFilteredproperty;
	public propertyDAO() throws Exception
	{
		this.connection = DBUtils.getConnection();
		this.stmtInsert = this.connection.prepareStatement("insert into property(sellerId,price,status,owenership,overlooking,facing,proprtyrating,propertyType) values(?,?,?,?,?,?,?,?)");
		this.stmtUpdate = this.connection.prepareStatement("update property set price=?,owenership=?,overlooking=?,facing=?,propertyType=? where propertyId=?");
		this.stmtDelete = this.connection.prepareStatement("delete from property where propertyId=?");
		this.stmtSelect = this.connection.prepareStatement("select * from property where sellerId=?");
		this.stmtSelectproperty = this.connection.prepareStatement("select * from property where propertyId=?");
		this.stmtSelectAllproperty = this.connection.prepareStatement("select * from property");
		this.stmtSelectFilteredproperty = this.connection.prepareStatement("select * from property where propertyType=?");
	}
	public int insert( propertyPOJO property )throws Exception
	{

		//this.stmtInsert.setInt(1,property.getPropertyId());
		this.stmtInsert.setInt(1,property.getSellerId());
		this.stmtInsert.setFloat(2,property.getPrice());
		this.stmtInsert.setString(3,property.getStatus());
		this.stmtInsert.setString(4,property.getOwnerShip());
		this.stmtInsert.setString(5,property.getOverLooking());
		this.stmtInsert.setString(6,property.getFacing());
		this.stmtInsert.setInt(7,property.getPropertyrating());
		this.stmtInsert.setString(8,property.getPropertyType());
		
		int updateCount = this.stmtInsert.executeUpdate();
		return updateCount;
	}
	public int update(propertyPOJO property)throws Exception
	{
		this.stmtUpdate.setFloat(1, property.getPrice());
		this.stmtUpdate.setString(2, property.getOwnerShip());
		this.stmtUpdate.setString(3, property.getOverLooking());
		this.stmtUpdate.setString(4, property.getFacing());
		this.stmtUpdate.setString(5, property.getPropertyType());
		this.stmtUpdate.setInt(6, property.getPropertyId());
		
		int updateCount = this.stmtUpdate.executeUpdate();
		return updateCount;
	}
	public List<propertyPOJO> getProperty(int sellerID )throws Exception
	{
		this.stmtSelect.setInt(1, sellerID);
		List<propertyPOJO> PList = new ArrayList<propertyPOJO>();
		
		
		try( ResultSet rs = this.stmtSelect.executeQuery())
		{
			
			while(rs.next()){
				propertyPOJO propertyType = new propertyPOJO(0, 0, 0, "", "", "","",0,"");
				propertyType.setPropertyId(rs.getInt(1));
				propertyType.setSellerId(rs.getInt(2));
				propertyType.setPrice(rs.getFloat(3));
				propertyType.setStatus(rs.getString(4));
				propertyType.setOwnerShip(rs.getString(5));
				propertyType.setOverLooking(rs.getString(6));
				propertyType.setFacing(rs.getString(7));
				propertyType.setPropertyrating(rs.getInt(8));
				propertyType.setPropertyType(rs.getString(9));
				PList.add(propertyType);

			}
			
		}
		return PList;
	}
	public propertyPOJO getPropertyById(int propertyId) throws Exception{
		this.stmtSelectproperty.setInt(1, propertyId);
		ResultSet rs = this.stmtSelectproperty.executeQuery();
		propertyPOJO propertyType = new propertyPOJO(0, 0, 0, "", "", "","",0,"");
		while(rs.next()){
		propertyType.setPropertyId(rs.getInt(1));
		propertyType.setSellerId(rs.getInt(2));
		propertyType.setPrice(rs.getFloat(3));
		propertyType.setStatus(rs.getString(4));
		propertyType.setOwnerShip(rs.getString(5));
		propertyType.setOverLooking(rs.getString(6));
		propertyType.setFacing(rs.getString(7));
		propertyType.setPropertyrating(rs.getInt(8));
		propertyType.setPropertyType(rs.getString(9));
		}
		
		
		return propertyType;
	}
	public List<propertyPOJO> getFilteredProperty(String propertyType) throws SQLException {
		this.stmtSelectFilteredproperty.setString(1, propertyType);
		List<propertyPOJO> PList = new ArrayList<propertyPOJO>();
		
		
		try( ResultSet rs = this.stmtSelectFilteredproperty.executeQuery())
		{
			
			while(rs.next()){
				propertyPOJO propertyTy = new propertyPOJO(0, 0, 0, "", "", "","",0,"");
				propertyTy.setPropertyId(rs.getInt(1));
				propertyTy.setSellerId(rs.getInt(2));
				propertyTy.setPrice(rs.getFloat(3));
				propertyTy.setStatus(rs.getString(4));
				propertyTy.setOwnerShip(rs.getString(5));
				propertyTy.setOverLooking(rs.getString(6));
				propertyTy.setFacing(rs.getString(7));
				propertyTy.setPropertyrating(rs.getInt(8));
				propertyTy.setPropertyType(rs.getString(9));
				PList.add(propertyTy);

			}
			
		}
		return PList;

	}
public List<propertyPOJO> getProperties() throws SQLException {
		
		
		List<propertyPOJO> PList = new ArrayList<propertyPOJO>();
		
		
		try( ResultSet rs = this.stmtSelectAllproperty.executeQuery())
		{
			
			while(rs.next()){
				propertyPOJO propertyType = new propertyPOJO(0, 0, 0, "", "", "","",0,"");
				propertyType.setPropertyId(rs.getInt(1));
				propertyType.setSellerId(rs.getInt(2));
				propertyType.setPrice(rs.getFloat(3));
				propertyType.setStatus(rs.getString(4));
				propertyType.setOwnerShip(rs.getString(5));
				propertyType.setOverLooking(rs.getString(6));
				propertyType.setFacing(rs.getString(7));
				propertyType.setPropertyrating(rs.getInt(8));
				propertyType.setPropertyType(rs.getString(9));
				PList.add(propertyType);

			}
			
		}
		return PList;

	}

	public int delete( int propertyId )throws Exception
	{
		this.stmtDelete.setInt(1, propertyId);
		int updateCount = this.stmtDelete.executeUpdate();
		return updateCount;
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

