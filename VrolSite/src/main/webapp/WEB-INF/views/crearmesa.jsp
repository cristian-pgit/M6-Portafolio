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
				<h1 class="h3 mb-3 fw-normal text-center">Crear Mesa</h1>

				<form  class="was-validated" action="genMesa" method="post">
					<div class="form-group">
						<label class="text-center" for="nomMesa">Nombre de la Capacitacion:</label> 
						<input type="text" required class="form-control" id="nomMesa" name="nomMesa">
							<div class="invalid-feedback">Favor ingrese nombre de la Mesa</div>
					</div>
				
					<div class="form-group">
						<label for="dm">Narrador/DJ/Master:</label> <select class="form-select" required aria-label="select example"
							id="dm" name="dm">
							<option value="" disabled selected hidden>Master</option>
						<!--  	<c:set var="master" value="${sessionScope.perfil}"/>
								<option value="${master.idUsuario}"><c:out value="${master.userName}" />&nbsp;-&nbsp;<c:out value="${master.nick}"/>-->	
								</option>
						</select>
						<div class="invalid-feedback">Favor seleccione el Narrador</div>
					</div>
					
					<div class="form-group">
						<label class="text-center" for="formato">Formato (Online/Presencial):</label> 
						<select class="form-select" required aria-label="select example" id="formato" name="formato" >
							<option value="" disabled selected hidden>Seleccione formato</option>
							<option value="online">On-Line</option>
							<option value="presencial">Presencial</option>
						</select>
							<div class="invalid-feedback">Favor seleccione formato</div>
					</div>
					
					<div class="form-group">
						<label class="text-center" for="dia">Dia de la Mesa (DD/MM/AAAA):</label> 
						<input type="number" class="form-control" id="dia" name="dia" required
							pattern="\d{2}\/\d{2}\/\d{4}">
							<div class="invalid-feedback">Favor ingrese un dia valido</div>
					</div>
					
					<div class="form-group">
						<label class="text-center" for="cantAsist">Cantidad de Jugadores:</label> 
						<input type="number" class="form-control" id="cantAsist" required name="cantAsist">
							<div class="invalid-feedback">Favor indique Cantidad de jugadores esperados</div>
					</div>
					
					<div class="form-group justify-content-center">
						<span class="col-md-1 col-md-offset-2 text-center">
						<i class="fa fa-pencil-square-o bigicon"></i></span>
							<div class="col">
								<textarea class="form-control" id="desCorta" name="desCorta" maxlength="100"
										placeholder="Ingresa una Descripcion Corta. No mas de 100 Caracteres."
										rows="5" required></textarea>
								<div class="invalid-feedback">No puede estar vacio</div>
							</div>
					</div>
			
					<div class="form-group justify-content-center">
						<span class="col-md-1 col-md-offset-2 text-center">
						<i class="fa fa-pencil-square-o bigicon"></i></span>
							<div class="col">
								<textarea class="form-control" id="descripcion" name="descripcion" maxlength="500"
										placeholder="Ingresa una Descripcion. No mas de 500 Caracteres. (no es necesario llenarla entera)"
										rows="5" required></textarea>
								<div class="invalid-feedback">No puede estar vacio</div>
							</div>
					</div>		
					
					<div class="form-group">
						<label class="text-center" for="lugar">Tags:</label> 
						<input type="text" required class="form-control" id="tags" placeholder="Ejemplo: PG-18" name="tags">
							<div class="invalid-feedback">Favor ingrese las tags que estime conveniente</div>
					</div>
					
					
					<br>
					<button type="submit" class="btn btn-primary" id="save">Crear</button>
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