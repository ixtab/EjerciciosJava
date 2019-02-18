
public abstract class Animal {
	
	private String nombre;

	//constructor
	
	public Animal(String nombre) {
		this.nombre = nombre;
	}

	//methods
	
	@Override
	public String toString() {
		return nombre ;
	}
	
	public abstract String  morder(Animal ani);
	abstract public String mover();

	// Setters y Getters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}