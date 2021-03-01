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
                            <li class="nav-item">
                                <a href="/SBahia/logout.jsp" class="nav-link m-2 menu-item">Logout</a>
                            </li>
                        </ul>
                    </div>
                </nav>

            </div>
            
                            <section class="container-fluid">
                    <section class="row justify-content-center">
                      <section class="mx-auto text-center form">
            <h3> Pannel Admin </h3>
            <hr>
             <button class="btn btn-light"><a href="/SBahia/admin/add.jsp">Add Product</a></button>
            <hr>
            <br>
<table class="table bg-light mx-50">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Name</th>
      <th scope="col">Description</th>
      <th scope="col">Price</th>
      <th scope="col">Quantité</th>
      <th scope="col">Image</th>
       <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  
    <%
	ProductImp dp = new ProductImp();
	List<Product> allproduct = dp.getAllProduct();
	for(Product q:allproduct) {
  %>
    <tr>
      <th scope="row"><%= q.getId() %></th>
      <td><%= q.getNom() %></td>
      <td><%= q.getDescription() %></td>
      <td><%= q.getPrix() %></td>
      <td><%= q.getQuantite() %></td>
      <td>
       <img src="<%= q.getImage() %>" alt="<%= q.getDescription() %>" width="200" height="100"> 
      </td>
      <td><button class ="btn btn-light"><a href="/SBahia/admin/edit.jsp?id=<%= q.getId() %>">Edit</a></button><button class ="btn btn-danger"><a href="/SBahia/deleteproduct?id=<%= q.getId() %>">Delete</a></button></td>
        
    </tr>
<% } %>
  </tbody>
</table>
                           </section>
                    </section>
                  </section>       
        </div>

    </div>



      
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</body>
</html>