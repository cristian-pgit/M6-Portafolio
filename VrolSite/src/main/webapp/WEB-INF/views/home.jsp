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
</head>
<body>
  <header>
    <jsp:include page="navbar.jsp"></jsp:include>
  </header>
  <div class="container-fluid">
    <div class="row">
      <div class="col-sm-6">
        <div class="about">
          <h1>Quienes Somos</h1>
          <p class="">Somos una Comunidad de la Quinta Región y alrededores, quienes tenemos un gran amor a los Juegos de Rol. 
            Nuestro objetivo es jugar, promover, difundir, gestionar espacios (virtuales y presenciales), generar comunidad, y 
            fomentar la cultura de los juegos de rol, para que estos sean mas conocidos y así poder lograr que mas personas se 
            unan a esta gran comunidad. <br>
            Queremos brindar un espacio seguro para que todos puedan aportar y sentirse parte de la comunidad, por eso tenemos 
            un conjunto de normas de convivencia, para así velar para que todos y todas se sientan a gusto. 
            Si no tienes experiencia en los Juegos de Rol, no te preocupes, todos contamos con la vocacion de ensenar y nos encanta 
            tener mas personas que quieran aprender. <br><br>
            <strong>UNETE!</strong></p>      
        </div>
      </div>
      <div class="col-sm-6">
        <div id="Banners" class="carousel slide" data-bs-ride="carousel">
          <div class="carousel-inner">
            <div class="carousel-item active">
              <img src="resources\img\bAMG.png" class="img-fluid" alt="...">
            </div>
            <div class="carousel-item">
              <img src="resources\img\bPfd.png" class="img-fluid" alt="...">
            </div>
            <div class="carousel-item">
              <img src="resources\img\bWhm.png" class="img-fluid" alt="...">
            </div>
            <div class="carousel-item">
              <img src="resources\img\SevthSeas.jfif" class="img-fluid" alt="...">
            </div>
          </div>
          <button class="carousel-control-prev" type="button" data-bs-target="#Banners" data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
          </button>
          <button class="carousel-control-next" type="button" data-bs-target="#Banners" data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
          </button>
        </div>
      </div>
    </div>
    
  </div>
    
  
    
<footer>
    <jsp:include page="footer.jsp"></jsp:include>
  </footer>    
    

  

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
<!--<script src="Assets\js\main.js"></script>  -->
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>   
</body>
</html>