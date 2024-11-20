package Servlets;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import turismoservidor.ClaseNoExisteException_Exception;
import turismoservidor.DataListaClases;
import turismoservidor.DataTypeClase;
import turismoservidor.DataTypeUsuario;

@WebServlet("/ConsultaClase")
public class ConsultaClase extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ConsultaClase() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	turismoservidor.PublicadorService service=new turismoservidor.PublicadorService();
        turismoservidor.Publicador port= service.getPublicadorPort();
        HttpSession session = request.getSession();
        DataTypeUsuario usuario = (DataTypeUsuario) session.getAttribute("usuario_logueado");
		String sessionUsername = usuario.getNickname(); // Usa el getter correspondiente.

        String actividad = request.getParameter("actividades");

        List<DataTypeClase> aux = null;
        try {
            aux = port.listarClasesPorActividad(actividad).getClases();
            request.setAttribute("listCla", aux);
            request.getRequestDispatcher("/consultaClase.jsp").forward(request, response);

        } catch (ClaseNoExisteException_Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}