package com.onlineproperty.deleteProperty;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.onlineproperty.DAOS.propertyDAO;

/**
 * Servlet implementation class DeleteProperty
 */
@WebServlet("/DeleteProperty")
public class DeleteProperty extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteProperty() {
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
		int propertyId = Integer.parseInt(request.getParameter("propertyID").toString());
		
		
		try {
			propertyDAO pDao = new propertyDAO();
			int sts = pDao.delete(propertyId);
			if(sts>0){
				response.sendRedirect("listSellerItems");
				
			}
			else{
				response.sendRedirect("items.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
