import java.io.Serializable;

public class Calificacion implements Serializable {
	//Calificaci�n tiene que ser tambi�n serializable ya que se va a grabar tambi�n aunque dependa de Alumno.
	private static final long serialVersionUID = 3057545624874202352L; 
	private String asignatura;
	private int nota; // Sobre 100
	
	public Calificacion(String asignatura, int nota) {
		this.asignatura = asignatura;
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Calificaci�n [Asignatura=" + asignatura + ", Nota=" + nota + "]";
	}
}
