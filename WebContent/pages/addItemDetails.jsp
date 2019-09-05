<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="../css/addItemDetails.css">
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
					<a href="#" class="logo">
						Hello
						<%
						out.print(session.getAttribute("userName"));
						%>
						</a>
				<a  href="#home">
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
		
    <h1 id="mainHeading">
        Property Type :
    </h1>
    <div class="add-item-container">
        <div class="add-item">
            <form action="addProperty" method= "post" id="add-item">
                <div class="propertyType">
                    Property Type : <select name="properytype" id="item-select">
                            <option value="">...None...</option>
                            <option value="Flat">Flat</option>
                            <option value="Office">Office</option>
                            <option value="Land">Land</option>
                            <option value="Shop">Shop</option>
                          </select>
                </div>
                <div class="Price">
                    Price: <input type="text" name="price" id="item-price">
                </div>
                <div class="Ownership">
                    Ownership: <select name="Ownership" id="item-select">
                            <option value="">...None...</option>
                            <option value="y">Yes</option>
                            <option value="n">No</option>
                            </select>
                </div>
                <div class="Facing">
                    Facing: <select name="Facing" id="item-select">
                            <option value="">...None...</option>
                            <option value="East">East</option>
                            <option value="West">West</option>
                            <option value="North">North</option>
                            <option value="South">South</option>
                            </select>

                </div>
                <div class="UploadFiles">
                    Upload Images: <input type="file" name="files" id="files" multiple>
                </div>
                <div class="submit">
                    <input type="submit" value="Save & Next" id="submit-button">
                </div>

            </form>
        </div>
    </div>

</body>
</html>