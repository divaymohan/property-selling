package com.onlineproperty.DAOS;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.onlinepropertysell.pojos.userTypePOJO;

public class userTypeDao implements Closeable {
	private Connection connection;
	private PreparedStatement stmtInsert;
//	private PreparedStatement stmtUpdate;
//	private PreparedStatement stmtDelete;
	private PreparedStatement stmtSelect;
	public userTypeDao() throws Exception
	{
		this.connection = DBUtils.getConnection();
		this.stmtInsert = this.connection.prepareStatement("insert into usertype(userTypeId,userId,userType) values(?,?,?)");
		//this.stmtUpdate = this.connection.prepareStatement("update usertype set price=? where book_id=?");
		//this.stmtDelete = this.connection.prepareStatement("delete from usertype where book_id=?");
		  this.stmtSelect = this.connection.prepareStatement("select * from usertype where userId=?");
	}
	public int insert( userTypePOJO user )throws Exception
	{

		this.stmtInsert.setInt(1,user.getUserTyteId());
		this.stmtInsert.setInt(2,user.getUserId());
		this.stmtInsert.setString(3,user.getUserType());
		
		int updateCount = this.stmtInsert.executeUpdate();
		return updateCount;
	}
	public userTypePOJO getUser(String email )throws Exception
	{
		this.stmtSelect.setString(1, email);
		
		userTypePOJO user = new userTypePOJO(0, 0 , "");
		try( ResultSet rs = this.stmtSelect.executeQuery())
		{
			
			while(rs.next()){
		        user.setUserTyteId(rs.getInt(1));
				user.setUserId(rs.getInt(2));
		        user.setUserType(rs.getString(3));
			}
			
		}
		return user;
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
