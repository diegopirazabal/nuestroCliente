<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- Esto para usar jstl, etiqueta por ej para un combo con foreach  -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
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


 <h1>Agregar Salida</h1>
 
     <form action="consultaActividades" method="post" style="display: block; margin-bottom: 20px;">
	  	
	 	 <div class="centered-content">
	 	        <input type="hidden" name="parametro" value="actividad" />  
	 	        <button  type="submit" class="styled-button"> Elegir Actividad</button>
				<select  name= "opcion" id="comboSeleccionNew" >
    			<c:forEach items="${opciones}" var="opcion">
     				   <option value="${opcion}">${opcion}</option>
    		    </c:forEach>
 			    </select>
 	 	 </div>
	
	 <!-- Etiqueta para mostrar la selección -->
    <p id="seleccion" style="display: none;"></p>      
	
	<script>
		
	   // ESTO PARA ACTUALIZAR LA SELECCION DEL COMBO
	   // Obtener el combo y la etiqueta por sus IDs o class
	   var combo = document.getElementById("comboSeleccionNew"); // El combo
	   var etiqueta = document.getElementById("seleccion");   // Etiqueta donde voy a cargar la seleccion
			        
				
	  // Agregar un evento de cambio al combo, cuando cambio la seleccion
      combo.addEventListener("change", function() {
	  // Obtener el valor seleccionado del combo
	  var seleccion = combo.value;
			     
	  // Actualizar el contenido de la etiqueta p  id="seleccion" con la selección 
	  etiqueta.textContent =seleccion;       
	  
	// Configurar el valor del campo oculto para enviar al servidor
      document.getElementById("seleccionActividad").value = seleccion;

      // Mostrar un mensaje en la consola
      console.log("Hola, este es un mensaje en la consola: " + seleccion);// Consola del Browser
	  
	     			   
    });
	</script>    
	
	
      </form>
 
    <br>
	<form action="AgregarSalida" method="post">
		
		<div class="form-inline" style="padding-left: 400px;">
			<label >Nombre:</label> <input type="text" name="nombre" style="width: 600px;" class="form-control" 
			id="nombre" placeholder="Ingrese un nombre ">
		</div>
		<br>
		<div class="form-inline" style="padding-left: 400px;">
           <label >Ingresa una fecha:</label> <input type="date" id="fecha" name="fecha" style="width: 600px;"
           class="form-control" id="fecha" placeholder="Ingresa fecha">
        </div>
		<br>
		<div class="form-inline" style="padding-left: 400px;">
			<label>Hora:</label> <input type="number" name="hora" style="width: 600px;" 
			class="form-control" id="hora" placeholder="Ingrese una hora ">
		</div>
		<br>
		<div class="form-inline" style="padding-left: 400px;">
			<label>Maximos turistas:</label> <input type="number" name="turistasMax" style="width: 600px;"
			 class="form-control" id="turistasMax" placeholder="Ingrese cantidad ">
		</div>
		<br>
		<div class="form-inline" style="padding-left: 400px;">
           <label>Ingresa una fecha de alta:</label> <input type="date" id="numero" name="fecha_alta" 
           style="width: 600px;" class="form-control" id="fecha_alta" placeholder="Ingresa fecha">
        </div>
		<br>
		<div class="form-inline" style="padding-left: 400px;">
			<label>Lugar:</label> <input type="text" name="lugar" style="width: 600px;" 
			class="form-control" id="lugar" placeholder="Ingrese un lugar">
		</div>
	    <br>
		 <input type="hidden" id="seleccionActividad" name="seleccionActividad" value="">	
	    <br>
		<button type="submit" class="btn btn-primary">Agregar Salida</button>
      </form>
      
      	<br><br><br>
	  
    </div>  
   
 </body>  
 

</html>