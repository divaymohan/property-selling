<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/home.css">
<link rel="stylesheet" href="../css/home2.css">


<title>Home</title>
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
						<%
						out.print(session.getAttribute("userName"));
						%>
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
	<div class="hero-image">
		<div class="hero-text">
		  <h1 style="font-size:50px">Property selling</h1>
		  <h3>Search your choice</h3>
		   <form action="Buyer" method="post">
		  		<button type="submit">Buy</button>
		  </form>
		  <form action="listSellerItems" method="post"><button>sell</button></form>
		</div>
	</div>
<footer>
	<div class="owner-details">
		<div> Project By : Divay </div>
	</div> 
</footer>
	
	  
	  
	  
	
</body>
</html>