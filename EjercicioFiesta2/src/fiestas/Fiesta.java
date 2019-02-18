package fiestas;

public class Fiesta {
	private static int totalInvitaciones;
	private String fechaHoraFiesta;
	private String nombreAnfitrion;
	private Local sitio;
	private int invitados = 0;
	private int bocadillos = 0;
	private int bebidas = 0;
	
	// Constructor
	public Fiesta(String fechaHoraFiesta, String nombreAnfitrion, Local direccion) {
		this.fechaHoraFiesta = fechaHoraFiesta;
		this.nombreAnfitrion = nombreAnfitrion;
		this.sitio = direccion;
	}
	
	// Metodos
	public String informa() {
		return  "La fiesta de " + nombreAnfitrion + " es el " + fechaHoraFiesta +
				" en "+	sitio.getLocal() + ". Hay " + invitados + " invitados, " + 
				bocadillos + " bocadillos y " + bebidas + " bebidas.";
	}
	
	public void invitar() {
		if (invitados < sitio.getAforo()) {
			invitados++;
			totalInvitaciones++;
			bocadillos = bocadillos + 3;
			bebidas = bebidas + 5;
			System.out.println("Has invitado a una persona");
		} else {
			System.out.println("No hay plazas");
		}
	}

	public void invitar(int invitados) {
		if (this.invitados + invitados <= sitio.getAforo()) {
			this.invitados += invitados;
			totalInvitaciones += invitados;
			bocadillos = bocadillos + 3*invitados;
			bebidas = bebidas + 5*invitados;
			System.out.println("Has invitado a " + invitados + " personas");
		} else {
			System.out.println("No hay plazas suficientes. Quedan " +
					(sitio.getAforo() - this.invitados));
		}
	}
	
	public void cancelarInvitacion() {
		if(invitados > 0) {
			invitados--;
			bocadillos = bocadillos - 3;
			bebidas = bebidas - 5;
		} else {
			System.out.println("No hay invitados en la fista");
		}
		
	}
		
	// Getters y Setters
	public String getDireccion() {
		return sitio.getLocal();
	}
	public void setDireccion(String nombre, String direccion, String cp,
			String localidad, String provincia, int aforo) {
		this.sitio.setNombre(nombre);
		this.sitio.setDireccion(direccion);
		this.sitio.setCp(cp);
		this.sitio.setLocalidad(localidad);
		this.sitio.setProvincia(provincia);
		this.sitio.setAforo(aforo);
		
	}
	public String getFechaHoraFiesta() {
		return fechaHoraFiesta;
	}
	public String getNombreAnfitrion() {
		return nombreAnfitrion;
	}
	public String getInvitados() {
		return invitados + " de " + sitio.getAforo() + " plazas";
	}
	public int getBocadillos() {
		return bocadillos;
	}
	public int getBebidas() {
		return bebidas;
	}
	public int getAforo() {
		return this.sitio.getAforo();
	}
	public static String getTotalInvitaciones() {
		return "Total de invitaciones: " + totalInvitaciones;
	}
	
	
}
