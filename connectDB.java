package com.sneha;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectDB {
	static Connection conn = null;
	public static Connection connect() {
		{
			//Connection conn = null;
			try
			{
				if(conn==null)
				{
					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blackspotdetection2","root","");
				}
			}
			catch(Exception e)
			{
				System.err.println(e);
			}
			return conn;
		}
		
	}
		
}	
	

