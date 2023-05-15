# VROL SITE
### Portafolio

|Creador|git|
|-------|---|
|Cristian Carrillo|cristian-pgit|

## Sitio para Comunidad de Rol V Rol

<p style="text-align: justify;">
##Introducción
Como proyecto de portafolio aborde parte de las necesidades de la Comunidad VRol de la cual
participo, así que hagamos una leve introducción para repasar los puntos que dan razón a este
proyecto:
###¿Qué es la Comunidad VRol?
La comunidad de VRol, es como indica una Comunidad de distintas personas, siendo la mayoría de
la Quinta Region (ende la V para indicar Quinta) y de otros lugares de Chile, siendo su nombre oficial
Quinta Rol. Esta parte como la iniciativa de ser un punto de encuentro para los amantes de los Juegos
de Rol. Esto ya que en la Quinta región no se encontraban tan organizados como los que juegan en
la región Metropolitana, y que sobre todo en tiempos de COVID donde las juntas presenciales no se
pudiesen realizar con normalidad (o realizarse siquiera) hiciera que varios quedaran aislados. El
grupo en si parte en Facebook por miembros integrantes de un Grupo mas grande en Chile que es
Roleros.cl, también organizando un grupo de chat de WhatsApp para tratar de reunir a todos los
roleros de la región para así poder organizar partidas online, y su ocasional presencial, y es aquí en
este punto donde comienza a surgir esta necesidad.
Textos de chat perdidos
Una de las primeras cosas que se empezaron a notar, es que pasaba a menudo que la información
pertinente a la organización de las partidas se perdía en el gran flujo de mensajes del chat (estamos
hablando que hay mínimo un flujo de 200 mensajes al día) por lo cual siempre se tenia que estar
preguntando cada tanto a los administradores por esta información pertinente. Esto creo la primera
herramienta de control que fue crear una Calendario Google que tiene una información básica de las
partidas que se están llevando a cabo y parte de la planificación de eventos de la comunidad.
Información relevante poco accesible.
Depender del calendario ayudo, pero no eliminaba todo, sin mencionar que el calendario era visible
solo para administradores, quienes procedían a sacar una leve captura cada vez que se preguntaba
(hasta el día de hoy aun se hace), lo que llevo a que se usara el medio usual para realizar las partidas
on-line para también dejar una agendacion de los eventos, Discord. Pero esta plataforma aun
funciona como chat, por lo cual si bien las secciones dejadas para el posteo de eventos estaban
bloqueadas para posteo, esto aun no deja una claridad inmediata sobre algunos de los datos de la
partida, aunque ha sido una mejora sin duda.
Entonces, como se puede apreciar, en favor de crear algo que sirva para unificar las fuentes de
información de las mesas y eventos es que decidí tomar esto como caso de desarrollo para mi
Portafolio.
</p>

# Indice

1. Instrucciones de instalación.
2. Configuración de la Base de Datos.
3. Usos y funcionalidad.
4. Rúbrica Evaluativa.

# 1. Instrucciones de Instalación.

Sigue los siguientes pasos para instalar y configurar el proyecto en tu entorno local:

1. Descarga un IDE para trabajar con proyectos en lenguaje Java. Algunas opciones populares incluyen Eclipse, STS y IntelliJ IDEA. (Durante el desarrollo se utilizó IntelliJ)

2. Clona el repositorio del proyecto desde GitHub directamente desde el link: [Portafolio VRol Site](https://github.com/cristian-pgit/M6-Portafolio.git) y hacer un "git clone" con el.

3. El proyecto utiliza la estructura de Maven, por lo que necesitarás instalar las dependencias definidas en el archivo pom.xml. Ejecuta el comando Update Maven Proyect, y de preferencia habilitar la opcion para forzar el update.

4. Este al ser un proyecto Springboot no necesita tener un servidor local habilitado pues ya esta embebido Tomcat.

5. Finalmente ejecuta el proyecto con el comando Run as Springboot proyect.

# 2. Configuración de la Base de Datos

El sistema de administración de base de datos relacionales utilizado en este proyecto es MySQL. A continuación, se detalla la configuración necesaria:

- El script de creación de la base de datos se encuentra dentro del git de portafolio bajo el nombre de: `vroldbFinal.sql` Este script es un archivo de autocreacion, solo necesita que desde MySQL importe este archivo, este contiene ya datos pregenerados para poder mostrar datos y hacer login.

Asegúrate de tener MySQL instalado en tu entorno de desarrollo antes de ejecutar el script mencionados anteriormente. Puedes obtener MySQL desde el sitio web oficial de MySQL.

# 3. Usos y Funcionalidad

La aplicación ofrece las siguientes funcionalidades principales:

- ### Informacion general de la Comunidad: 
    La aplicación cuenta con una vista inicial para hablar un poco de la Comunidad y las Normas, de ahi tiene las siguientes vistas:
    -Juegos, da una vista general de algunos juegos de rol Existentes y la idea es proyectar una lista de las mesas vigentes con cupos actuales.
    -Calendario, presente una vista del calendario oficial de las actividades programadas, las mesas que estan vigentes, y las que se vienen.
    -Contacto, formulario de contacto para enviar mensajes, de momento estos se almacenan en bd.
    -Mesas, despliega las mesas que estan buscando jugadores, este permite a los usuarios conocer mas sobre las mesas y poder inscribirse en una.
    -Juntas, es un album con fotos de las juntas mensuales y quizas de uno que otro evento.
    -Links Utilies, contiene links para las distintas redes sociales del grupo.
    - y finalmente la vista de Login, donde los usuarios registrados podran ingresar a las secciones especificas

- ### Narrador (CRUD): 
    La seccion de Narrador, solo visible para usuarios con perfil de Narrador/Administrador, contiene la capacidad para listar los jugadores que se han inscrito a las mesas, permite editar su informacion en caso de saber que colocaron algun dato mal, y tambien la opcion de eliminarlos. Este menu en la seccion de Listar Inscritos cuenta con la opcion de desplegar una vista en formato PDF de los inscritos la cual puede ser guardada e impresa.
    
- ### Menu Administrador (CRUD): 
    La seccion de Narrador, solo visible para usuarios con perfil de Administrativo,  contiene la capacidad para listar usuarios, crear usuario, editar usuarios y eliminar usuarios.

# 4. Rúbrica Evaluativa.

Hago mencion a rubrica evaluativa en [Documento de Portafolio](https://github.com/cristian-pgit/M6-Portafolio/blob/main/PROYECTO%20DE%20PORTAFOLIO.pdf)

# 5. Conclusión
Puedo decir que ha sido una Aventura, sin más, entre buscar información, documentarse, ir, intentar,
probar, seguir probando, ver las innumerables veces que el código me ha estallado. Pero el resultado
final me deja satisfecho. Hay mucho mas por hacer para seguir perfeccionando este proyecto muchas
mas funcionalidades que le quiero agregar y mucho más. ¿Y quién sabe?, aprendiendo nuevas
tecnologías, permitirme darle una vuelta mas tarde y convertirla en una app para celular.
A destacar debo dejar que hacer la lógica de la construcción de la inscripción de Jugadores y la de
mesas es una que me hizo pasar bastante tiempo.


#### Objetivos a Cumplir
- [x] Estructura basica
- [x] Desarrollar Estructura de Paginas visibles
- [x] Crear Base de Datos
- [x] Lograr Conexion a Base de Datos
- [x] Trabajar Funcionalidad
- [x] Servicio REST
- [x] Add delight to the experience when all tasks are complete :tada:
- [ ] Terminar Vistas (opcionales)
- [ ] Terminar otras Funcionalidades (opcionales)
