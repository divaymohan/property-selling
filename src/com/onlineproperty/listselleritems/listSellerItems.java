package com.onlineproperty.listselleritems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineproperty.DAOS.userDAO;
import com.onlinepropertysell.pojos.userPOJO;
import com.onlineproperty.DAOS.sellerDAO;
import com.onlinepropertysell.pojos.sellerPOJO;
import com.onlineproperty.DAOS.propertyDAO;
import com.onlineproperty.getProperties.*;




public class listSellerItems extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listSellerItems() {
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
		getSellerProperties getSell = new getSellerProperties();
		try {
			//get UserId
			List<getPropertiespojo> pList = new ArrayList<getPropertiespojo>();
			HttpSession session = request.getSession();
			userDAO udao = new userDAO();
			upojo = udao.getUser(session.getAttribute("userEmail").toString());
			
			//get sellerID corresponds to user id
			sellerDAO sdao = new sellerDAO();
			spojo =  sdao.getUser(upojo.getUserId());
			
			//get all properties belongs to sellerID
			pList  = getSell.getProperties(spojo.getSellerId(), upojo.getUserId());
			
			session.setAttribute("pList", pList);
			//pdao.getProperty();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		response.sendRedirect("items.jsp");
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		userPOJO upojo;
		sellerPOJO spojo;
		getPropertiespojo gProPojo;
		getSellerProperties getSell = new getSellerProperties();
		try {
			//get UserId
			List<getPropertiespojo> pList = new ArrayList<getPropertiespojo>();
			HttpSession session = request.getSession();
			userDAO udao = new userDAO();
			upojo = udao.getUser(session.getAttribute("userEmail").toString());
			
			//get sellerID corresponds to user id
			sellerDAO sdao = new sellerDAO();
			spojo =  sdao.getUser(upojo.getUserId());
			
			//get all properties belongs to sellerID
			pList  = getSell.getProperties(spojo.getSellerId(), upojo.getUserId());
			
			session.setAttribute("pList", pList);
			//pdao.getProperty();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		response.sendRedirect("items.jsp");
	}

}
