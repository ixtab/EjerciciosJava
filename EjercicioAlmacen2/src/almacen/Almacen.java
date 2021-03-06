package almacen;

import java.util.ArrayList;

public class Almacen {
	private String responsable;
	private String domicilio;
	private String tlf;
	private ArrayList<Producto> productos;
	
	public Almacen(String responsable, String domicilio, String tlf) {
		this.responsable = responsable;
		this.domicilio = domicilio;
		this.tlf = tlf;
		this.productos = new ArrayList<Producto>();
	}
	
	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void nuevoProducto(Producto p) {
		productos.add(p);
	}

	public String getResponsable() {
		return responsable;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getTlf() {
		return tlf;
	}
	public void setTlf(String tlf) {
		this.tlf = tlf;
	}



	@Override
	public String toString() {
		return "Almacen [responsable=" + responsable + ", domicilio=" + domicilio + ", tlf=" + tlf + ", productos="
				+ productos + "]";
	}
	
	
}
