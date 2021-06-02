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
    <title>Mettre livre à vendre</title>
</head>
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
                <a class="btn nav-link btn-light" role="button" href="Acheter.jsp">Acheter</a>    
            </li>
            <li class="nav-item">
                <a class="btn nav-link btn-light" role="button" href="Vendre.jsp">Vendre</a>   
            </li>
          </ul>

    </nav>
	
   <div align="left" style="margin-top: 50px;">
    <div class="container container-sell">
        <a id="sellAnchor"></a>
        <h2><span>Vendre</span></h2> 
   	</div>

    <div class="container container-fourth">
      <form action="Sell" method="post">
      <!--  
        <div class="form-group">
          <label for="FormControlSelect1">Classe &#42</label>
          <select class="form-control" id="FormControlSelect1" required>
            <option>1</option>
            <option>2</option>
            <option>3</option>
            <option>4</option>
            <option>5</option>
          </select>
        </div>
        
        <div class="form-group">
          <label for="FormControlSelect2">Matière &#42</label>
          <select class="form-control" id="FormControlSelect2" required>
            <option>1</option>
            <option>2</option>
            <option>3</option>
            <option>4</option>
            <option>5</option>
          </select>
        </div>
        <div class="form-group">
          <label for="FormControlSelect4">Etat &#42</label>
          <select class="form-control" id="FormControlSelect4" required>
            <option value="valueTB">Très bon</option>
            <option value="valueB">Bon</option>
            <option value="valueC">Correct</option>
            <option value="valueM">Mauvais</option>
          </select>
        </div>
        -->
        <div class="form-group">
          <label for="FormControlInput">Designation &#42</label>
          <input type="text" class="form-control" name="designation" placeholder="donnez le nom du livre" required>
        </div>
        <div class="form-group">
          <label for="FormControlInput">Nom d'auteur &#42</label>
          <input type="text" class="form-control" name="auteur" placeholder="donez le nom de l'auteur" required>
        </div>
        <div class="form-group">
          <label for="FormControlInput">Genre/Matière &#42</label>
          <input type="text" class="form-control" name="genre" placeholder="donnez le genre du livre ou sa matière." required>
        </div>
        <div class="form-group">
          <label for="FormControlInput">Prix &#42</label>
          <input type="text" class="form-control" name="prix" placeholder="donnez le prix du livre en Euros." required>
        </div>
        <div class="form-group">
          <label for="FormControlInput">Description &#42</label>
          <input type="text" class="form-control" name="description" placeholder="donnez une petite description du livre." required>
        </div>        
        <div class="form-group">
          <label for="FormControlFile">Insérer une photo &#42</label>
          <input type="file" accept=".jpg,.png" class="form-control-file" name="img" required>
        </div>
        <div class="ml-2 col-sm-6">
          <img src="public/img/livre_upload.png" id="preview" class="img-thumbnail">
        </div>
        <small id="passwordHelpBlock" class="form-text text-muted smallSell">
          Tous les champs avec un astérisque (&#42) sont obligatoires.
        </small> 
        <!-- jsp recuperer name-->
        <button type="submit" class="btn btn-primary btnSell" name="btnVendre">Vendre</button>
      </form>
    </div>
    </div>
</body>
</html>