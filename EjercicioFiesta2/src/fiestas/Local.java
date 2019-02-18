package fiestas;

public class Local {
	private String nombre;
	private String direccion;
	private String cp;
	private String localidad;
	private String provincia;
	private int aforo;
	
	public Local(String nombre, String direccion, String cp, String localidad, String provincia, int aforo) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.cp = cp;
		this.localidad = localidad;
		this.provincia = provincia;
		this.aforo = aforo;
	}
	public Local() {
		
	}
	
	public String getLocal() {
		return nombre + " "  + direccion + ", " + localidad + ", " + cp + ", " + provincia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int getAforo() {
		return aforo;
	}

	public void setAforo(int aforo) {
		this.aforo = aforo;
	}
	
	
	
}

