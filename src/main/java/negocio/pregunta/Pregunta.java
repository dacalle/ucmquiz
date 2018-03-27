package negocio.pregunta; 

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import negocio.respuesta.Respuesta;

@Entity
@NamedQueries({
	@NamedQuery(
		name = "negocio.pregunta.Pregunta.findByAsignatura",
		query = "select obj from Pregunta obj where obj.asignatura = :asignatura and obj.activo = 1"
	)
})
public class Pregunta {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Version
	private int version;
	
	@OneToMany(mappedBy="pregunta")
	private Collection<Respuesta> respuestas;
	
	private String texto;
	
	private boolean activa;
	
	public Pregunta() {};
	
	public Pregunta(String texto, boolean activa) {		
		this.texto = texto;
		this.activa = activa;
	}

	public Pregunta(int id, String texto, boolean activa) {
		this.id = id;		
		this.texto = texto;
		this.activa = activa;
	}

	public void setId(Integer id) {
		this.id = id;
	}	

	public int getId() {
		return this.id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public boolean getActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}

}