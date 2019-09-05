package com.onlineproperty.addpropertydetails;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.onlinepropertysell.pojos.propertyPOJO;
import com.onlineproperty.DAOS.propertyDAO;
import com.onlineproperty.DAOS.sellerDAO;
import com.onlinepropertysell.pojos.sellerPOJO;

/**
 * Servlet implementation class addPropertyDetails
 */

public class addPropertyDetails extends HttpServlet {
	private String UPLOAD_DIRECTORY = "D:/abc/";
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addPropertyDetails() {
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
		
		String properytype = request.getParameter("properytype");
		String price = request.getParameter("price");
		String Ownership = request.getParameter("Ownership");
		String Facing = request.getParameter("Facing");
		
		try {
			HttpSession session = request.getSession();
			
			int userId = (int) session.getAttribute("userId");

			sellerDAO sdao = new sellerDAO();
			sellerPOJO spojo = sdao.getUser(userId);
			propertyPOJO proPojo = new propertyPOJO(0, spojo.getSellerId(), Float.parseFloat(price), null, Ownership, null, Facing, 0, properytype);
			propertyDAO pdao = new propertyDAO();
			int updateCount = pdao.insert(proPojo);
			
		   
		    if(updateCount>0){
				
				response.sendRedirect("listSellerItems");
			}
			else{
				response.sendRedirect("addItemDetails.html");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		//response.sendRedirect("addEmenities.html");
	}

}
