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

public class filterDAO implements Closeable {
	private Connection connection;
	private PreparedStatement stmtInsert;
//	private PreparedStatement stmtUpdate;
//	private PreparedStatement stmtDelete;
	private PreparedStatement stmtSelect;
	public filterDAO() throws Exception
	{
		this.connection = DBUtils.getConnection();
		this.stmtSelect = this.connection.prepareStatement("select * from buyer where Email=?");
	}
	
	public buyerPOJO getFiltered(int[] ids)throws Exception
	{
		//this.stmtSelect.setString();
		
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
