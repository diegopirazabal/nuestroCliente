package Servlets;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import turismoservidor.ActividadNoExisteException_Exception;
import turismoservidor.ClaseNoExisteException_Exception;
import turismoservidor.DataListaActividades;
import turismoservidor.DataListaClases;
import turismoservidor.DataTypeActividad;
import turismoservidor.DataTypeClase;
import turismoservidor.DataTypeUsuario;

@WebServlet("/cargarClasesActividad")
public class cargarClasesActividad extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public cargarClasesActividad() {
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
		System.out.println("La actividad que traigo a cargar clases es: " + actividad);
		DataTypeActividad auxiliar;
		try {
			auxiliar = port.consultarActividad(actividad);
			request.setAttribute("nombreActividad", auxiliar.getNombre());
			request.setAttribute("lugarActividad", auxiliar.getLugar());
			request.setAttribute("duracionActividad", auxiliar.getDuracion());
			request.setAttribute("costoActividad", auxiliar.getCosto());
		} catch (ActividadNoExisteException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DataListaClases aux = null;
		try {
			aux = port.listarClasesPorActividad(actividad);
			List<DataTypeClase> clasesParaPasar = aux.getClases();
			System.out.println("LA LISTA DE CLASES QUE CARGO EN cargarClasesActividad es: " + aux + "\n");
			System.out.println("LA LISTA DE CLASES QUE CARGO EN clasesParaPasar es: " + clasesParaPasar.get(0).getNombre() + "\n"); //DataTypeClase no toma nombre como atributo
			request.setAttribute("listaCla", aux);
			request.getRequestDispatcher("/consultarActividad.jsp").forward(request, response);
		} catch (ClaseNoExisteException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}