package Servlets;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.xml.datatype.XMLGregorianCalendar;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import turismoservidor.ClaseNoExisteException_Exception;
import turismoservidor.DataTypeClase;
import turismoservidor.DataTypeUsuario;

@WebServlet("/DetalleClase")
public class DetalleClase extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public DetalleClase() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	turismoservidor.PublicadorService service=new turismoservidor.PublicadorService();
        
    	turismoservidor.Publicador port= service.getPublicadorPort();;
        
        HttpSession session = request.getSession();
        
        DataTypeUsuario usuario = (DataTypeUsuario) session.getAttribute("usuario_logueado");
		
        String sessionUsername = usuario.getNickname(); // Usa el getter correspondiente.
		
		String claseSeleccionada = request.getParameter("comboClases");
		
		System.out.println("CLASE SELECCIONADA ES: " + claseSeleccionada + "\n");
        
		DataTypeClase aux;
		try {
			aux = port.obtenerClasePorNombre2(claseSeleccionada);
			request.setAttribute("nombreClase", aux.toString());
	        System.out.println("La fecha que voy a formatear es: " + aux.getFecha());
	        XMLGregorianCalendar fecha = aux.getFecha();
	        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	        String fechaFormateada = sdf.format(fecha);
	        request.setAttribute("fechaClase", fechaFormateada);
	        request.setAttribute("horaClase", aux.getHora());
	        request.setAttribute("lugarClase", aux.getLugar());
	        request.setAttribute("cuposClase", aux.getCupo());
		} catch (ClaseNoExisteException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        request.getRequestDispatcher("/consultaClase.jsp").forward(request, response);

    }

}