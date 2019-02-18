package almacen;

public class ProductoTecnologia extends Producto implements IArticulo {
	
	private String subCategoria;

	public ProductoTecnologia(String subCategoria, String descripcion, int stock, int stockMinimo, float precioCompra,
			float precioVenta) {
		super("Tecnología", descripcion, stock, stockMinimo, precioCompra, precioVenta);
		this.subCategoria = subCategoria;
		// TODO Auto-generated constructor stub
	}
	
	public String getSubCategoria() {
		return subCategoria;
	}

	public void setSubCategoria(String subCategoria) {
		this.subCategoria = subCategoria;
	}

	@Override
	public float comprar(int cantidad) {
		this.setStock(this.getStock()+cantidad);
		return this.getPrecioCompra() * cantidad;
	}

	@Override
	public float comprar() {
		this.setStock(this.getStock()+1);
		return this.getPrecioCompra();
	}

	@Override
	public float vender(int cantidad) {
		this.setStock(this.getStock()-cantidad);
		System.out.println(reposicion());
		return this.getPrecioVenta()  * cantidad + (this.getPrecioVenta()*cantidad*IVA);
	}

	@Override
	public float vender() {
		this.setStock(this.getStock()-1);
		System.out.println(reposicion());
		return this.getPrecioVenta() + (this.getPrecioVenta()*IVA);
	}

	@Override
	public String prepararProducto() {
		return this.getDescripcion() + " de " + this.getSubCategoria() + " empaquetado";
	}

	public String repararProducto() {
		return "Precio de la reparación del " + this.getDescripcion() + " ha sido "+ (getPrecioVenta() * 0.25f) + "€";
	}
	
}
