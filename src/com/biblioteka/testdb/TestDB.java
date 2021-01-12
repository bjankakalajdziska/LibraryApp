package com.biblioteka.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class TestDB
 */
@WebServlet("/TestDB")
public class TestDB extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// setup connection variables
		
		String user = "postgres";
		
		String pass="bjanka.99.99";
		
		String jdbcUrl="jdbc:postgresql://localhost:5432/proekt_bazi?useSSL=false&serverTimezone=UTC";
		
		String driver ="org.postgresql.Driver";
		
		// get connection to database
		
		try {
			PrintWriter out =response.getWriter();
			
			out.println("Connection to database: "+ jdbcUrl);
			
			Class.forName(driver);
			
			Connection myConn =DriverManager.getConnection(jdbcUrl, user, pass);
			
			out.println("SUCCESS!!");
			
			myConn.close();
			
		}
		catch(Exception exc) {
			exc.printStackTrace();
			throw new ServletException(exc);
		}
		
	}

}
