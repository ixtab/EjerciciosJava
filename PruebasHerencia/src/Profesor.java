
public class Profesor extends Persona {
	String especialidad;

	public Profesor(String nombre, String telefono, String especialidad) {
		super(nombre, telefono);
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Profesor [especialidad=" + especialidad + ", toString()=" + super.toString() + "]";
	}
	
}
