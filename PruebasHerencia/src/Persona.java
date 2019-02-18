
public class Persona {
	private String nombre;
	private String telefono;
	
	public Persona(String nombre, String telefono) {
		super(); // Invoca al constructor de la clase object que por defecto es el constructor sin argumentos;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
}