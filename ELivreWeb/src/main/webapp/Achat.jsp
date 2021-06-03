<%@page import="metier.enteties.Livre"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1" crossorigin="anonymous">
    <link rel="stylesheet" href="public/css/style.css" />
    <title>Achat</title>
</head>
<body>
    <nav class="navbar navbar-expand-lg py-md-1 navbar-light bg-light">
        <a class="navbar-brand" href="index.html">
            <img src="public/img/logo.png" height="80" class="d-inline-block align-top" alt="">
            <span class="debutTitre">Livre</span><span class="finTitre">aide</span></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
      
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item"> 
                <a class="btn nav-link btn-light" role="button" href="Achat.jsp">Acheter</a>      
            </li>
            <li class="nav-item">
                <a class="btn nav-link btn-light" role="button" href="Vendre.jsp">Vendre</a>   
            </li>
          </ul>

    </nav>

     <div class="row align-items-center">
     	<% List<Livre> livres = (List<Livre>)request.getAttribute("livres"); 
 
     	   
     	   if(livres!=null){
           
     		 
     		  for (Livre l:livres){ 			  
   
     	%>
		<div class="card"  style="max-width: 18rem; height:25rem; margin-left: 10px; margin-right: 10px;" align="center">
		 <% String s ="public/img/"+l.getImg(); %>
		  <img src=<%= s %> class="card-img-top" alt="..." style = "margin-bottom: 28px;">
		  <div class="card-body" >
		    <h5 class="card-title"><%= l.getDesignation() %></h5>
		    <p class="card-text"><%= l.getDescription() %></p>
		  </div>
		  <ul class="list-group list-group-flush">
		    <li class="list-group-item"><%= l.getNomAuth() %></li>
		    <li class="list-group-item"><%= l.getGenre() %></li>
		    <li class="list-group-item"><%= l.getOwner().getUsername() %></li>
		    <li class="list-group-item"><%= l.getOwner().getEmail() %></li>
		    <li class="list-group-item"><%= l.getPrix() %></li>
		  </ul>
		  <div class="card-body">
		  <form form action="buyServlet" method="post">
		  	<input type="hidden" name="buyLivre" value=<%= l.getId() %> >
		    <button type="submit" class="btn btn-primary btnSell" name="btnAchat">Acheter</button>
		  </form>
		  </div>
		 
		</div>
		<%  } } %>
	

			
	  </div>


</body>
</html>