import java.util.Scanner;

public class EjercicioAdivina {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		int numeroAzar = (int)( Math.random()*100);
		int numeroJugador;
		int contador = 0;
		
		System.out.println("¡¡¡ADIVINA EL NÚMERO!!!");
		System.out.println("-----------------------");
		
		do {
			System.out.println("Introduce un número del 1 al 100: ");
			numeroJugador = lector.nextInt();
			lector.nextLine();
			if (numeroAzar > numeroJugador) {
				if (contador < 4) {
					System.out.println("El numero que tienes que adivinar es mayor;");
				} else {
					System.out.println("Has fallado, el número era el " + numeroAzar);
				}
				contador++;
				
			} else if (numeroAzar < numeroJugador) {
				if (contador < 4) {
					System.out.println("El numero que tienes que adivinar es menor;");
				} else {
					System.out.println("Has fallado, el número era el " + numeroAzar);
				}
				contador++;
			} else {
				System.out.println("HAS ACERTADO!!!!!!!");
				contador = 5;
			}
			
		} while (contador < 5);		
		
		lector.close();
	}

}
