import java.time.LocalDateTime;

public class Cita {
	private String observaciones;
	private LocalDateTime fechaHora;
	
	public Cita(String observaciones) {
		this.observaciones = observaciones;
		this.fechaHora = LocalDateTime.now();
	}
	
	public String getCita() {
		return 	fechaHora.getDayOfMonth() + "/" + 
				fechaHora.getMonthValue() + "/" + 
				fechaHora.getYear() + " " +
				fechaHora.getHour() + ":" +
				fechaHora.getMinute() +
				". Observaciones: " + observaciones;
	}
	
}
