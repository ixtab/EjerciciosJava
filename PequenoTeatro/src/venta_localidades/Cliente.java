package venta_localidades;

public class Cliente {
	private String nombre; 
	private int edad;
	private String telefono;
	
	//Constructor
	public Cliente(String nombre, int edad, String telefono) {
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
	}
	
	//Metodos
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", edad=" + edad + ", telefono=" + telefono + "]";
	}
	
	public String tipoCliente() {
		String tipo = ""; 
		
		if (this.edad <= 14) {
			tipo = "INFANTIL";
		} else if (this.edad <= 26) {
			tipo = "JOVEN";
		} else if (this.edad <= 64) {
			tipo = "NORMAL";
		} else {
			tipo = "JUBILADO";
		}
		
		return tipo;
	}
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
	
}