package com.onlineproperty.addtocart;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlinepropertysell.pojos.cartPOJO;
import com.onlineproperty.DAOS.wishListDAO;

/**
 * Servlet implementation class addToCart
 */

public class addToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addToCart() {
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
		String propertyID = request.getParameter("propertyID").toString();
		HttpSession session = request.getSession();
		if(session.getAttribute("userId")==null){
			response.sendRedirect("login.html");
		}
		else{
			int buyerId = (int) session.getAttribute("userId");
			
			try {
				cartPOJO cpojo = new cartPOJO(0, buyerId, Integer.parseInt(propertyID));
				
				wishListDAO wishDao = new wishListDAO();
				wishDao.insert(cpojo);
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect("buy.jsp");
			
		}
		
		
		
		
	}

}
