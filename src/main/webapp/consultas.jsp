<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- Esto para usar jstl, etiqueta por ej para un combo con foreach  -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">      <!-- Codificacion de caracteres utilizado en el html -->
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
         <!-- Para dispositivo movil, se adapata al ancho del dispositivo, sacala=1 , evita reduccion de escala -->
         
<!-- Bootstrap CSS -->

<link rel="stylesheet" 	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
<title>Turismo | Consultas</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light"> <a class="navbar-brand" href="#">MenúTurismo</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link" href="#">Homepage
					<span class="sr-only">(current)</span>
			</a></li>
				<li class="nav-item"><a class="nav-link" href="agregarUsuario.jsp">Agregar Usuario</a></li>
			<li class="nav-item"><a class="nav-link" href="agregarActividad.jsp">Agregar Actividad</a></li>
			<li class="nav-item"><a class="nav-link" href="agregarSalida.jsp">Agregar Salidas</a></li>
			<li class="nav-item"><a class="nav-link" href="consultas.jsp">Consultas</a></li>
			<li class="nav-item">
			    <a>Consultas</a>
			    <ul>
			       <li><a class="nav-link" href="consultaUsuario.jsp">Consulta de Usuario</a></li>
                   <li><a class="nav-link"href="consultaActividad.jsp">Consulta de Actividades y Salidas </a></li>
                   <!-- Agrega más elementos del submenú aquí -->
                </ul>
		    </li>
		</ul>
	</div>
	</nav>
	
</body>
</html>