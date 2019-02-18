import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		PruebaHash.addToHs("Hola");
		PruebaHash.addToHs("Hola2");
		PruebaHash.addToHs("Hola");
	    ArrayList<String> list = new ArrayList<String>();
	    int n = new Random().nextInt(1000)+1;
	    for(int i=0; i<n; i++){
	        System.out.println(list.add("Elemento ["+ (i+1) + "]" ));
	    }
	    Instant start = Instant.now(); //línea 1
	    list.forEach((s) -> System.out.println(s));
	    Instant end = Instant.now();
	    long duracion = Duration.between(start, end).toMillis();
	   System.out.println("Duracion es: "+ duracion+" milisegundos");
	}
    
}