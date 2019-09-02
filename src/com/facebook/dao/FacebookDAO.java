package com.facebook.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.facebook.entity.FacebookEmployee;

public class FacebookDAO  implements FacebookDAOInterface{
	
	private FacebookDAO()
	{}
	
	public static FacebookDAOInterface createObject(String a)
	{
		return new FacebookDAO();
	}

	@Override
	public int createProfileDAO(FacebookEmployee fe) {
		int i=0;
		try
		{
			
			Class.forName("oracle.jdbc.driver.oracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "zensar123");
			PreparedStatement ps=con.prepareStatement("insert into facebookemployee value(?,?,?,?)");
			ps.setString(1, fe.getName());
			ps.setString(1, fe.getPassword());
			ps.setString(1, fe.getEmail());
			ps.setString(1, fe.getAddress());
			i=ps.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return i;
	}

}
