package Servlets;

import java.io.IOException;

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

@WebServlet("/inscripcion")
public class inscripcion extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public inscripcion() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	turismoservidor.PublicadorService service=new turismoservidor.PublicadorService();
        turismoservidor.Publicador port= service.getPublicadorPort();;
        HttpSession session = request.getSession();
        DataTypeUsuario usuario = (DataTypeUsuario) session.getAttribute("usuario_logueado");
        String sessionUsername = usuario.getNickname(); // Usa el getter correspondiente.
        String clase = request.getParameter("clases");
        XMLGregorianCalendar fechaIns = null;
        String deportista = sessionUsername;
        try {
            DataTypeUsuario aux = port.verInfoUsuario(deportista);
            
            if (aux.getTipo().equals(false)) {
                port.agregarInscripcionAClase(deportista, clase, fechaIns);

            } else {
                System.out.println("No se realizo la inscripcion porque el usuario no es deportista");
            }
        } catch (UsuarioNoExisteException_Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

}