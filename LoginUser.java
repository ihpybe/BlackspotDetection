package com.sneha;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginUser
 */
public class LoginUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginUser() {
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
		
		Connection conn = connectDB.connect();
		String EMAILID = request.getParameter("EMAILID");
		String  PASSWORD = request.getParameter("PASSWORD");
		
		try
		{
			PreparedStatement ps1 =  conn.prepareStatement("select * from user where EMAILID=? and PASSWORD=?");
			ps1.setString(1,EMAILID);
			ps1.setString(2,PASSWORD);
			
			ResultSet rs = ps1.executeQuery();
			if(rs.next())
			{
				response.sendRedirect("userlogin.html");
			}
			else
			{
				response.sendRedirect("userRegister.html");
			}
			
		}
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	
	
	


	}

}
