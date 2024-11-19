<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!-- Esto para usar jstl, etiqueta por ej para un combo con foreach  -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<!-- Bootstrap CSS. Permite usar los estilos de Boostrap 4 -->
<link rel="stylesheet" 	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

  <!-- En head difinimos metadatos -->
	   <jsp:include page="/head.jsp"/> 
	          <!-- Texto de la pestaña del navegador -->
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
   
  
    
    <br>
    <br>
    <br>
    
   <div class="centered-content" >    
	   <h1>Consultar Actividades</h1><!-- Ejemplo de estilo CSS para el titulo-->
   </div>	
     
  <form action="ElegirActividad" method="post" style="display: block; margin-bottom: 20px;">
	  	
	<div class="centered-content">
	 	        <input type="hidden" name="parametro" value="actividad" />  
	 	        <button  type="submit" class="styled-button">Consultar Actividad</button>
				<select  id="comboSeleccionNew" >
    			<c:forEach items="${opciones}" var="opcion">
     				   <option value="${opcion}">${opcion}</option>
    		    </c:forEach>
 			    </select>
 	 		    
	  </div>       
	   <!-- Etiqueta para cargar la selección con none lo dejo oculto -->
       <p id="seleccion" style="display: none;"></p>  
		       
		<script>
		            
	   // Obtener el combo y la etiqueta por sus IDs o class
	   var combo = document.getElementById("comboSeleccionNew"); // El combo
	   var etiqueta = document.getElementById("seleccion");   // Etiqueta donde voy a cargar la seleccion
			        
				
	  // Agregar un evento de cambio al combo, cuando cambio la seleccion
      combo.addEventListener("change", function() {
	  // Obtener el valor seleccionado del combo
	   var seleccion = combo.value;
			     
	  // Actualizar el contenido de la etiqueta p  id="seleccion" con la selección 
		     			   
	  etiqueta.textContent =seleccion;       
	 
	  var valorSeleccion = document.getElementById("seleccion").textContent; // variable para parametro
	  document.getElementById("seleccionActividad").value = seleccion;  // parametros a mandar en el siguiente form
	  console.log("Hola, este es un mensaje en la consola: " + seleccion);// Consola del Browser    			   
    });
	</script>    

    </form>
     
     
     <div class="centered-content" >
       <h1>Salidas para la Actividad seleccionada</h1>
     </div> 
     
     <form action="ElegirActividad" method="post" style="display: block; margin-bottom: 20px;">

     <div class="centered-content" >
      <input type="hidden" name="parametro" value="salidas" />  
      <input type="hidden" id="seleccionActividad" name="seleccionActividad" value="">
	  <button  type="submit" class="styled-button">Consultar Salidas</button>
      <table border="1">
        <thead>
            <tr>
                <th>Descripcion de la salida </th>
           
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${opcionesSalidas}" var="usuario">
                <tr>
                    <td>${usuario}</td>
                  
                </tr>
            </c:forEach>
        </tbody>
    </table>
     </div>
     </form>
</body>
</html>