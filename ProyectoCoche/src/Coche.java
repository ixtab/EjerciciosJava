
public class Coche {
	// Propiedades o atributos.
	public String matricula;
	public String marca;
	public String modelo;
	public int velocidad;
	
	//Constructor
	
	public Coche(String matricula, String marca, String modelo, int velocidad){
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
	}
	
	
	public Coche() {
		matricula = "No establecida";
	}
	
	public Coche(Coche c) {
		System.out.println(c.marca);
		this.matricula = c.matricula;
		this.marca = c.marca;
		modelo = c. modelo;
		velocidad = c.velocidad;
		
	}


	// Metodos.
	public void acelerar(int cuanto) {
		velocidad = velocidad + cuanto;
		System.out.println("Broooouuuummm");
	}
	
	public void frenar(int cuanto) {
		velocidad = velocidad - cuanto;
		System.out.println("Iiiiiihhhhhh");
	}
	
	public String estado() {
		if (velocidad > 0) {
			return "El coche " + marca + " " + modelo +" con matrícula \"" + matricula + "\" va a " + velocidad + " kilometros por hora";
		} else {
			return "El coche " + marca + " " + modelo +" con matrícula \"" + matricula + "\" está parado";
		}
	}

}
