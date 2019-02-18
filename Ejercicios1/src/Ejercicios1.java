
public class Ejercicios1 {

	public static void main(String[] args) {
		NumerosAzar();
		ConsigueQuince();
		Mensaje();
		TablasMultiplicar();
		
	}

	private static void TablasMultiplicar() {
		for (int i = 1; i <= 10; i++ ) {
			for(int j = 1; j <= 10; j++) {
				System.out.print("\t" + j + "x" + i + "=" + i*j + "\t\t");
			}
			System.out.println();
		}
		
	}

	private static void Mensaje() {
		int numeroAzar = (int)(Math.random()*3);
		System.out.print(numeroAzar + ": ");
		switch (numeroAzar) {
		case 0:
			System.out.println("Hoy vas a tener un gran día.");
			break;
		case 1:
			System.out.println("Este fin de semana promete.");
			break;

		default:
			System.out.println("Mejor no salgas de casa.");
			break;
		}
	}

	private static void ConsigueQuince() {
		int numeroAzar;
		int contador = 0;
		do {
			numeroAzar = (int)(Math.random()*30 + 1);
			contador++;
			System.out.print(".");
		} while (numeroAzar != 15);
		System.out.println("\nnumero de veces pasadas hasta encontrar 15: " + contador);		
	}

	private static void NumerosAzar() {
		int numeroAzar = (int)(Math.random()*5 + 1);
		System.out.println("\n" + numeroAzar);
	}

}
