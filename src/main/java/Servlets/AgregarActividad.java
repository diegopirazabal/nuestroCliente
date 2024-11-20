package Servlets;

import java.io.IOException;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import turismoservidor.ActividadRepetidaException_Exception;
import turismoservidor.UsuarioNoExisteException_Exception;
import turismoservidor.UsuarioRepetidoException_Exception;

@WebServlet("/AgregarActividad")
public class AgregarActividad extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public AgregarActividad() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	turismoservidor.PublicadorService service=new turismoservidor.PublicadorService();
        turismoservidor.Publicador port= service.getPublicadorPort();

        String nombre = request.getParameter("nombre");
        String descripcion = request.getParameter("descripcion");
        int duracion = Integer.parseInt(request.getParameter("duracion"));
        double costo = Double.parseDouble(request.getParameter("costo"));
        String lugar = request.getParameter("lugar");
        String entrenador = request.getParameter("entrenador");
        // opcional
        String imagen = "casa";

        try {
            if (port.consultarUsuario(entrenador) == null) {
                request.setAttribute("error", "El entrenador no existe.");
                request.getRequestDispatcher("/inicioErroneo.jsp").forward(request, response);
            }
            GregorianCalendar calendar = new GregorianCalendar();
            XMLGregorianCalendar fechaAlta = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
            // Fecha actual
            port.crearActividad(nombre, descripcion, duracion, costo, lugar, fechaAlta, imagen,
                    entrenador);
            request.getRequestDispatcher("/index.jsp").forward(request, response);

        } catch (ActividadRepetidaException_Exception e) {
            request.setAttribute("error", "Ya existe una actividad con ese nombre.");
            System.out.println("Actividad ya existente.");
            request.setAttribute("descripcion", descripcion);
            request.setAttribute("duracion", duracion);
            request.setAttribute("costo", costo);
            request.setAttribute("entrenador", entrenador);
            request.setAttribute("lugar", lugar);
            request.getRequestDispatcher("/agregarActividad.jsp").forward(request, response);

        } catch (UsuarioNoExisteException_Exception e) {
            request.setAttribute("error", "Entrenador no encontrado.");
            request.getRequestDispatcher("/inicioErroneo.jsp").forward(request, response);
            System.out.println("Actividad creada correctamente.");
        } catch (UsuarioRepetidoException_Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}