package turismoservidor;

import java.util.Date;
import java.util.List;



import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@DiscriminatorValue("DEPORTISTA")
@Table(name = "DEPORTISTAS")
public class Deportista extends Usuario {
	@Column(name = "DISCIPLINA", nullable = true)
	private String disciplina;

	@Column (name = "PROFESIONAL", nullable = true)
    private boolean esProfesional;
	
	@OneToMany(targetEntity=Clase.class)
    private List<Inscripcion> inscripciones;

    public Deportista() {};
    
    public Deportista(String nickname, String nombre, String apellido, String email, Date fechaNacimiento, Boolean esEntrenador,  String contrasena, boolean esProfesional) {
        super();
        this.esProfesional = esProfesional;
    }

    public boolean esProfesional() {
        return esProfesional;
    }

    public void setProfesional(boolean esProfesional) {
        this.esProfesional = esProfesional;
    }

	
}