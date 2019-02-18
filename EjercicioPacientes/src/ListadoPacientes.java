import java.util.ArrayList;

public class ListadoPacientes {
	
	public static ArrayList<Paciente> lista = new ArrayList<Paciente>();
	
	public static void addPaciente(String nombre, String tlf) {
		Paciente pa = new Paciente(nombre, tlf);
		lista.add(pa);
	}
	
	public static String getListado() {
		String listado = "Listado pacientes: \n";
		int indice = 0;
		for (Paciente paciente : lista) {
			listado = listado + indice +"- "+paciente.toString() + "\n";
			indice++;
		}
		listado += "------------------";
		return listado;
	}
	
}
