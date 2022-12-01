package com.sneha;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddPolice
 */
public class AddPolice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPolice() {
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
		
		String stationname = request.getParameter("StationName");
		String Address1 = request.getParameter("Address");
		String ContactNo = request.getParameter("Contact");
		String email = request.getParameter("Emailid");
		String pass = request.getParameter("pass");
		
//		int StationName1=1;
//		System.out.println(StationName);
//		Connection conn = connectDB.connect();
//		int rs = 0;
//		if (rs>0) {
			
		
			try
			{
				
				Connection conn = connectDB.connect();
				PreparedStatement ps1 = conn.prepareStatement("insert into policestation values(?,?,?,?,?)");
				ps1.setString(1, stationname);
				ps1.setString(2,Address1);
				ps1.setString(3,ContactNo);
				ps1.setString(4,email);
				ps1.setString(5,pass);
				
			   int i = ps1.executeUpdate();
			   if(i>0)
			   {
				   response.sendRedirect("Police.html.html");
				
			   }
//			   else
//			   {
//				   response.sendRedirect("error.html");
//			   }
//			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
//		else {
//			response.sendRedirect("error.html");
	}
	



