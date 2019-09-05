<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/home.css">
<link rel="stylesheet" href="../css/home2.css">


<title>continue...</title>
</head>
<body>
	<header>
		<div class="header">
			<a href="#default" class="logo">
				Property Selling.
			</a>
			<div class="header-right">
					<a href="#default" class="logo">
						Hello
						
						</a>
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
	<h1>Do you Want TO Continue As <% 
	         out.print(session.getAttribute("userName"));
	    %></h1>
	<div class="hero-text">
		
	<form action="listSellerItems" method="post">
		<button type="submit" value="yes">Yes</button>
		
		
	 </form>
	 <a href="login.html"><button>No</button></a>	  
	</div>
	
	
	
</body>
</html>