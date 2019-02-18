import java.util.Scanner;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;
public class Principal {
    public static void main(String arg[]){
        SourceDataLine line =null;
        System.out.println("Empieza");
        try{
        	Scanner entrada = new Scanner(System.in);
        	
            byte b[]=new byte[22000]; //Buffer correspondiente a 1 segundo
            System.out.println("Pon la fercuencia: ");
            int frec = entrada.nextInt();
            for (int n=0;n < b .length;n++){ 
                //Genera una nota de 1 segundo con frecuencia LA 440. 
                //22000 es la frecuencia de muestreo del sonido
                //127 es la amplitud máxima de un byte [-127,127]. Obviamos el 128 para hacerlo más fácil
                b[n]=(byte)(Math.sin(frec*n*Math.PI*2/22000)*127);
            }
            //Abre el dispositivo de salida
            AudioFormat af = new AudioFormat(22000, 8, 1, true, true);
            line = AudioSystem.getSourceDataLine(af);
            line.open(af, 22000);
            line.start();
            //Vuelca la señal
            line.write(b, 0, b.length);
            //Finaliza a que se emita todo el sonido
            line.drain();
            entrada.close();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            //Cierra el canal
            if (line!=null){
                line.close();
            }
        }
    }
}
