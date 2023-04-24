<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Comunidad VROL: Calendario</title>
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
	<br>
	<div class="container-fluid mx-auto">
		<div class="row text-center">
			<div class="col-sm-3"></div>
			<div class="col-sm-6">
				<div class="well well-sm">
				
					<form class="was-validated" action="CrearContacto" method="post">
						<fieldset>
							<legend class="text-center header" id="headerContacto">Contactanos</legend>

							<div class="form-group justify-content-center">
								<span class="col-md-1 text-center"><i
									class="fa fa-user bigicon"></i></span>
								<div class="col">
									<input id="fname"  name="name" type="text" placeholder="Nombres"
										class="form-control" required>
										<div class="invalid-feedback">No puede estar vacio</div>
								</div>
							</div>
							<br>
							<div class="form-group justify-content-center">
								<span class="col-md-1 col-md-offset-2 text-center"><i
									class="fa fa-user bigicon"></i></span>
								<div class="col">
									<input id="lname" name="lname" type="text"
										placeholder="Apellidos" class="form-control" required>
										<div class="invalid-feedback">No puede estar vacio</div>
								</div>
							</div>
							<br>
							<div class="form-group justify-content-center">
								<span class="col-md-1 col-md-offset-2 text-center"><i
									class="fa fa-envelope-o bigicon"></i></span>
								<div class="col">
									<input id="email" name="email" type="text" placeholder="Email"
										class="form-control" required>
										<div class="invalid-feedback">No puede estar vacio</div>
								</div>
							</div>
							<br>
							<div class="form-group justify-content-center">
								<span class="col-md-1 col-md-offset-2 text-center"><i
									class="fa fa-phone-square bigicon"></i></span>
								<div class="col">
									<input id="phone" name="phone" type="number"
										placeholder="Numero Telefonico" class="form-control" required>
										<div class="invalid-feedback">No puede estar vacio</div>
								</div>
							</div>
							<br>
							<div class="form-group justify-content-center">
								<span class="col-md-1 col-md-offset-2 text-center"><i
									class="fa fa-pencil-square-o bigicon"></i></span>
								<div class="col">
									<textarea class="form-control" id="message" name="message"
										placeholder="Ingresa tu mensaje. Te responderemos a la brevedad."
										rows="5" required></textarea>
										<div class="invalid-feedback">No puede estar vacio</div>
								</div>
							</div>
							<br>
							<div class="form-group">
								<div class="col-md-12 text-center">
									<button type="submit" class="btn btn-outline-info"
										id="enviar">Enviar</button>
								</div>
							</div>
							<br>
						</fieldset>
					</form>
				</div>
			</div>
			<div class="col-sm-3"></div>
		</div>
	</div>
	
<footer>
    <jsp:include page="footer.jsp"></jsp:include>
  </footer>   
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="resources\js\main.js"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>  
</body>
</html>