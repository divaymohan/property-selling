package com.onlineproperty.additem;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlinepropertysell.pojos.propertyAddressPOJO;
import com.onlineproperty.DAOS.propertyAddressDAO;
import com.onlineproperty.DAOS.propertyDAO;
import com.onlinepropertysell.pojos.propertyPOJO;
import com.onlineproperty.DAOS.sellerDAO;
import com.onlinepropertysell.pojos.sellerPOJO;

/**
 * Servlet implementation class addItem
 */

public class addItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addItem() {
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
		String state = request.getParameter("state");
		String cityname = request.getParameter("cityname");
		String streetname = request.getParameter("streetname");
		String localityname = request.getParameter("localityname");
		String pinno  = request.getParameter("pinno");
			
		
		
		response.sendRedirect("addItemDetails.html");
		PrintWriter out = response.getWriter();
		out.println(state + " " +cityname+ " " +streetname+ " " +localityname+ " " +pinno);
		
				
		
		
	}

}
