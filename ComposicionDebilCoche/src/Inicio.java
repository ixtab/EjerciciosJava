import taller.Motor;
import taller.Coche;
public class Inicio {
	static String pepe = "pepe"; // Si no ponemos static no se puede acceder desde el main.
	public static void main(String[] args) {
		
		System.out.println(Coche.info);
		
		Motor miMotor = new Motor(100, 1);
		Coche miCoche = new Coche("5568FJK","Ford","Fiesta", miMotor); // Composicion d�bil.
		System.out.println(miCoche.estado());
		
		System.out.println(miCoche.getMotor().estado());
		
		miCoche = null; 
		System.out.println("El objeto motor sigue activo con caballos " 
			+ miMotor.getCaballos());
		
		Coche miCoche2 = new Coche("5522FGH","Citroen","C1", 150, 0); // Composi�n fuerte.
		System.out.println(miCoche2.estado());
		
		System.out.println("Total coches " + Coche.contadorCoches);
		// System.out.println("Total coches " + miCoche2.contadorCoches);  Se podr�a acceder as�, pero no es lo correcto.
		System.out.println(Coche.informarSobreCoches("Hola"));
		System.out.println(pepe); // o ponemos static al declarar la variable pepe no se puede acceder a ella.
		
	}
	
}
