package Servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.xml.datatype.XMLGregorianCalendar;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import turismoservidor.UsuarioRepetidoException_Exception;


@WebServlet("/AgregarUsuario")
public class AgregarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AgregarUsuario() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

        turismoservidor.PublicadorService service=new turismoservidor.PublicadorService();
        turismoservidor.Publicador port= service.getPublicadorPort();
        
        System.out.println("Ahora los parametros"); 

		String nickname = request.getParameter("nickUsuario");
		String nombre = request.getParameter("nombreUsuario");
		String apellido = request.getParameter("apellidoUsuario");
		String email = request.getParameter("emailUsuario");
		String fechaNac1 = request.getParameter("fechaNac1");
		XMLGregorianCalendar fechaNac = null;
//		try {
//			fechaNac = new SimpleDateFormat("yyyy-mm-dd").parse(fechaNac1);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		String contrasena = request.getParameter("passUsuario");
		String contrasena2 = request.getParameter("passUsuario2");// para comparar
		String disciplina = request.getParameter("disciplina");
		String sitioweb = request.getParameter("sitioWeb");
		String cedula = request.getParameter("cedula");
		Boolean esProfesional1 = null;
		String esProfesional = null;
		Boolean esEntrenador;
		System.out.println("\nEl valor del checkbox que traigo es: " + esProfesional);
		if (contrasena.equals(contrasena2)) {

			try {
				if (request.getParameter("opciones").equals("deportista")) {
					esProfesional = request.getParameter("esProfesional");
					if (esProfesional.equals(null))
						esProfesional1 = false;
					if (esProfesional.equals("on"))
						esProfesional1 = true;
					esEntrenador = false;
					port.crearDeportista(nickname, nombre, apellido, email, fechaNac, esEntrenador, contrasena,
							esProfesional1);
					System.out.println("CREE EL DEPORTISTA CON PORT");
				} else if (request.getParameter("opciones").equals("entrenador")) {

					esEntrenador = true;
					port.crearEntrenador(nickname, nombre, apellido, email, fechaNac, esEntrenador, contrasena,
							disciplina, sitioweb);
				}
				
				RequestDispatcher rd;
				request.setAttribute("mensaje", "Se ha ingresado correctamente el usuario " + nombre + " de nick "
						+ nickname + " en el sistema.");
				rd = request.getRequestDispatcher("/notificacion.jsp");
				rd.forward(request, response);
			} catch (UsuarioRepetidoException_Exception e) {
				// TODO Auto-generated catch block
				RequestDispatcher rd;
				request.setAttribute("mensaje",
						"Ya existe un usuario con ese correo (" + email + ") o ese nickname (" + nickname + ").");
				rd = request.getRequestDispatcher("/notificacion.jsp");
				rd.forward(request, response);
			}
		}
	}
}
