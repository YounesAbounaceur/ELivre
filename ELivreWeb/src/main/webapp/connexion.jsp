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
    <title>Login</title>
</head>
<body>
  <form action="auth" method="post">
                <div class="modal-dialog modal-login modal-dialog-centered" role="document">
                  <div class="modal-content">
                    <div class="modal-header border-bottom-0">
                      <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                      </button>
                    </div>
                    <div class="modal-body">
                      <div class="form-title text-center">
                        <h4>Se connecter</h4>
                      </div>
                      <div class="d-flex flex-column text-center">
                        <form>
                          <div class="form-group">
                            <input type="text" class="form-control" name="username" placeholder="Identifiant" required>
                          </div>
                          <div class="form-group">
                            <input type="password" class="form-control" name="password" placeholder="Mot de passe" required>
                          </div>
                          <span class="erreur">${form.erreurs['motdepasse']}</span>
                          <button type="submit" class="btn btn-primary">Je me connecte</button>
                        </form>   
                      </div>
                    </div>
                    <div class="modal-footer d-flex justify-content-center">
                        <div class="signup-section">Vous n'avez pas encore de compte ?<a href="signup.jsp" data-toggle="modal" data-dismiss="modal" class="text-info"> Cr?ez-en un !</a></div>
                    </div>
                </div>
              </div>
           
</form>
</body>
</html>