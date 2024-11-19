<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS. Permite usar los estilos de Boostrap 4 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	
/>

</head>
<body>

 <!-- Utiliza boostrap para la barra de navegacion, fondo claro con bg-ligth tamaño grande con expand  --> 
	<nav class="navbar navbar-expand-lg navbar-light bg-light"> <a class="navbar-brand" href="#">MenúTurismo</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false" 	aria-label="Toggle navigation">
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
		</ul>
	</div>
	</nav>

<div class="text-center">
 <h1>Agregar Actividad</h1>
	<form action="AgregarActividad" method="post">
		
		<div class="form-inline" style="padding-left: 200px;">
			<label for="nombre"  class="mr-3">  Nombre:</label> <input type="text" name="nombre" style="width: 600px;" 
			class="form-control" id="nombre" placeholder="Ingrese un nombre ">
		</div>
		<br>
		<div class="form-inline" style="padding-left: 200px;">
			<label for="costo" class="mr-3">Costo:</label> <input type="number" name="costo" style="width: 600px;" 
			class="form-control" id="costo" placeholder="Ingrese un costo ">
		</div>
		<br>
		<div class="form-inline" style="padding-left: 200px;">
           <label for="fecha_hasta" class="mr-3">Ingresa una fecha:</label> <input type="date" name="fecha_hasta" style="width: 600px;" 
           class="form-control" id="fecha_hasta" placeholder="Ingresa fecha">
        </div>
		<br>
		<div class="form-inline" style="padding-left: 200px;">
			<label for="proveedor" class="mr-3">Proveedor:</label> <input type="text" name="proveedor" style="width: 600px;"
			 class="form-control" id="proveedor" placeholder="Ingrese un proveedor">
		</div>
	
	   <br>
		<button type="submit" class="btn btn-primary">Agregar Actividad</button>
      </form>
      
      	<br><br><br>
	
    </div>  
     
 </body>  
 
</html>