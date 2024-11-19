package Servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import turismoservidor.Actividad;
import turismoservidor.ActividadNoExisteException_Exception;
import turismoservidor.ClaseRepetidaException_Exception;

@WebServlet("/AgregarClase")
public class AgregarClase extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AgregarClase() {
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
		String sessionUsername = parts[0].trim(); // "carlos"
		String sessionFullName = parts[1].trim(); // "Carlos Tevez"

		String nombre = request.getParameter("nombre");

		String actividad = request.getParameter("actividades");
		Actividad aux = null;
		try {
			aux = port.consultarActividad2(actividad);
		} catch (ActividadNoExisteException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String fechaNac1 = request.getParameter("fecha");
		Date fechaNac = null;
		try {
			fechaNac = new SimpleDateFormat("yyyy-mm-dd").parse(fechaNac1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date fechaAlta = new Date();
		String hora = request.getParameter("hora");

		String cupoStr = request.getParameter("cupos"); // Obtener el valor como String
		int cupo = Integer.parseInt(cupoStr);
		String img = "";
		String lugar = request.getParameter("lugar");
		try {
			port.crearClase(hora, null, cupoStr, img, fechaAlta, lugar, cupo, aux);
		} catch (ClaseRepetidaException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.getRequestDispatcher("/agregarClase.jsp").forward(request, response);
	}

}