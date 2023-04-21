<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
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
</head>
<body>
	<header>
		<jsp:include page="navbar.jsp"></jsp:include>
	</header>
  <div class="container-fluid">
    <div class="row">
        <div class="col-sm-1"></div>
        <div class="col-sm-10">
            <div class="" id="calendar" >
                  <H5 class="caltex">Calendario de Eventos Actuales</H5>
                  <iframe src="https://calendar.google.com/calendar/embed?height=500&wkst=1&bgcolor=%23ffffff&ctz=America%2FSantiago&showTitle=0&showNav=1&showDate=1&showPrint=1&showTabs=0&showCalendars=0&src=b2ZpY2lhbHZyb2xAZ21haWwuY29t&color=%23AD1457" style="border:solid 1px #777" width="600" height="500" frameborder="0" scrolling="no"></iframe>
            </div>
        </div>
        <div class="col-sm-1"></div>
    </div>
    
  </div>
   
   <footer>
			<jsp:include page="footer.jsp"></jsp:include>
		</footer>     
    

  

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script> 
</body>
</html>