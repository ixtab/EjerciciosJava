import java.util.Scanner;

public class EjerciciosJava {

	public static void main(String[] args) {
		
		IMC();
		Mayusculas();
	}

	private static void IMC() {
		Scanner entrada = new Scanner(System.in);
		float peso;
		float altura;
		float imc;
		
		System.out.println("Introduce tu peso (en kg) : ");
		peso = entrada.nextFloat();
		entrada.nextLine();
		
		System.out.println("Introduce tu altura (en metros) : ");
		altura = entrada.nextFloat(); // se puede poner como nextLine() y no tener que limpiar luego el buffer.-
		entrada.nextLine();
		
		entrada.close();
		
		imc = peso / (altura * altura);
		System.out.println(imc);
		if (imc < 20) {
			System.out.println("Ingreso hospital");
		} else if (imc <25) {
			System.out.println("Bajo Peso");
		} else if (imc <40) {
			System.out.println("Peso Normal");
		} else if (imc <50) {
			System.out.println("Sobrepeso");
		} else if (imc <25) {
			System.out.println("Más Sobrepeso");
		} else {
			System.out.println("Mucho sobrepeso (cuidado)");
		}
		
		System.out.println("------------------------------------");
		
	}

	private static void Mayusculas() {
		 for (char i = 65; i <= 'Z'; i++) {
			 System.out.print(i + "-");
		 }	
	}
	
}
