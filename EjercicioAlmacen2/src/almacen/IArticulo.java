package almacen;

public interface IArticulo {
	public float IVA = 21f/100;
	
	public float comprar(int cantidad);
	public float comprar(); // 1 Unidad.
	
	public float vender(int cantidad);
	public float vender(); // 1 Unidad.
}
