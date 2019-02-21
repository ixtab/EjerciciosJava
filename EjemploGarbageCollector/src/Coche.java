
public class Coche {
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	
	public Coche(String matricula, String marca, String modelo, String color) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}

	@Override
	public String toString() {
		return "El coche con matricula " + matricula + ", marca " + marca + " y modelo " + modelo + " es de color " + color;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Objeto destruido");
	}
		
}
