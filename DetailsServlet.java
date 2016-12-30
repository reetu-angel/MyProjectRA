package com.controller;

import java.awt.AWTException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.database.ConnectionDB;
import com.screencapture.ScreenCapture;




/**
 * Servlet implementation class DetailsServlet
 */
@WebServlet("/DetailsServlet")
public class DetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailsServlet() {
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
		//doGet(request, response);
		String fName = request.getParameter("fname");
		String lName = request.getParameter("lname");
		//Date indate = null,outdate = null;
		String indate = null, outdate = null;
		RequestDispatcher requestDispatcher = null;
		//SimpleDateFormat format = new SimpleDateFormat("MM/DD/YYYY");
		//indate = format.format(request.getParameter("indatepicker"));
		indate = request.getParameter("indatepicker");
		//indate = format.parse(request.getParameter("indatepicker"));
		System.out.println("In date :" + indate);
		//outdate = format.parse(request.getParameter("outdatepicker"));
		//outdate = format.format(request.getParameter("outdatepicker"));
		outdate = request.getParameter("outdatepicker");
		System.out.println("Out date :" + outdate);
		String age = request.getParameter("age");	
		String inTime = request.getParameter("inTime");
		String outTime = request.getParameter("outTime");
		String idProofValue = request.getParameter("IdValue");
		String idProof = request.getParameter("idproof");
		ConnectionDB connectionDB = new ConnectionDB();
		try {
			connectionDB.getConnection(fName,lName,age,indate,outdate,inTime,outTime,idProof,idProofValue);
			requestDispatcher = request.getRequestDispatcher("Confirmation.jsp");
			request.setAttribute("fName", fName);
			request.setAttribute("lName", lName);
			request.setAttribute("age", age);
			request.setAttribute("inDate", indate);
			request.setAttribute("outDate", outdate);
			request.setAttribute("inTime", inTime);
			request.setAttribute("outTime", outTime);
			request.setAttribute("idProof", idProof);
			request.setAttribute("idProofValue", idProofValue);
			requestDispatcher.forward(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}

}
