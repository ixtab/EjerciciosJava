
public class Principal {

	public static void main(String[] args) {
		
		Coche miCoche1 = new Coche("5544PJK", "Ford", "Fiesta", "Rojo");
		Coche miCoche2 = new Coche("4488ABC", "Renault", "25", "Verde");
		Coche miCoche3 = new Coche("2233PJA", "Opel", "Corsa", "Gris");
		System.out.println(miCoche1);
		System.out.println(miCoche2);
		System.out.println(miCoche3);
		miCoche1 = null;
		miCoche3 = miCoche2;
		System.out.println(miCoche1);
		System.out.println(miCoche2);
		System.out.println(miCoche3);
		
		/*Runtime garbage = Runtime.getRuntime();
		garbage.gc();*/
		Runtime.getRuntime().gc();
	}

}
