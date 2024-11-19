package Servlets;

import java.io.IOException;
import java.util.List;

import dtos.dataTypeClase;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import turismoservidor.ClaseNoExisteException_Exception;

@WebServlet("/cargarClases")
public class cargarClases extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public cargarClases() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	turismoservidor.PublicadorService service=new turismoservidor.PublicadorService();
        turismoservidor.Publicador port= service.getPublicadorPort();
        HttpSession session = request.getSession();
        Object logueado = session.getAttribute("usuario_logueado");
        String x = logueado.toString();
        String[] parts = x.split(" - ");
        String sessionUsername = parts[0].trim();
        String actividad = request.getParameter("actividades");
        System.out.println("La actividad que traigo a cargar clases es: " + actividad);
        List<dataTypeClase> aux = null;
        try {
            aux = port.listarClasesPorActividad(actividad);
            request.setAttribute("listaCla", aux);
            request.getRequestDispatcher("/inscripcion.jsp").forward(request, response);
        } catch (ClaseNoExisteException_Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}