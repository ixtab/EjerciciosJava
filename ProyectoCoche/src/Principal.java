
public class Principal {

	public static void main(String[] args) {
		
		Coche miCoche = new Coche();
		Coche miCoche2 = new Coche("1234AAA", "Ferrari", "F1",  200);
				
		miCoche.matricula = "1354sds";
		miCoche.marca = "Ford";
		miCoche.modelo = "Focus";
		
		Coche miCoche3 = new Coche(miCoche);
		miCoche3.matricula = "2704FCC";
				
		miCoche.acelerar(100);
		miCoche.frenar(20);
		
		
		System.out.println(miCoche.estado());
		System.out.println(miCoche2.estado());
		System.out.println(miCoche3.estado());
		System.out.println(miCoche+ " " + miCoche2 + " " + miCoche3);
	}
}