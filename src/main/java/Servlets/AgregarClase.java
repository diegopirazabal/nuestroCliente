package Servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import turismoservidor.Actividad;
import turismoservidor.ActividadNoExisteException_Exception;
import turismoservidor.ClaseRepetidaException_Exception;
import turismoservidor.DataTypeUsuario;

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
		DataTypeUsuario usuario = (DataTypeUsuario) session.getAttribute("usuario_logueado");
		String sessionUsername = usuario.getNickname(); // Usa el getter correspondiente.

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
		GregorianCalendar calendar = new GregorianCalendar();
        XMLGregorianCalendar fechaAlta = null;
		try {
			fechaAlta = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String hora = request.getParameter("hora");

		String cupoStr = request.getParameter("cupos"); // Obtener el valor como String
		int cupo = Integer.parseInt(cupoStr);
		String img = "casa";
		String lugar = request.getParameter("lugar");
		try {
			port.crearClase(nombre, fechaAlta, hora, lugar, fechaAlta, img, cupo, aux);
		} catch (ClaseRepetidaException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.getRequestDispatcher("/agregarClase.jsp").forward(request, response);
	}

}