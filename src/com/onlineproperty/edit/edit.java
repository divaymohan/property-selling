package com.onlineproperty.edit;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlineproperty.getProperties.getSellerProperties;
import com.onlineproperty.getProperties.getPropertiespojo;
import com.onlineproperty.getProperties.getPropertyByid;


public class edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public edit() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String propertyID = request.getParameter("propertyID").toString();
		System.out.println(propertyID);	
		
		getPropertyByid getByID = new getPropertyByid();
		try {
			getPropertiespojo getPojo = getByID.getproperty(Integer.parseInt(propertyID));
			request.setAttribute("getPojo", getPojo);
			request.getRequestDispatcher("editpage.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		//response.sendRedirect("editpage.html");
	}

}
