<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %> <%@ taglib prefix="fmt"
uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta charset="utf-8" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1, shrink-to-fit=no"
    />

    <!-- Bootstrap CSS -->
    <link
      rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
      integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
      crossorigin="anonymous"
    />
    <title>Turismo | Consultas</title>

    <style>
      #listaAct,
      #listaCla,
      #listaInsc,
      #soyEse,
      #costoClase,
      #prueba {
        display: none;
      }

      .form-section {
        margin-bottom: 30px;
      }

      .page-title {
        margin-top: 20px;
        margin-bottom: 40px;
      }
    </style>
  </head>
  <body>
    <jsp:include page="/head.jsp" />
    <div class="container">
      <div class="row">
        <div class="col-12 text-center page-title">
          <h1>Mi perfil</h1>
        </div>
      </div>

      <div class="row justify-content-center form-section">
        <div class="col-md-6">
          <form action="perfil" method="post" class="text-center">
            <div class="form-group">
              <button type="submit" class="btn btn-primary btn-block">
                Recargar mis datos
              </button>
            </div>
          </form>
          <div class="form-group">
            <form action="PerfilModificado" method="post" class="text-center">
              <div class="row justify-content-center form-section">
                <div class="col-12 text-center">
                  <h2>Datos de usuario</h2>
                  <label>Nombre:</label>
                  <input
                    type="text"
                    name="nombre"
                    class="form-control"
                    id="nombre"
                    value="${nombre != null ? nombre : ''}"
                  />
                  <label>Apellido:</label>
                  <input
                    type="text"
                    name="apellido"
                    class="form-control"
                    id="apellido"
                    value="${apellido != null ? apellido : ''}"
                  />
                  <label>Nickname:</label>
                  <input
                    type="text"
                    name="nickname"
                    class="form-control"
                    id="nickname"
                    value="${nickname != null ? nickname : ''}"
                  />
                  <label>Email:</label>
                  <input
                    type="email"
                    name="email"
                    class="form-control"
                    id="email"
                    value="${email != null ? email : ''}"
                  />
                  <label>Fecha de Nacimiento:</label>
                  <input
                    type="text"
                    name="fecha"
                    class="form-control"
                    id="fecha"
                    value="${fecha != null ? fecha : ''}"
                  />
                </div>
              </div>
              
            </form>
          </div>
        </div>
      </div>

      <p id="prueba"></p>

      <div class="row justify-content-center">
        <div class="col-md-6" id="contenedorElementos">
          <!-- Aquí pueden ir los elementos dinámicos -->
        </div>
      </div>

      <div class="row justify-content-center">
        <div class="col-md-6" id="contenedorElementos2">
          <!-- Aquí pueden ir los elementos adicionales -->
        </div>
      </div>

      <div class="row justify-content-center">
        <div class="col-12"></div>
      </div>
    </div>
  </body>
  <script>
    var cajaNickname = document.getElementById("nickname");
    var cajaEmail = document.getElementById("email");
    var cajaFecha = document.getElementById("fecha");
    cajaNickname.readOnly = true;
    cajaEmail.readOnly = true;
    cajaFecha.readOnly = true;
    //cajaFecha.textContent = fecha.slice(0, -18);
    var prueba = document.getElementById("prueba").innerHTML;
    console.log(prueba);
    var botonGuardar = document.getElementById("botonGuardar");
    botonGuardar.addEventListener("click", function () {});
  </script>
</html>
