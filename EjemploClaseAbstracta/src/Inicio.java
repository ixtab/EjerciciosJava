import java.util.Random;

public class Inicio {

	public static void main(String[] args) {
		Perro toby = new Perro();
		Animal cr7 = new Pulga();
		Random aleatorio = new Random();
		System.out.println(cr7.morder(toby) + " en " + toby.partes[aleatorio.nextInt(toby.partes.length)]);
		System.out.println(cr7.mover());
		aleatorio = new Random();
		System.out.println(cr7.morder(toby) + " en "  + toby.partes[aleatorio.nextInt(toby.partes.length)]);
	}

}

