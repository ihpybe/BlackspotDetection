package com.sneha;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Addblackspot
 */
public class Addblackspot extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addblackspot() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String Location = request.getParameter("Location");
		String Address = request.getParameter("Address");
		String Reason = request.getParameter("Reason");
		String Latitude = request.getParameter("Latitude");
		String Longitude = request.getParameter("Longitude");
		String Level = request.getParameter("Level");
		String City = request.getParameter("City");
		
		
		
//		int StationName1=1;
//		System.out.println(StationName);
//		Connection conn = connectDB.connect();
//		int rs = 0;
//		if (rs>0) {
			
		
			try
			{
				
				Connection conn = connectDB.connect();
				PreparedStatement ps1 = conn.prepareStatement("insert into blackspots values(?,?,?,?,?,?,?)");
				ps1.setString(1, Location);
				ps1.setString(2,Address);
				ps1.setString(3,Reason);
				ps1.setString(4,Latitude);
				ps1.setString(5,Longitude);
				ps1.setString(6,Level);
				ps1.setString(7,City);
				
				
			   int i = ps1.executeUpdate();
			   if(i>0)
			   {
				   response.sendRedirect("Addspots.html");
				
			   }
		   else
		   {
				   response.sendRedirect("error.html");
		   }
		
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
//		else {
//			response.sendRedirect("error.html");
//		}
	
		
	}



		
		
		
		
	
