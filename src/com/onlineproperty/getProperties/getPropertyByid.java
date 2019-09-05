package com.onlineproperty.getProperties;

import com.onlinepropertysell.pojos.eminitiesPOJO;
import com.onlinepropertysell.pojos.propertyAddressPOJO;
import com.onlinepropertysell.pojos.propertyPOJO;
import com.onlinepropertysell.pojos.propertyTypePOJO;
import com.onlineproperty.DAOS.propertyDAO;
import com.onlineproperty.DAOS.propertyAddressDAO;
import com.onlineproperty.DAOS.propertyTypeDAO;
import com.onlineproperty.DAOS.eminitiesDAO;


public class getPropertyByid {
	propertyPOJO pPojo;
	propertyAddressPOJO pAddPojo;
	propertyTypePOJO pTypePojo;
	eminitiesPOJO emiPojo;
	
	public getPropertiespojo getproperty(int propertyid) throws Exception{
		getPropertiespojo gProPojo = new getPropertiespojo(0, 0, 0, null, null, null, null, 0, null, 0, 0, 0, 0, null, 0, 0, null, 0, null, 0, null, null, 0, 0, null, null, null, null);
		propertyDAO pDao = new propertyDAO();
		pPojo = pDao.getPropertyById(propertyid);
		
		
		propertyAddressDAO pAddDao = new propertyAddressDAO();
		pAddPojo = pAddDao.getPropertyAddress(propertyid);
		
		
		propertyTypeDAO pTypeDAO = new propertyTypeDAO();
		pTypePojo = pTypeDAO.getPropertyType(propertyid);
		
		eminitiesDAO eDao = new eminitiesDAO();
		emiPojo = eDao.getEminities(propertyid);
		
		gProPojo.setPropertyId(pPojo.getPropertyId());
		gProPojo.setCarpetArea(emiPojo.getCarpetArea());
		gProPojo.setCity(pAddPojo.getCity());
		gProPojo.setComment(emiPojo.getComment());
		gProPojo.setEminitiesId(emiPojo.getEminitiesId());
		gProPojo.setFacing(pPojo.getFacing());
		gProPojo.setFlatType(pTypePojo.getFlatType());
		gProPojo.setFloor(pAddPojo.getFloor());
		gProPojo.setLandmark(emiPojo.getLandmark());
		gProPojo.setLandmarkDistance((int) emiPojo.getLandMarkDistance());
		gProPojo.setLandType(pTypePojo.getLandType());
		gProPojo.setLocality(pAddPojo.getLocality());
		gProPojo.setMarketDistance((int) emiPojo.getMarketDistance());
		gProPojo.setNoOfFloors(emiPojo.getFloors());
		gProPojo.setOfficeType(pTypePojo.getOfficeType());
		gProPojo.setOverlooking(pPojo.getOverLooking());
		gProPojo.setOwenership(pPojo.getOwnerShip());
		gProPojo.setPIN(pAddPojo.getPinNumber());
		gProPojo.setPrice(pPojo.getPrice());
		gProPojo.setPropertyAddress(pAddPojo.getPropertyAddressId());
		gProPojo.setPropertyrating(pPojo.getPropertyrating());
		gProPojo.setPropertyType(pPojo.getPropertyType());
		gProPojo.setPropertyTypeId(pTypePojo.getPropertyId());
		gProPojo.setSellerId(pPojo.getSellerId());
		gProPojo.setShopType(pTypePojo.getShopType());
		gProPojo.setStatus(pPojo.getStatus());
		gProPojo.setStreet(pAddPojo.getStreet());
		
		
		
		
		
		
		return gProPojo;
	}
	
	
	
	
	
	

}
