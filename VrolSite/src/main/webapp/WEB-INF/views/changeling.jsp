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
        <link rel="stylesheet" href="resources\css\detailgame.css">
    <link rel="preconnect" href="https://fonts.googleapis.com"><link rel="preconnect" href="https://fonts.gstatic.com" crossorigin><link href="https://fonts.googleapis.com/css2?family=Mukta&family=Roboto&display=swap" rel="stylesheet">
    <link rel="shortcut icon" href="resources\img\LogoVrol.png" type="image/x-icon">
</head>
<body>
  <header>
    <jsp:include page="navbar.jsp"></jsp:include>
  </header>
                <br>
                <br>
  <div class="container-fluid">
        <div class="row">
            <div class="col-sm-9">
                <img class="img-fluid" src="resources\img\chan0.png" alt="">
                <a class="btn btn-primary btn-sm" href="juegos.html" role="button">Volver a Juegos</a>
                <h2>Changeling: The Dreaming</h2>
                <h3><em>Changeling: El Ensueño</em></h3>
                <br>
                <br>
                <p class="text-justify">
                    Changeling: el ensueño es un juego de rol parte del <a href="https://es.wikipedia.org/wiki/Mundo_de_Tinieblas">Mundo de Tinieblas</a>, original de White Wolf. Los personajes son changelings, almas feéricas renacidas en cuerpos humanos, una práctica que comenzó a extenderse entre las hadas que permanecieron en La Tierra después de la Edad Media para protegerse de un mundo donde cada vez hay menos sueños y más banalidad.

                    Algunas de las tramas de juego giran en torno a:

                    La llegada del "invierno" en el que las hadas podrían desaparecer para siempre de la Tierra junto a los humanos quedando la propia tierra desolada.
                    Arcadia, su mundo natal del que ninguna tiene recuerdos claros, al que ya no pueden volver y en el que parece que está sucediendo algo misterioso y puede que horrible, quizás una misteriosa guerra o un gran pesar.
                    Las diferentes facciones, las cortes luminosa, oscura y sombría y la reciente guerra entre nobles y plebeyos.
                    El Juego explora el equilibrio entre la imaginación y el pragmatismo, y la lucha del arte y la belleza contra el oscuro y misterioso Mundo de Tinieblas "gótico-punk". Changeling bebe principalmente de la mitología celta, particularmente de las historias de los sidhe y los Tuatha Dé Danann, pero también utiliza otras mitologías y folklores de diversas culturas, incluidas la Mitología de los Nativos Americanos, la mitología griega, la mitología hindú y la mitología china.

                    Mundo de Tinieblas: La Hora del Juicio, fue publicado a principios de 2004, incluyó un capítulo del fin del mundo desde la perspectiva de Changeling, y fue el último material publicado del juego.

                    Edad Oscura: Hadas es un juego de rol complemento de Edad Oscura: Vampiro en el que se describe cómo era el mundo de las hadas en la Edad Media y que pese a ser el mismo mundo guarda fuertes diferencias con changeling: El Ensueño. Aún no queda claro cómo y por qué cambiaron tanto las hadas entre dicha época y la edad actual.</p>
                    <br>
                    <h4 class="text-info">Sistema de juego</h4>
                    <br>
                    <p>
                        Changeling: El Ensueño utiliza el sistema de juego original de White Wolf, el así llamado Sistema Narrativo.
                    </p>
                    <div class="accordion" id="accordionExample">
  <div class="accordion-item">
    <h2 class="accordion-header" id="headingOne">
      <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseOne" aria-expanded="false" aria-controls="collapseOne">
        Como Funciona?
      </button>
    </h2>
    <div id="collapseOne" class="accordion-collapse collapse" aria-labelledby="headingOne" data-bs-parent="#accordionExample" style="">
      <div class="accordion-body">
        <strong>Como Funciona?</strong> El sistema narrativo es uno de los reglamentos más sencillos y visuales que hay en el mercado. Las reglas básicas están pensadas para hacer el proceso lo más eficiente posible, permitiendo centrar la atención en la historia. \n El sistema se compone de rasgos con puntuaciones de 1 a 5 que se marcan como círculos en la ficha de personaje. Durante las tiradas se suman dos tipos de rasgos que incluyen un Atributo y una Habilidad y se lanza ese número en dados para determinar el éxito o fracaso de la acción contra una dificultad marcada por el narrador.
        Los dados que se utilizan son de diez caras. Las tiradas tienen una dificultad, normalmente seis, teniendo que igualar o superar ese número con los dados de diez caras que se tiran. Cuántos más éxitos se consiguen mejor es el resultado obtenido por el personaje. Cuantos más dados se tiran es más fácil conseguir éxito.\n
        Hay un total de nueve atributos que se dividen en las categorías de físicos, sociales y mentales (3 en cada una).\n
		Hay un total de treinta habilidades que se dividen en las categorías de talentos, técnicas y conocimientos (10 en cada una).\n
		Además el juego da la posibilidad opcional de utilizar habilidades secundarias, méritos y defectos.\n
		Cuando se tiene una especialidad en un atributo o habilidad después de tirar cada 10 obtenido en la tirada cuenta como dos éxitos, en cambio cada uno obtenido en los dados de 10 caras resta un éxito del total.
<br>
      </div>
    </div>
  </div>
  <div class="accordion-item">
    <h2 class="accordion-header" id="headingTwo">
      <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
        Ejemplos:
      </button>
    </h2>
    <div id="collapseTwo" class="accordion-collapse collapse" aria-labelledby="headingTwo" data-bs-parent="#accordionExample">
      <div class="accordion-body">
        <strong class="text-warning">Nadar:</strong> para tirar sumamos el atributo resistencia y la habilidad de atletismo (si el personaje tuviese 3 puntos en resistencia y 2 en atletismo tiraríamos 5 dados).<br>
        <strong class="text-warning">Actuación:</strong> para tirar sumamos el atributo carisma y la habilidad de interpretación (si el personaje tuviera 4 puntos en carisma y 3 en interpretación tiraríamos 7 dados).<br>
        <strong class="text-warning">Investigar:</strong> para tirar sumamos el atributo percepción y la habilidad investigación (si el personaje tuviese 1 punto en percepción y 4 en investigación tiraríamos 5 dados) .
      </div>
    </div>
  </div>
</div>
</div>
            <div class="col-sm-3">
              <div class="container">
                <img id="st" class="gal" src="resources\img\chan1.jpeg" alt="">
                <img class="gal" src="resources\img\chan3.jpeg" style="width: 12rem;" alt="">
                
              </div>
                <br>
                <br>
 <a class="btn btn-primary btn-sm" href="juegos" role="button">Volver a Juegos</a>
 
 		<footer>
			<jsp:include page="footer.jsp"></jsp:include>
		</footer>
                    
<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>