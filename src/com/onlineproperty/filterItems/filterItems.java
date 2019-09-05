package com.onlineproperty.filterItems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineproperty.getFilteredProperties.filteredByfilters;
import com.onlineproperty.getFilteredProperties.getFilteredPropertiesPOJO;
import com.onlineproperty.getProperties.getPropertiespojo;

/**
 * Servlet implementation class filterItems
 */
@WebServlet("/filterItems")
public class filterItems extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public filterItems() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cityName = request.getParameter("city").toString();
		String landMark = request.getParameter("landmark").toString();
		String order  = request.getParameter("order").toString();
		String ProType = request.getParameter("propertyType").toString();
		
		List<getPropertiespojo> properties = new ArrayList<getPropertiespojo>();
		
		getFilteredPropertiesPOJO getFilPro = new getFilteredPropertiesPOJO(cityName, landMark, order, ProType);
		
		filteredByfilters fbyfil = new filteredByfilters();
		
		properties = fbyfil.getProperties(getFilPro);
		
		HttpSession session = request.getSession();
		session.setAttribute("pList", properties);
		
		response.sendRedirect("buy.jsp");
		
		
		
	}

}
