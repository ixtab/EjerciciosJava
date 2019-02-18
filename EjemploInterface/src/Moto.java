
public class Moto implements Vehiculo {

	int velocidad;
	

	public Moto() {
		
	}

	@Override
	public String frenar(int cuanto) {
		setVelocidad(getVelocidad() - cuanto);
		return "El coche va a " + getVelocidad(); 
	}

	@Override
	public String acelerar(int cuanto) {
		setVelocidad(getVelocidad() + cuanto);
		return "El coche va a " + getVelocidad(); 
	}
	
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

}
