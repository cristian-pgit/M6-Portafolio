<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
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
  <div class="container-fluid">
  <br>
    <div class="row">
        <div class="col-md" id="textbox1">
            <h1>Quienes Somos</h1>
            <p class="text-info" id="QS">
                Somos una Comunidad que nacio de la Quinta Región y alrededores, quienes 
                tenemos un gran amor a los Juegos de Rol. <br><br>
                Nuestro objetivo es jugar, promover, difundir, gestionar espacios (virtuales y presenciales), 
                generar comunidad, y fomentar la cultura de los juegos de rol, para que estos sean mas 
                conocidos y así poder lograr que mas personas se unan a esta gran comunidad. <br><br>
                Queremos brindar un espacio seguro para que todos puedan aportar y sentirse parte de la 
                comunidad, por eso tenemos un conjunto de normas de convivencia, para así velar para que 
                todos y todas se sientan a gusto. Si no tienes experiencia en los Juegos de Rol, 
                no te preocupes, todos contamos con la vocacion de ensenar y nos encanta tener mas personas 
                que quieran aprender.
            </p>
            <h3>UNETE</h3>
        </div>
        <div class="col-md" id="textbox2">
            <h3><strong class="text-danger">Normas</strong></h3>
            <ol>
                <li>Como eje principal de nuestra convivencia, debemos fomentar el <strong class="text-secondary">RESPETO</strong> entre todos 
                    los participantes de VROL, tanto en actividades presenciales como en sus plataformas, 
                    para compartir en un espacio seguro y agradable. 
                </li>
                <br>
                <li>
                    NO se tolerará el bullying en cualquiera de sus formas, y en ninguna de las plataformas 
                    que conforman VROL.
                </li>
                <br>
                <li>
                    NO aceptaremos ningún tipo de discriminación, ya sea por género, religión, nacionalidad, 
                    creencias, gustos, etc.
                </li>
                <br>
                <li>
                    Debemos respetar la privacidad de todos los integrantes de la comunidad.
                </li>
                <br>
                <li>
                    Es necesario que informen a los administradores si sufren o son testigos de alguna 
                    infracción a estas normas, para poder seguir el protocolo correspondiente
                </li>
            </ol>
        </div>
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