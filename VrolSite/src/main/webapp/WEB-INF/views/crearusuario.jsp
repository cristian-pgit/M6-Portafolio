<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Comunidad VROL</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <link rel="stylesheet" href="resources/css/bootstrap.css">
    <link rel="stylesheet" href="resources/css/style.css">
    <link rel="preconnect" href="https://fonts.googleapis.com"><link rel="preconnect" href="https://fonts.gstatic.com" crossorigin><link href="https://fonts.googleapis.com/css2?family=Mukta&family=Roboto&display=swap" rel="stylesheet">
    <link rel="shortcut icon" href="resources\img\LogoVrol.png" type="image/x-icon">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
  	<c:set var="perfil" value="${sessionScope.perfil}"/>
  	<input type="hidden" id="perfilse" value="${sessionScope.perfil}" />
<div class="container-fluid d-none" id="formulario-adm">
		<jsp:include page="navbar.jsp"/>
</div>
<div class="container-fluid d-none" id="formulario-dm">
	<jsp:include page="master-navbar.jsp"/>
</div>
<div class="container-fluid d-none" id="formulario-vis">
	<jsp:include page="visit-navbar.jsp"/>
</div>
<!-- Content here -->
<div class="container">
		<div class="row">
			<div class="col-4"></div>
			<div class="col-4 text-center">
				<br>
				<h1 class="h3 mb-3 fw-normal text-center">Crear Usuario</h1>

				<form class="was-validated" action="crearuser" method="post">
					
					<div class="form-group">
						<label class="text-center" for="userName">Nombre de Usuario: </label> 
						<input type="text" class="form-control" id="userName"
							required name="userName">
							<div class="invalid-feedback"> Escriba un Nombre de Usuario</div>
					</div>
					
					<div class="form-group">
						<label class="text-center" for="password">Password: </label> <input
							type="password" class="form-control" id="password" required
							name="password">
							<div class="invalid-feedback">Ingrese un Password. Debe contener un simbolo y un numero al menos.</div>
					</div>

					<div class="form-group">
						<label for="tipo">Perfil del Usuario:</label> <select
							class="form-select" required aria-label="select example" id="tipo" name="tipo"
							onchange="displayFormFields()">
							<option value="" disabled selected hidden>---Selecciona---</option>
							<option value="Adm">Administrador</option>
							<option value="master">Narrador</option>
						</select>
						<div class="invalid-feedback">Favor seleccione Perfil del usuario</div>
					</div>
					
					<div class="form-group">
						<label class="text-center" for="nick">Nick de Usuario: </label> 
						<input type="text" class="form-control" id="nick"
							required name="nick">
							<div class="invalid-feedback"> Escriba un Nick de Usuario</div>
					</div>
					
					<div class="form-group">
						<label class="text-center" for="userName">E-mail: </label> 
						<input type="text" class="form-control" id="correo"
							required name="correo">
							<div class="invalid-feedback"> Escriba un email valido</div>
					</div>
					
					<div class="form-group">
						<label class="text-center" for="userName">Telefono: </label> 
						<input type="number" class="form-control" id="fono"
							required name="fono">
							<div class="invalid-feedback"> Escriba un telefono de contacto valido</div>
					</div>
					
					<br>
					<br>
					<button type="submit" class="btn btn-primary" id="save">Guardar</button>
				</form>
			</div>
			<div class="col-4"></div>
		</div>

	</div>

<!-- Content here -->
<footer>
    <jsp:include page="footer.jsp"></jsp:include>
</footer>    
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="resources\js\main.js"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>   
</body>
</html>