import java.util.ArrayList;

import almacen.*;

public class Principal {
	
	public static void main(String[] args) {
		
		Almacen barajas = new Almacen("Juan Perez", "Gran Vía 37", "654654654");
				
		barajas.nuevoProducto(new ProductoTextil("Falda", 4, 5, 10, 12, "L", "Rojo"));
		barajas.nuevoProducto(new ProductoFerreteria("Martillo", 12, 5, 5f, 10f ));
		barajas.nuevoProducto(new ProductoTecnologia("informatica", "router", 3, 1, 72f, 105f));
		
		barajas.getProductos().forEach(p -> procesarArticulo(p));
			
		ArrayList<Producto> rt = barajas.getProductos();
		for(Producto p : rt) {
			if(p.getClass().getSimpleName().equals("ProductoTecnologia")) {
				ProductoTecnologia pt = (ProductoTecnologia) p;
				System.out.println(pt.repararProducto());
			}
		}
	}

	public static void procesarArticulo(Producto p) {
		float importe;
		System.out.println(p);
		IArticulo a = (IArticulo) p; // Para poder comprar y vender.
		System.out.println(p.prepararProducto());
		importe = a.comprar(10);
		System.out.println("Importe de la compra: " + importe);
		System.out.println("Stock después de la compra: " + p.getStock());
		importe = a.vender(12);
		System.out.println("Importe de la venta: " + importe);
		System.out.println("Stock después de la venta: " + p.getStock());
		System.out.println("-----------------");
	}
}
