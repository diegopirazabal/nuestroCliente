<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
 <!-- Para dispositivo movil, se adapata al ancho del dispositivo, sacala=1 , evita reduccion de escala -->

<!-- Bootstrap CSS. Permite usar los estilos de Boostrap 4 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

<title>Homepage</title>
</head>

<body>      <!-- Estilo de la barra de navegacion, defino el estilo y el comportamiento en esta linea, con Boostrap 4 -->
	<nav class="navbar navbar-expand-lg navbar-light bg-light"> <a 	class="navbar-brand" href="#">MenúTurismo</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarSupportedContent"> <!-- collapse para agrupar los elementos  -->
		<ul class="navbar-nav mr-auto">         <!-- este auto para alinear a la derecha  -->
			<li class="nav-item active"><a class="nav-link" href="#">Homepage <span class="sr-only">(current)</span>
			</a></li>
			<li class="nav-item"><a class="nav-link" href="agregarUsuario.jsp">Agregar Usuario</a></li>
			<li class="nav-item"><a class="nav-link" href="agregarActividad.jsp">Agregar Actividad</a></li>
			<li class="nav-item"><a class="nav-link" href="agregarSalida.jsp">Agregar Salidas</a></li>
			<li class="nav-item"><a class="nav-link" href="consultas.jsp">Consultas</a></li>
		</ul>
	</div>
	</nav>

	<div id="carouselExampleSlidesOnly" class="carousel slide" data-ride="carousel" data-interval="2000">
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img class="d-block w-100" src="imagenes/arreglo-articulos-viaje-bodegon.jpg" alt="First slide" >
			</div>
			<div class="carousel-item">
				<img class="d-block w-100" src="imagenes/mano-mujer.jpg" alt="Second slide">
			</div>
			<div class="carousel-item">
				<img class="d-block w-100" src="imagenes/mujer-joven-relajante-naturaleza.jpg" alt="Third slide">
			</div>
			<div class="carousel-item">
				<img class="d-block w-100" src="imagenes/img4.jpg" alt="Third slide">
			</div>
		</div>
	</div>


	
</body>
</html>