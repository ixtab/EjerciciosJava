
public class Inicio {

	public static void main(String[] args) {
		
		Object cosa; // En la clase Object est�n todos los tipos.
		cosa = new String("hola");
		System.out.println(cosa);
		cosa = new Integer(5);
		System.out.println(cosa);
		System.out.println("---------------");
		
		Persona p;
		p = new Alumno("As","Asd", 10354); // p se define como persona pero luego es un alumno, eso es el polimorfismo.
		System.out.println(p); // to String se implementa autom�ticamente.
		p = new Profesor("As","Asd", "Mates");
		System.out.println(p); 
	}

}