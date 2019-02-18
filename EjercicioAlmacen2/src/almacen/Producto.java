package almacen;

public abstract class Producto {
	private String categoria;
	private String descripcion;
	private int stock;
	private int stockMinimo;
	private float precioCompra;
	private float precioVenta;

	public Producto(String categoria, String descripcion, int stock, 
			int stockMinimo, float precioCompra, float precioVenta) {
		this.categoria = categoria;
		this.descripcion = descripcion;
		this.stock = stock;
		this.stockMinimo = stockMinimo;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
	}
	
	// Método que será implementado en las clases derivadas.
	public abstract String prepararProducto();
	
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public float getPrecioCompra() {
		return precioCompra;
	}
	public float getPrecioVenta() {
		return precioVenta;
	}
	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public String toString() {
		return descripcion + " (" + categoria + ")" + ", Stock=" + stock + 
				", Minimo=" + stockMinimo + ", PrecioCompra=" + precioCompra +
				", Precio Venta=" + precioVenta;
	}
	
	public String reposicion() {
		if (this.stock<this.stockMinimo) {
			return "Hay que reponer " + (this.stockMinimo-this.stock) + " unidades";
		}
		else {
			return "Por ahora no es necesario reponer";
		}
	}
}
