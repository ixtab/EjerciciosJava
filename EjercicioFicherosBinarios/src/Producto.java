public class Producto {
	private String nombre;
	private float precio;	
	private float unidadesEnExistencia;
	
	public Producto(String nombre, float precio, float unidadesEnExistencia) {
		this.nombre = nombre;
		this.precio = precio;
		this.unidadesEnExistencia = unidadesEnExistencia;
	}

	public String getNombre() {
		return nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public float getUnidadesEnExistencia() {
		return unidadesEnExistencia;
	}

	@Override
	public String toString() {
		return nombre + " Stock: " + this.unidadesEnExistencia + " Precio: " + 
			this.precio;
	}
}
