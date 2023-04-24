<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Comunidad VROL</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<link rel="stylesheet" href="resources/css/bootstrap.css">
<link rel="stylesheet" href="resources/css/style.css">
<link rel="stylesheet" href="resources/css/juegos.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Mukta&family=Roboto&display=swap"
	rel="stylesheet">
<link rel="shortcut icon" href="resources\img\LogoVrol.png"
	type="image/x-icon">
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
	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-9">
				<div class="contenedor-juegos">
					<div class="card"
						style="background-image: url('resources/img/changelingPor.jpg')">

						<div class="textos">
							<h3>Changeling: The Dreaming v20</h3>
							<p>S: Sistema Narrativo(d10)</p>
							<a class="btn btn-primary btn-sm" href="changeling"
								role="button">Conocer mas</a>
						</div>
					</div>
					<div class="card"
						style="background-image: url('resources/img/dndpor.jpg')">
						<div class="textos">
							<h3>Dungeons and Dragons</h3>
							<p>S: d20</p>
							<a class="btn btn-primary btn-sm" href="dnd" role="button">Conocer
								mas</a>
						</div>
					</div>
					<div class="card"
						style="background-image: url('resources/img/phfRulebook.jpg')">
						<div class="textos">
							<h3>Pathfinder</h3>
							<p>S: d20</p>
							<a class="btn btn-primary btn-sm" href="pathfinder.html"
								role="button">Conocer mas</a>
						</div>
					</div>

					<div class="card"
						style="background-image: url('resources/img/VtM1.png')">
						<div class="textos">
							<h3>Vampiro: La Mascarada</h3>
							<p>S: Sistema Narrativo(d10)</p>
							<a class="btn btn-primary btn-sm" href="vampire.html"
								role="button">Conocer mas</a>
						</div>
					</div>
					<div class="card"
						style="background-image: url('resources/img/magepor.png')">
						<div class="textos">
							<h3>Mage: The Ascension</h3>
							<p>S: Sistema Narrativo(d10)</p>
							<a class="btn btn-primary btn-sm" href="mage.html" role="button">Conocer
								mas</a>
						</div>
					</div>
					<div class="card"
						style="background-image: url('resources/img/CocPortada.jpg')">
						<div class="textos">
							<h3>Call of Cthulhu</h3>
							<p>S: BRP</p>
							<a class="btn btn-primary btn-sm" href="coc.html" role="button">Conocer
								mas</a>
						</div>
					</div>
				</div>
			</div>
			<div class="col-sm-3">
				<div class="banner" style="background-color: black;">
					<h3>Mesas On-Line y Presenciales</h3>
					<ul>
						<li>La Mina Perdida de Phandelver</li>
						<li>The Screaming Nights</li>
						<li>Aventura Antartica</li>
						<li>Mahou Shoujo: Miraculous Adv</li>
						<li>PokeRole</li>
						<li>Mouse Guard: Aventuras ratoniles</li>
					</ul>
					<button class="boton" onclick="averigua();">Conoce mas</button>
				</div>
			</div>
		</div>



		<footer>
			<jsp:include page="footer.jsp"></jsp:include>
		</footer>
	</div>

	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script src="resources\js\main.js"></script>
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>