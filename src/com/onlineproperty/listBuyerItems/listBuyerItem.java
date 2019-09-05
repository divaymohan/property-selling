package com.onlineproperty.listBuyerItems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineproperty.DAOS.sellerDAO;
import com.onlineproperty.DAOS.userDAO;
import com.onlineproperty.getProperties.getAllProperties;
import com.onlineproperty.getProperties.getPropertiespojo;
import com.onlineproperty.getProperties.getSellerProperties;
import com.onlinepropertysell.pojos.sellerPOJO;
import com.onlinepropertysell.pojos.userPOJO;

/**
 * Servlet implementation class listBuyerItem
 */

public class listBuyerItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listBuyerItem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		userPOJO upojo;
		sellerPOJO spojo;
		getPropertiespojo gProPojo;
		getAllProperties getBuy = new getAllProperties();
		try {
			//get UserId
			List<getPropertiespojo> pList = new ArrayList<getPropertiespojo>();
			HttpSession session = request.getSession();
			
			
			//get all properties belongs to sellerID
			pList  = getBuy.getProperties();
			
			session.setAttribute("pList", pList);
			//pdao.getProperty();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		response.sendRedirect("buy.jsp");


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		userPOJO upojo;
		sellerPOJO spojo;
		getPropertiespojo gProPojo;
		getAllProperties getBuy = new getAllProperties();
		try {
			//get UserId
			List<getPropertiespojo> pList = new ArrayList<getPropertiespojo>();
			HttpSession session = request.getSession();
			
			
			//get all properties belongs to sellerID
			pList  = getBuy.getProperties();
			
			session.setAttribute("pList", pList);
			//pdao.getProperty();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		response.sendRedirect("buy.jsp");

	}

}
