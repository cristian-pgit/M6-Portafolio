<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<nav class="navbar navbar-expand-lg bg-body-tertiary"
	data-bs-theme="dark">
	<div id="navs" class="container-fluid">
		<img src="resources\img\LogoVrol.png" alt="Logo" width="30" height="24"
			class="d-inline-block align-text-top" id="logohead"> <a
			class="navbar-brand" href="/vrolsite/">&nbsp;Comunidad VROL</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavDropdown">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="juegos">Juegos</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="calendar">Calendario</a>
				</li>
				<li class="nav-item"><a class="nav-link"
					href="contacto">Contacto</a></li>
				<li class="nav-item"><a class="nav-link" href="listarmesas">Mesas</a>
				</li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" role="button"
					data-bs-toggle="dropdown" aria-expanded="false"> Links Utiles </a>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item"
							href="https://chat.whatsapp.com/C6RxtSo2zSb44229GhpIhH">Chat
								whatsapp</a></li>
						<li><a class="dropdown-item"
							href="https://web.facebook.com/groups/1168027804123411">Facebook</a></li>
						<li><a class="dropdown-item"
							href="https://discord.gg/vfs4aVQfHp">Discord</a></li>
						<li><a class="dropdown-item"
							href="https://www.instagram.com/v_rolclub/">Instagram</a></li>
						<li><hr class="dropdown-divider"></li>
						<li><a class="dropdown-item disabled"
							href="https://forms.gle/xUiy9rVNs82mVQ228">Inscripcion Junta</a></li>
					</ul></li>
				<li class="nav-item"><a class="nav-link" href="juntas">Juntas</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="crearmesa">Crear Mesa</a>
				</li>
			</ul>
			<div class="collapse navbar-collapse" id="navbarNavDropdown">
				<div class="loginSector d-flex">
					<div class="d-flex ms-auto">
						<p class="nav-link text-info" id="texlogin">
								Welcome,&nbsp;<strong class="text-success"><c:out value="${sessionScope.username}" /></strong>&nbsp;</p>
						<form action="logout" method="POST">
							<button id="btnlogout" class="btn btn-outline-danger btn-sm" type="submit">Logout</button>
						</form>
					</div>
				</div>
			</div>
		</div>
</nav>
