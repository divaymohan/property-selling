package com.onlineproperty.DAOS;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.onlinepropertysell.pojos.eminitiesPOJO;
import com.onlinepropertysell.pojos.userPOJO;

public class eminitiesDAO implements Closeable {
	private Connection connection;
	private PreparedStatement stmtInsert;
//	private PreparedStatement stmtUpdate;
//	private PreparedStatement stmtDelete;
	private PreparedStatement stmtSelect;
	public eminitiesDAO() throws Exception
	{
		this.connection = DBUtils.getConnection();
		this.stmtInsert = this.connection.prepareStatement("insert into eminities(eminitiesId,propertyId,carpetArea,floors,landmark,landmarkdistance,marketDistance,comment) values(?,?,?,?,?,?,?,?)");
		//this.stmtUpdate = this.connection.prepareStatement("update eminities set price=? where book_id=?");
		//this.stmtDelete = this.connection.prepareStatement("delete from eminities where book_id=?");
		  this.stmtSelect = this.connection.prepareStatement("select * from eminities where propertyId=?");
	}
	public int insert( eminitiesPOJO eminities )throws Exception
	{
		this.stmtInsert.setInt(1,eminities.getEminitiesId());
		this.stmtInsert.setInt(2,eminities.getPropertyId());
		this.stmtInsert.setFloat(3,eminities.getCarpetArea());
		this.stmtInsert.setInt(4,eminities.getFloors());
		this.stmtInsert.setString(5,eminities.getLandmark());
		this.stmtInsert.setFloat(6,eminities.getLandMarkDistance());
		this.stmtInsert.setFloat(7,eminities.getMarketDistance());
		this.stmtInsert.setString(8,eminities.getComment());
		
		int updateCount = this.stmtInsert.executeUpdate();
		return updateCount;
	}
	public eminitiesPOJO getEminities(int pId )throws Exception
	{
		this.stmtSelect.setInt(1, pId);
		
		eminitiesPOJO eminities = new eminitiesPOJO(0,0,0,0,"",0,0,"");
		try( ResultSet rs = this.stmtSelect.executeQuery())
		{
			
			while(rs.next()){
				eminities.setEminitiesId(rs.getInt(1));
				eminities.setPropertyId(rs.getInt(2));
				eminities.setCarpetArea(rs.getFloat(3));
				eminities.setFloors(rs.getInt(4));
				eminities.setLandmark(rs.getString(5));
				eminities.setLandMarkDistance(rs.getFloat(6));
				eminities.setMarketDistance(rs.getFloat(7));
				eminities.setComment(rs.getString(8));
			}
			
		}
		return eminities;
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

