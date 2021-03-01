<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="Model.Product" %>
<%@ page import="java.util.List" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/main.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<title>SBahia - Home</title>
</head>
<body>

    <div class="container">
        <div class="row">
            <div class="col-12">

                <nav class="navbar navbar-expand-lg navbar-light">
                    <div class="d-flex flex-grow-1">
                        <span class="w-100 d-lg-none d-block"><!-- hidden spacer to center brand on mobile --></span>
                        <a class="navbar-brand d-none d-lg-inline-block" id="logotext" href="#">
                            SBahia
                        </a>
                        <a class="navbar-brand-two mx-auto d-lg-none d-inline-block" href="#">
                            <img src="//placehold.it/40?text=LOGO" alt="logo">
                        </a>
                        <div class="w-100 text-right">
                            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#myNavbar">
                                <span class="navbar-toggler-icon"></span>
                            </button>
                        </div>
                    </div>
                    <div class="collapse navbar-collapse flex-grow-1 text-right" id="myNavbar">
                        <ul class="navbar-nav ml-auto flex-nowrap">
                            <li class="nav-item">
                                <a href="/SBahia/" class="nav-link m-2 menu-item nav-active">Accuiel</a>
                            </li>
                            <li class="nav-item">
                                <a href="/SBahia/product.jsp" class="nav-link m-2 menu-item">Produits</a>
                            </li>
                        </ul>
                    </div>
                </nav>

            </div>
               <br>
               <br>
               <br>
               <br>

               <div class="container">
               <div class="row">

                   <%
	ProductImp dp = new ProductImp();
	List<Product> allproduct = dp.getAllProduct();
	for(Product q:allproduct) {
  %>
  <br>
               <div class="card" style="width: 18rem;">
 				 <img class="card-img-top" src="<%= q.getImage() %> " width="300" height="200" alt="Card image cap">
  			<div class="card-body">
    		<h5 class="card-title">Name :<%= q.getNom() %></h5>
   		 <p class="card-text"><%= q.getDescription() %></p>
   		 <p>Prix : <%= q.getPrix() %> DH</p>
   			 <a href="#" class="btn btn-primary">Vote +1</a>
  			</div>
			</div>
			<br>
			<% } %>
               </div>
               
               </div>
            
        </div>

    </div>



      
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</body>
</html>