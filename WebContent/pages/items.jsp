<!DOCTYPE html>
<%@page import="java.util.ArrayList"%>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/home.css">
<!--<link rel="stylesheet" href="../css/home2.css">-->
<link rel="stylesheet" href="../css/item.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<title>My items</title>
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
						out.print(session.getAttribute("userName"));
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
								<form action="edit" method="post">
									<input type="hidden" name="propertyID" value=<%out.println(pro.getPropertyId()); %> >
									<button style='font-size:24px'><i class='fas fa-edit'></i></button>
            			
								</form>
							   </div>
							<div class="delete">
							
									<form action="deleteProperty" method="post">
											<input type="hidden" name="propertyID" value=<%out.println(pro.getPropertyId()); %> >
											<button style='font-size:24px'><i class='fas fa-trash-alt' style='font-size:36px;color:red;float: right'></i></button>
									</form>
								</div>
						</div>

							
							</small>
					</div>
				</div>
			</div>
			
				<%}
		} %>
		
	 <form action="addNewProperty" method="POST">
		<button type="submit">
			<i class='fas fa-plus-square' style='font-size:300px'></i>
		</button>
	</form>
			
	</div>
</div>
 </body>
</html>