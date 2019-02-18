package dibujo;

public class Triangulo extends Figura {
	
	final public String QUE_SOY = "Soy un triangulo";
	
	public Triangulo() {
	}

	public Triangulo(int alto, int ancho) {
		super(alto, ancho);
	}
	
	@Override
	public double Area() {
		return this.alto * this.ancho / 2;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
		
	}
}