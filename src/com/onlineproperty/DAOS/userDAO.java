package com.onlineproperty.DAOS;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.onlinepropertysell.pojos.userPOJO;

public class userDAO implements Closeable {
	private Connection connection;
	private PreparedStatement stmtInsert;
//	private PreparedStatement stmtUpdate;
//	private PreparedStatement stmtDelete;
	private PreparedStatement stmtSelect;
	public userDAO() throws Exception
	{
		this.connection = DBUtils.getConnection();
		this.stmtInsert = this.connection.prepareStatement("insert into usertable(Email,Name,Password,PhoneNumber) values(?,?,?,?)");
		//this.stmtUpdate = this.connection.prepareStatement("update usertable set price=? where book_id=?");
		//this.stmtDelete = this.connection.prepareStatement("delete from userTable where book_id=?");
		  this.stmtSelect = this.connection.prepareStatement("select * from usertable where Email=?");
	}
	public int insert( userPOJO user )throws Exception
	{

		this.stmtInsert.setString(1,user.getUserEmail());
		this.stmtInsert.setString(2,user.getUserName());
		this.stmtInsert.setString(3,user.getPassword());
		this.stmtInsert.setString(4,user.getPhoneNumber());
		
		int updateCount = this.stmtInsert.executeUpdate();
		return updateCount;
	}
	public userPOJO getUser(String email )throws Exception
	{
		this.stmtSelect.setString(1, email);
		
		userPOJO user = new userPOJO(0, "", "", "", "");
		try( ResultSet rs = this.stmtSelect.executeQuery())
		{
			
			while(rs.next()){
		        user.setUserId(rs.getInt(1));
		        user.setUserEmail(rs.getString(2));
		        user.setUserName(rs.getString(3));
		        user.setPassword(rs.getString(4));
		        user.setPhoneNumber(rs.getString(5));
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
