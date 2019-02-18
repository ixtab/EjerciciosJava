
public class Perro extends Animal {

	public String[] partes = {"la cabeza", "las orejas", "el cuello", "la espalda", "la tripa", "las patas", "el rabo"};
	
	public Perro() {
		super("Perro");
	}

	@Override
	public String morder(Animal ani) {
		return "Perro muerde " + ani; 
	}

	@Override
	public String mover() {
		return "El perro corre por el campo";
	}

}
