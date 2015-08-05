/*Universidad del Valle de Guatemala
 *Algoritmos y Estructuras de Datos
 *Secci�n 30
 *Guillermo Javier de Le�n Archila, 14022
 *Edwin Fernando Coronado Roche, 14148
 *Jos� Pablo Ortega Grajeda, 14565
 *Dan Isa� Alvarez Ruano, 14628
 *Clase: Lector
 *Fecha de �ltima modificaci�n: 04/08/2015
 */
import java.util.Scanner;
import java.io.*;

public class Lector{

	public int[] vector = new int[3000];
	
	public void leerArchivo(){
		String contenido = "";
		try{
			Scanner s = new Scanner(new File("Numeros.txt")).useDelimiter("\\s"); //se crea el objeto Scanner que lee datos
			int i = 0;
			while(s.hasNextInt()){
				vector[i++] = s.nextInt(); //lee
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int[] getVector(){
		return vector;
	}
}