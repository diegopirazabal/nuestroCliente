package Servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import turismoservidor.DataListaClases;
import turismoservidor.DataTypeActividad;

@WebServlet("/ConsultaActividad")
public class ConsultaActividad extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ConsultaActividad() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombreActividad = request.getParameter("actividades");
        System.out.println("La actividad que me traje a consultaActividad es: " + nombreActividad);
        turismoservidor.PublicadorService service=new turismoservidor.PublicadorService();
        turismoservidor.Publicador port= service.getPublicadorPort();
        DataTypeActividad actividad = null;

        try {
            actividad = port.consultarActividad(nombreActividad);
            String lugar = actividad.getLugar();
            int duracion = actividad.getDuracion();
            double costo = actividad.getCosto();
            DataListaClases auxiliar = null;
            auxiliar = port.listarClasesPorActividad(nombreActividad);
            request.setAttribute("listaCla", auxiliar);
            request.setAttribute("nombre", nombreActividad);
            request.setAttribute("lugar", lugar);
            request.setAttribute("duracion", duracion);
            request.setAttribute("costo", costo);
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "No se encontró la actividad.");
        }

        RequestDispatcher rd = request.getRequestDispatcher("/consultarActividad.jsp");
        rd.forward(request, response);
    }
}