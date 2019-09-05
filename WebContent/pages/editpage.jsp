<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../css/edit.css">
    <link rel="stylesheet" href="../css/home.css">
    <link rel="stylesheet" href="../css/home2.css">
<meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
    <header>
            <div class="header">
                <a href="#default" class="logo">
                    Property Selling.
                </a>
                <div class="header-right">
                    <a class="active" href="#home">
                        Home
                    </a>
                    <a href="#contact">
                        Contact
                    </a>
                    <a href="#about">
                        About
                    </a>
                    <a href="logout.jsp">Logout</a>
                </div>
            </div>
    </header>
    <%@ page import="com.onlineproperty.getProperties.*" %>
    <%
    getPropertiespojo pro = (getPropertiespojo)request.getAttribute("getPojo");
    
    %>
    <h1 id="mainHeading">
       Edit Property.
    </h1>
    <div class="add-item-container">
        <div class="add-item">
            <form action="editItem" method="POST" id="add-item">
                <div class="State-name">
                    State :<select name="state" id="item-select" >
                            <option value="select"><% out.println(pro.getLocality());%></option>
                            <option value="saab">Andra Pradesh</option>
                            <option value="fiat">Arunachal Pradesh</option>
                            <option value="audi">Assam</option>
                            <option value="audi">Bihar</option>
                            <option value="audi">Chhattisgarh</option>
                            <option value="audi">Goa</option>
                            <option value="audi">Gujarat</option>
                            <option value="audi">Haryana</option>
                            <option value="audi">Himachal Pradesh</option>
                            <option value="audi">Jammu and Kashmir</option>
                            <option value="audi">Jharkhand</option>
                            <option value="audi">Karnataka</option>
                            <option value="audi">Kerala</option>
                            <option value="audi">Madya Pradesh</option>
                            <option value="audi">Maharashtra</option>
                            <option value="audi">Manipur</option>
                            <option value="audi">Meghalaya</option>
                            <option value="audi">Mizoram</option>
                            <option value="audi">Nagaland</option>
                            <option value="audi">Orissa</option>
                            <option value="audi">Punjab</option>
                            <option value="audi">Rajasthan</option>
                            <option value="audi">Sikkim</option>
                            <option value="audi">Tamil Nadu</option>
                            <option value="audi">Telagana</option>
                            <option value="audi">Tripura</option>
                            <option value="audi">Uttaranchal</option>
                            <option value="audi">Uttar Pradesh</option>
                            <option value="audi">West Bengal</option>
                            <option value="audi">Andaman and Nicobar Islands</option>
                            <option value="audi">Chandigarh</option>
                            <option value="audi">Dadar and Nagar Haveli</option>
                            <option value="audi">Daman and Diu</option>
                            <option value="audi">Delhi</option>
                            <option value="audi">Lakshadeep</option>
                            <option value="audi">Pondicherry</option>
                          </select> 
                </div>
                <div class="District">
                    City : <input type="text" name="cityname" id="district-nale" value=<% out.println(pro.getCity());%>>
                    
                </div>
                <div class="street">
                    Street : <input type="text" name="streetname" id="street-name" value=<% out.println(pro.getStreet());%>>
                </div>
                <div class="locality">
                    Locality : <input type="text" name="localityname" id="locality-name" value=<% out.println(pro.getLocality());%>>
                </div>
                
                <div class="locality">
                    Pin : <input type="text" name="pinno" id="locality-name" value=<%out.println(pro.getPIN()); %>>
                </div>
               
                <div class="propertyType">
                    Property Type : <select name="properytype" id="item-select">
                            <option value=""><%out.println(pro.getPropertyType());%></option>
                            <option value="Flat">Flat</option>
                            <option value="Office">Office</option>
                            <option value="Land">Land</option>
                            <option value="Shop">Shop</option>
                          </select>
                </div>
                <div class="Price">
                    Price: <input type="text" name="price" id="item-price" value=<%out.println(pro.getPrice());%>>
                </div>
                <div class="Ownership">
                    Ownership: <select name="Ownership" id="item-select">
                            <option value=""><%out.println(pro.getOwenership());%></option>
                            <option value="y">Yes</option>
                            <option value="n">No</option>
                            </select>
                </div>
                <div class="Facing">
                    Facing: <select name="Facing" id="item-select">
                            <option value=""><%out.println(pro.getFacing());%></option>
                            <option value="East">East</option>
                            <option value="West">West</option>
                            <option value="North">North</option>
                            <option value="South">South</option>
                            </select>

                </div>
                
                <div class="carpetArea">
                    Carpet Area: <input type="text" name="carpetArea" id="carpet-area" value=<%out.println(pro.getCarpetArea());%>>
 
                </div>
                <div class="floors">
                    No of Floors: <input type="text" name="floors" id="no-floors" value=<%out.println(pro.getNoOfFloors());%>>
                </div>
                <div class="landmark">
                    Landmark: <input type="text" name="landmark" id="land-mark" value=<%out.println(pro.getLandmark());%>>
                </div>
                <div class="landMarkDistance">
                    land Mark Distance: <input type="text" name="landMarkDistance" id="landmark-distance" value=<%out.println(pro.getLandmarkDistance());%>>
 
                </div>
                <div class="marketDistance">
                    Market Distance: <input type="text" name="marketDistance" id="market-distance" value=<%out.println(pro.getMarketDistance());%>>
                </div>
                
                <div class="submit">
                    <input type="submit" value="Save" id="submit-button">
                </div>
                    <input type="hidden" name="propertyID" value=<%out.println(pro.getPropertyId()); %> >
                    <input type="hidden" name="eminitiesID" value=<%out.println(pro.getEminitiesId()); %> >
                    <input type="hidden" name="propertyaddID" value=<%out.println(pro.getPropertyAddress()); %> >
                    <input type="hidden" name="propertyTypeID" value=<%out.println(pro.getPropertyTypeId()); %> >
	
            </form>
        </div>
    </div>
<footer id="footer">

</footer>
</body>
</html>