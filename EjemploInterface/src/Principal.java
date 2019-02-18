
public class Principal {

	public static void main(String[] args) {
			Vehiculo rayo = new Coche();
			System.out.println(rayo.acelerar(50));
			ver(rayo);
			System.out.println(((Coche) rayo).cerrarPuertas());	/** Se hace cast para poder utilizar un metodo de Coche,
																** ya que se ha creado como Vehiculo y no tiene acceso */
	}
	
	public static void ver(Vehiculo v) {
		System.out.println(v.getClass().getSimpleName());
	}

}
