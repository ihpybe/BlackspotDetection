package com.sneha;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserRegistration
 */
public class UserRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegistration() {
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
		
		String NAME = request.getParameter("NAME");
		String EMAILID = request.getParameter("EMAILID");
		String MOBILE = request.getParameter("MOBILE");
		String PASSWORD = request.getParameter("PASSWORD");
		String CITY = request.getParameter("CITY");
		
//		int StationName1=1;
//		System.out.println(StationName);
//		Connection conn = connectDB.connect();
//		int rs = 0;
//		if (rs>0) {
			
		
			try
			{
				
				Connection conn = connectDB.connect();
				PreparedStatement ps1 = conn.prepareStatement("insert into User values(?,?,?,?,?)");
				ps1.setString(1, NAME);
				ps1.setString(2,EMAILID);
				ps1.setString(3,MOBILE);
				ps1.setString(4,PASSWORD);
				ps1.setString(5,CITY);
				
			   int i = ps1.executeUpdate();
			   if(i>0)
			   {
				   response.sendRedirect("UserRegister.html");
				
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
		}
		
		




		
		
		
		
	


