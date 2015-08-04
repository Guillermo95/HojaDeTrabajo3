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