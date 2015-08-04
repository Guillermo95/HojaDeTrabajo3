
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
public class Driver {

	public static void main(String[] args) {
		Lector lector = new Lector ();
		Random random = new Random ();
		int[] numeros = new int [3000];
		Comparable[] lista = new Comparable[3000];
		Sorting radix = new Sorting();
		
		for(int i = 0; i < 3000; i++){
			numeros[i] = random.nextInt(3001);
			
		}
		for(int i = 0; i < 3000; i++){
			lista[i] = numeros[i];
			
		}
		PrintWriter pw;
		try {
			pw = new PrintWriter("Numeros.txt");
			pw.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		String cadena ="";
		for(int i = 0; i<3000; i++){
			cadena = numeros[i] + " ";
			try{
				BufferedWriter escribir = new BufferedWriter (new FileWriter ("Numeros.txt", true));
				escribir.write(cadena);
				escribir.close();
			} catch (IOException e){
				e.getStackTrace();	
			}
		}
		lector.leerArchivo();
		for(int i = 0; i < 3000; i++){
			System.out.println(numeros[i]);
		}
		radix.insertionSort(lista); //AQUÍ COLOAR EL SORT A UTILIZAR
		for(int i = 0; i < 3000; i++){
			System.out.println(lista[i]);
		}
	}
}