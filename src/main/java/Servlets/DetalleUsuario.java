package Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import turismoservidor.Actividad;
import turismoservidor.Clase;
import turismoservidor.ClaseNoExisteException_Exception;
import turismoservidor.DataListaActividades;
import turismoservidor.DataListaClases;
import turismoservidor.DataListaInscripciones;
import turismoservidor.DataTypeActividad;
import turismoservidor.DataTypeClase;
import turismoservidor.DataTypeInscripcion;
import turismoservidor.DataTypeUsuario;
import turismoservidor.UsuarioNoExisteException_Exception;

@WebServlet("/DetalleUsuario")
public class DetalleUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DetalleUsuario() {
		super();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession objSesion = request.getSession();
		DataTypeUsuario usuario = (DataTypeUsuario) objSesion.getAttribute("usuario_logueado");
		String sessionUsername = usuario.getNickname(); // Usa el getter correspondiente.
		turismoservidor.PublicadorService service=new turismoservidor.PublicadorService();
        turismoservidor.Publicador port= service.getPublicadorPort();;
		String nickname = request.getParameter("nickname");

		DataTypeUsuario result = null;
		String prueba = request.getParameter("opciones");
		System.out.println("veo q traigo de la lista de usuarios: " + prueba);
		System.out.println("nickname: " + nickname);
		if (!sessionUsername.equals(nickname)) {// Usuario logueado != Usuario buscado
			try {
				System.out.println(
						"Llegue al if de usuario != usuario logueado y el usuario logueado es: " + sessionUsername);
				result = port.consultarUsuario(nickname);
				if (result == null) {
					request.getRequestDispatcher("/usuarioInexistente.jsp").forward(request, response);
					return;
				}
				request.setAttribute("nombre", result.getNombre());
				request.setAttribute("apellido", result.getApellido());
				request.setAttribute("fechaNac", result.getFNacimiento());
				request.setAttribute("email", result.getEmail());
				request.setAttribute("iguales", false);
				if (result.getTipo()) {// es Entrenador
					DataListaActividades actividadesDelEntrenador = port.obtenerActividadesConfirmadasPorEntrenador(nickname);
					List<DataTypeActividad> auxiliar = actividadesDelEntrenador.getActividades();
					List<DataTypeClase> auxiliar2 = null;
					DataListaClases clasesRelacionadas = new DataListaClases();
					for (int i = 0; i < auxiliar.size(); i++) {
						DataListaClases clasesPorActividad = port.listarClasesPorActividad(auxiliar.get(i).getNombre());
						auxiliar2 = clasesPorActividad.getClases();		
						System.out.println("Las clases que me traje de la actividad " + auxiliar.get(i).getNombre() + " son: " + auxiliar2 + " \n");
						clasesRelacionadas.setClases(auxiliar2);						
					}
					request.setAttribute("disciplina", auxiliar);
					request.setAttribute("auxiliar", auxiliar2);
					request.setAttribute("tipoUsuario", "Entrenador");
				} else {
					DataListaInscripciones listaInscripciones = port.listarInscripcionesPorClase(nickname);
					List<DataTypeInscripcion> aux = listaInscripciones.getInscripciones();
					request.setAttribute("inscripciones", aux);
					request.setAttribute("tipoUsuario", "Deportista");
				}
				RequestDispatcher rd = request.getRequestDispatcher("/consultas.jsp");
				rd.forward(request, response);
			} catch (UsuarioNoExisteException_Exception | ClaseNoExisteException_Exception e) {
				// Maneja la excepción si el usuario no existe, redirigiendo al JSP de error
				e.printStackTrace();
				request.getRequestDispatcher("/usuarioInexistente.jsp").forward(request, response);
			}
		} else if (sessionUsername.equals(nickname)) {
			try {
				System.out.println("Llegue al if de usuario = usuario logueado y el usuario es: " + nickname);
				result = port.consultarUsuario(nickname);
				if (result == null) {
					request.getRequestDispatcher("/usuarioInexistente.jsp").forward(request, response);
					return;
				}
				request.setAttribute("nombre", result.getNombre());
				request.setAttribute("apellido", result.getApellido());
				request.setAttribute("fechaNac", result.getFNacimiento());
				request.setAttribute("email", result.getEmail());
				request.setAttribute("iguales", true);
				if (result.getTipo()) {
					DataListaActividades actividadesDelEntrenador = port
							.listarActividadesPorEntrenador(nickname);
					request.setAttribute("disciplina", actividadesDelEntrenador);
					request.setAttribute("tipoUsuario", "Entrenador");
				} else {
					DataListaInscripciones listaInscripciones = port.listarInscripcionesPorClase(nickname);
					List<DataTypeInscripcion> listaInscripciones2 = listaInscripciones.getInscripciones();
					request.setAttribute("inscripciones", listaInscripciones);
					request.setAttribute("tipoUsuario", "Deportista");
					List<Double> listaCostos = new ArrayList<>(); // Lista para almacenar los costos

					for (DataTypeInscripcion inscripcion : listaInscripciones2) {
						// Obtén la clase asociada a la inscripción
						Clase claseAsociada = inscripcion.getClase();
						Actividad actividadDeLaClase = claseAsociada.getActividad();
						double costoActividad = actividadDeLaClase.getCosto();

						// Agrega el costo a la lista de costos
						listaCostos.add(costoActividad);
					}
					System.out.println("LISTA DE COSTSOS: " + listaCostos);
					request.setAttribute("costoClase", listaCostos);
				}
				RequestDispatcher rd = request.getRequestDispatcher("/consultas.jsp");
				rd.forward(request, response);
			} catch (UsuarioNoExisteException_Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// try {
		// result = icon.consultarUsuario(nickname);
		// if (result == null) {
		// request.getRequestDispatcher("/usuarioInexistente.jsp").forward(request,
		// response);
		// return;
		// }
		// request.setAttribute("nombre", result.getNombre());
		// request.setAttribute("apellido", result.getApellido());
		// request.setAttribute("fechaNac", result.getFNacimiento());
		// request.setAttribute("email", result.getEmail());
		// if(result.getTipo()) {
		// List<dataTypeActividad> actividadesDelEntrenador =
		// controlAct.obtenerActividadesConfirmadasPorEntrenador(nickname);
		// request.setAttribute("disciplina", actividadesDelEntrenador);
		// request.setAttribute("tipoUsuario", "Entrenador");
		// }
		// else {
		// request.setAttribute("tipoUsuario", "Deportista");
		// }
		// RequestDispatcher rd = request.getRequestDispatcher("/consultas.jsp");
		// rd.forward(request, response);
		// } catch (UsuarioNoExisteException e) {
		// // Maneja la excepción si el usuario no existe, redirigiendo al JSP de error
		// e.printStackTrace();
		// request.getRequestDispatcher("/usuarioInexistente.jsp").forward(request,
		// response);
		// }
	}
}
