package com.onlineproperty.editItem;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlineproperty.DAOS.propertyDAO;
import com.onlinepropertysell.pojos.propertyPOJO;

/**
 * Servlet implementation class editItem
 */
@WebServlet("/editItem")
public class editItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editItem() {
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
		
		String state = request.getParameter("state").toString();
		String city = request.getParameter("cityname").toString();
		String street = request.getParameter("streetname").toString();
		String locality = request.getParameter("localityname").toString();
		String pin = request.getParameter("pinno").toString();
		String propertyType = request.getParameter("properytype").toString();
		int price =Integer.parseInt(request.getParameter("price").toString());
		String ownership = request.getParameter("Ownership").toString();
		String facing = request.getParameter("Facing").toString();
		String carpetArea = request.getParameter("carpetArea").toString();
		String NoOfFloors = request.getParameter("floors").toString();
		String landmark = request.getParameter("landmark").toString();
		String landmarkDist = request.getParameter("landMarkDistance").toString();
		String marketDistance = request.getParameter("marketDistance").toString();
		int propertyID =Integer.parseUnsignedInt(request.getParameter("propertyID").toString());
		int eminitiesID = Integer.parseInt(request.getParameter("eminitiesID").toString());
		int propertyaddId = Integer.parseInt(request.getParameter("propertyaddID").toString());
		int propertyTypeId = Integer.parseInt(request.getParameter("propertyTypeID").toString());
		String overlooking = "";
		
		try {
			propertyPOJO property = new propertyPOJO(propertyID,0, price,"yes",ownership , overlooking, facing,1, propertyType);
			propertyDAO pDao = new propertyDAO();
			property.setPrice(price);
			property.setOwnerShip(ownership);
			property.setOverLooking(overlooking);
			property.setFacing(facing);
			property.setPropertyType(propertyType);
			
			
			int sts = pDao.update(property);
			if(sts!=0){
			PrintWriter out = response.getWriter();
			out.println("successfull");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
