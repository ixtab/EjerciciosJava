package dibujo;

public class Circunferencia extends Figura {

	final public String QUE_SOY = "Soy una circunferencia";
	
	public Circunferencia() {
		
	}

	public Circunferencia(int radio) {
		super(radio*2, radio*2);
		
	}
	
	@Override
	public double Area() {
		return Math.PI*(this.ancho/2 * this.ancho/2);
	}

	@Override
	public String toString() {
		return "Circunferencia [radio=" + alto + "]";
	}
	
	
}