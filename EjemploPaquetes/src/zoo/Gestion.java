package zoo;

import zoo.animales.Gato;

public class Gestion {

	public static String CrearGato() {
		Gato fuga = new Gato("Europeo", 15, 5, 2015, 22);
		return fuga.estado();
		
	}
}
