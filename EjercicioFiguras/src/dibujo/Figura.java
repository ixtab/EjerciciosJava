package dibujo;

public class Figura {
	final public String QUE_SOY = "Soy una figura";
	public int alto;	
	int ancho;
	
	public Figura(){
	}
	
	public Figura(int alto, int ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}

	@Override
	public String toString() {
		return "Figura [alto=" + alto + ", ancho=" + ancho + "]";
	}
	
	public double Area() {
		return 0;
	}
}
