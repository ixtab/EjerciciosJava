
public class Pulga extends Animal {

	//constructor
	
	public Pulga() {
		super("Pulga");
	}
	
	
	//methods
	
	@Override
	public String morder(Animal ani) {
		return "Pulga muerde " + ani;
	}

	@Override
	public String mover() {
		return "La pulga se mueve";
	}

}
