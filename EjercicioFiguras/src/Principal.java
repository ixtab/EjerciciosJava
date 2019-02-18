import dibujo.*;

public class Principal {

	public static void main(String[] args) {
		
		Triangulo t = new Triangulo(); // Si lo creamos como figura no tenemos acceso al m�todo setAncho() del Triangulo.
		t.setAncho(12);
		t.alto = 23;
		System.out.println(t.Area());
		
		Figura c = new Circunferencia(20);
		System.out.println(c.Area());
		
		System.out.println(c.QUE_SOY); // Como c�rculo se ha definido como Figura sale figura en vez de c�rculo.
		System.out.println(t.QUE_SOY);
	}
}