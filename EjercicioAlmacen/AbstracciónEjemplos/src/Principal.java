import java.util.ArrayList;

import almacen.*;

public class Principal {
	
	public static void main(String[] args) {
		ArrayList<Producto> almacen = new ArrayList<Producto>();
				
		Producto pro = new ProductoTextil("Falda", 4, 5, 10, 12, "L", "Rojo");
		Producto martillo = new ProductoFerreteria("Martillo", 12, 5, 5f, 10f );
		Producto router = new ProductoTecnologia("informatica", "router", 3, 1, 72f, 105f);
		
		almacen.add(pro);
		almacen.add(martillo);
		almacen.add(router);
		
		/* Formas de recorrer ArrayList 
		 * 
		 * 1 - 	for (int i = 0 ; i < almacen.size(); i++){
		 *  		 procesarArticulo(almacen.get(i));
		 *  	}
		 * 
		 * 2 - 	for (Producto prod : almacen) {
		 *			procesarArticulo(prod);
		 *		}
		 * 
		 * 3 - Siguiente linea sin comentar 
		 */
		
		almacen.forEach(p -> procesarArticulo(p));
		
		
		ProductoTecnologia rt = (ProductoTecnologia) router;
		System.out.println(rt.repararProducto());
	}

	public static void procesarArticulo(Producto p) {
		float importe;
		System.out.println(p);
		IArticulo a = (IArticulo) p; // Para poder comprar y vender.
		System.out.println(p.prepararProducto());
		importe = a.comprar(10);
		System.out.println("Importe de la compra: " + importe);
		System.out.println("Stock despu�s de la compra: " + p.getStock());
		importe = a.vender(12);
		System.out.println("Importe de la venta: " + importe);
		System.out.println("Stock despu�s de la venta: " + p.getStock());
		System.out.println("-----------------");
	}
}
