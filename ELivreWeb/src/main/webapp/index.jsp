<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1" crossorigin="anonymous">
    <link rel="stylesheet" href="public/css/style.css" />
    <title>Accueil</title>
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
                <a class="btn nav-link btn-light" role="button" href="buyServlet">Acheter</a>      
            </li>
            <li class="nav-item">
                <a class="btn nav-link btn-light" role="button" href="Vendre.jsp">Vendre</a>   
            </li>
          </ul>

    </nav>

    <div class="container-first">
        <h1><span>Tu </span><span>cherches</span><span>un </span><span>livre</span></h1>
    </div>

    <div class="container container-second">
        
    </div>

    <div class="container container-sell">
        <a id="buyAnchor"></a>
        <h2><span>Acheter</span></h2> 
    </div>
   
    <div class="container container-third">
        <div class="input-group mb-3">
            <div class="input-group-prepend">
              <label class="input-group-text" for="inputGroupSelect01">Classe</label>
            </div>
            <select class="custom-select" id="inputGroupSelect01">
              <option selected>Choisir...</option>
              <option value="1">One</option>
              <option value="2">Two</option>
              <option value="3">Three</option>
            </select>
            <div class="input-group-prepend">
                <label class="input-group-text" for="inputGroupSelect01">Mati??re</label>
            </div>
            <select class="custom-select" id="inputGroupSelect01">
                <option selected>Choisir...</option>
                <option value="1">One</option>
                <option value="2">Two</option>
                <option value="3">Three</option>
            </select>
            <div class="input-group-prepend">
                <label class="input-group-text" for="inputGroupSelect01">Ann??e</label>
            </div>
            <select class="custom-select" id="inputGroupSelect01">
                <option selected>Choisir...</option>
                <option value="1">One</option>
                <option value="2">Two</option>
                <option value="3">Three</option>
            </select>
            <span class="input-group-btn">
                <button class="btn btn-primary" type="submit">
                  <i class="fa fa-search"></i>
                </button>
            </span>
        </div>
    </div>

    <footer>
      <div class="footer">
        &#169 2021 Livraide - Tous droits r??serv??s
      </div>
    </footer>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/3.6.1/gsap.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>  
    <script src="public/js/index.js"></script>
</body>
</html>