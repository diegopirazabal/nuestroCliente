package Servlets;

import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import turismoservidor.DataTypeUsuario;
import turismoservidor.UsuarioNoExisteException_Exception;

/**
 * Servlet implementation class Home
 */
@WebServlet("/perfil")
public class Perfil extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Perfil() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		turismoservidor.PublicadorService service=new turismoservidor.PublicadorService();
        turismoservidor.Publicador port= service.getPublicadorPort();;

		Object logueado = session.getAttribute("usuario_logueado");
		DataTypeUsuario usuario = (DataTypeUsuario) session.getAttribute("usuario_logueado");
		
        String sessionUsername = usuario.getNickname(); // Usa el getter correspondiente.
		DataTypeUsuario aux;

		try {
			aux = port.verInfoUsuario(sessionUsername);
			System.out.println("El usuario que despliego: " + aux.getNickname());
			request.setAttribute("nombre", aux.getNombre());
			request.setAttribute("prueba", aux.getNombre());
			request.setAttribute("apellido", aux.getApellido());
			request.setAttribute("nickname", aux.getNickname());
			request.setAttribute("email", aux.getEmail());
			XMLGregorianCalendar fecha = aux.getFNacimiento();
			Date date = fecha.toGregorianCalendar().getTime(); // Convertir XMLGregorianCalendar a Date
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			String fechaFormateada = sdf.format(date); // Formatear la fecha
			request.setAttribute("fecha", fechaFormateada);

			String nombre = request.getParameter("nuevoNombre");
			String apellido = request.getParameter("nuevoApellido");
			System.out.println("Nombre para modificar es: " + nombre + "\nApellido para modificar es: " + apellido);
//			 port.editarNombreApellido(sessionUsername, nombre, apellido);
//			 aux = port.verInfoUsuario(sessionUsername);
//			 System.out.println("El usuario modificado es: " + aux.getNombre() + " " +
//			 aux.getApellido());
//			 request.getRequestDispatcher("/PerfilModificado.jsp").forward(request,
//			 response);

			request.getRequestDispatcher("/perfil.jsp").forward(request, response);

		} catch (UsuarioNoExisteException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}