package com.onlineproperty.getProperties;

import java.util.ArrayList;
import java.util.List;

import com.onlineproperty.DAOS.eminitiesDAO;
import com.onlineproperty.DAOS.propertyAddressDAO;
import com.onlineproperty.DAOS.propertyDAO;
import com.onlineproperty.DAOS.propertyTypeDAO;
import com.onlinepropertysell.pojos.eminitiesPOJO;
import com.onlinepropertysell.pojos.propertyAddressPOJO;
import com.onlinepropertysell.pojos.propertyPOJO;
import com.onlinepropertysell.pojos.propertyTypePOJO;

public class getAllProperties {
	propertyPOJO pPojo;
	propertyAddressPOJO pAddPojo;
	propertyTypePOJO pTypePojo;
	eminitiesPOJO emiPojo;
	
	
	List<getPropertiespojo> properties = new ArrayList<getPropertiespojo>();
	
	public List<getPropertiespojo> getProperties(){
		
		try {
			List<propertyPOJO> pList = new ArrayList<propertyPOJO>();
			propertyDAO proDao = new propertyDAO();
			pList = proDao.getProperties();
			for(propertyPOJO element : pList) {
				getPropertiespojo gProPojo = new getPropertiespojo(0, 0, 0, null, null, null, null, 0, null, 0, 0, 0, 0, null, 0, 0, null, 0, null, 0, null, null, 0, 0, null, null, null, null);
				gProPojo.setPropertyId(element.getPropertyId());
				gProPojo.setSellerId(element.getSellerId());
				gProPojo.setPrice(element.getPrice());
				gProPojo.setStatus(element.getStatus());
				gProPojo.setOwenership(element.getOwnerShip());
				gProPojo.setOverlooking(element.getOverLooking());
				gProPojo.setFacing(element.getFacing());
				gProPojo.setPropertyrating(element.getPropertyrating());
				gProPojo.setPropertyType(element.getPropertyType());
				properties.add(gProPojo);
			}
			for(getPropertiespojo pro: properties ){
				int propertyID = pro.getPropertyId();
				
				propertyAddressDAO proAddDao = new propertyAddressDAO();
				pAddPojo = proAddDao.getPropertyAddress(propertyID);
				pro.setPropertyAddress(pAddPojo.getPropertyAddressId());
				pro.setLocality(pAddPojo.getLocality());
				pro.setCity(pAddPojo.getCity());
				pro.setFloor(pAddPojo.getFloor());
				pro.setStreet(pAddPojo.getStreet());
				pro.setPIN(pAddPojo.getPinNumber());
				
				propertyTypeDAO ptypeDAO = new propertyTypeDAO();
				pTypePojo = ptypeDAO.getPropertyType(propertyID);
				pro.setPropertyTypeId(pTypePojo.getPropertyId());
				pro.setOfficeType(pTypePojo.getOfficeType());
				pro.setFlatType(pTypePojo.getFlatType());
				pro.setLandType(pTypePojo.getLandType());
				pro.setShopType(pTypePojo.getShopType());
				
				eminitiesDAO emiDao = new eminitiesDAO();
				emiPojo  = emiDao.getEminities(propertyID);
				pro.setEminitiesId(emiPojo.getEminitiesId());
				pro.setCarpetArea(emiPojo.getCarpetArea());
				pro.setNoOfFloors(emiPojo.getFloors());
				pro.setLandmark(emiPojo.getLandmark());
				pro.setLandmarkDistance((int)emiPojo.getLandMarkDistance());
				pro.setMarketDistance((int)emiPojo.getMarketDistance());

			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		return properties;


}
}
