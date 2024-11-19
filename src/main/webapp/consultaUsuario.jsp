<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>                              
<!-- Bootstrap CSS. Permite usar los estilos de Boostrap 4 -->
<link rel="stylesheet" 	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>

         <!-- En head difinimos metadatos -->
	   <jsp:include page="/head.jsp"/> 
	
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
			<li class="nav-item"><a class="nav-link"
				href="consultas.jsp">Consultas</a></li>
		</ul>
	</div>
	</nav>

  
 

<!-- Ahora el contenedor central -->

<div class="contenedor_principal main">            
		<div class="izquierda">                                  <!-- Div central izquierda -->
			<h2>Ingrese cedula del usuario</h2> 
		</div>
		<div class="derecha">                                      <!-- Div central derecha -->
			<!-- formulario de login -->
			<form action="DetalleUsuario" method="POST">     <!-- En la clase login esta el servlet iniciar-sesion -->
			<input class="input_blur" type="text" name="cedUsuario"
					value="" onMouseDown="sacarBlurReset(event);"/>  <!-- Limpio la caja de texto mail -->
			<br/>
		    <br>	
			<br/>
			<input type="button" value="Consultar" onclick="submit()"/>
			<h2>Datos del usuario:</h2>
			<div class="usuario-info">
			    <label class="etiquetaUsuario" for="nombre1">Nombre: </label>
			    <p class="datosUsuario">${nombre}</p>
			 </div>  
			 <div class="usuario-info">   
			    <label class="etiquetaUsuario" for="apellido">Apellido: </label>
			    <p class="datosUsuario">${apellido}</p>
			  </div>    
			  <div class="usuario-info">
			     <label class="etiquetaUsuario" for="cedula">Cedula: </label>
			    <p class="datosUsuario">${cedula}</p>
			  </div>
			   <div class="usuario-info">
			     <label class="etiquetaUsuario" for="nacionalidad">Nacionalidad: </label>
			    <p class="datosUsuario">${nacionalidad}</p>
			  </div>
			   <div class="usuario-info">
			     <label class="etiquetaUsuario" for="nacionalidad">Descripcion: </label>
			    <p class="datosUsuario">${descripcion}</p>
			  </div>
			</form>
		</div>
	</div>
</body>
</html>