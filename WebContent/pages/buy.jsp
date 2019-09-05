<!DOCTYPE html>
<%@page import="java.util.ArrayList"%>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/home.css">
<link rel="stylesheet" href="../css/item.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>buy</title>
</head>
<body>
	<header>
		<div class="header">
			<a href="index.jsp" class="logo">
				Property Selling.
			</a>
			<div class="header-right">
					<a href="#default" class="logo">
						Hello
						<%
						if(session.getAttribute("userName")!=null){
						out.print(session.getAttribute("userName"));
						}
						else{
							out.print("Guest");
						}
						%>
						</a>
				<a  href="index.jsp">
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
		
		<%@ page import="java.util.List" %>
		<%@ page import="com.onlineproperty.getProperties.*" %>
		<% 
		List<getPropertiespojo> pList = new ArrayList<getPropertiespojo>();
		pList = (List<getPropertiespojo>)session.getAttribute("pList");
		
		%>
		<div class="filter-items">
			<div class="filter-form">
				<form action="filteredQuery" method="POST"  id="filter-form">
					<div class="form-check-inline">
						<select class="form-control" id="sel1" name="propertyType">
								<option>property type</option>
								<option>Flat</option>
								<option>Land</option>
								<option>Office</option>
								<option>Shop</option>
						</select>
					</div>
					<div class="form-check-inline">
							<select class="form-control" id="sel1" name="city">
									<option>city</option>
									<option>1</option>
									<option>2</option>
									<option>3</option>
									<option>4</option>
							</select>
					</div>
					<div class="form-check-inline">
							<select class="form-control" id="sel1" name="landmark">
								<option>landmark</option>   
								<option>1</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
							</select>
					</div>
					<div class="form-check-inline">
						<select class="form-control" id="sel1" name="order">
							<option>cost</option>   
							<option>low to high</option>
							<option>high to low</option>
							
						</select>
				</div>
				<div class="form-check-inline">
					<input type="submit" value="send Query" name="btn" id="btn-filter">
			</div>


				</form>
			</div>
		</div>
		
		
		
		<div class="card-deck">
				<div class="row">
		<%if(pList!=null){
		for(getPropertiespojo pro: pList){ %>
		
  			<div class="col-sm-3">
				<div class="card mb-2">
					<img class="card-img-top" src="../images/architecture-background-buildings-218983.jpg" alt="Card image cap">
					<div class="card-body">
						<h5 class="card-title"><%out.print(pro.getPropertyType()); %></h5>
						<p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">
							<div class="edit-form">
								<div class="delete">
								<form action="show" method="post">
									<input type="hidden" name="propertyID" value=<%out.println(pro.getPropertyId()); %> >
									<button style='font-size:24px'><i class='fas fa-expand-arrows-alt'></i></button>
            			
								</form>
							   </div>
							<div class="delete">
							
									<form action="addtocart" method="post">
											<input type="hidden" name="propertyID" value=<%out.println(pro.getPropertyId()); %> >
											<button style='font-size:24px'><i class='fas fa-heart' style='font-size:36px;color:red;float: right'></i></button>
									</form>
							</div>
						   </div>

							
							</small>
					</div>
				</div>
			</div>
			
				<%}
		} %>
		
	 
			
	</div>
</div>
 </body>
</html>