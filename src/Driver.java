/*Universidad del Valle de Guatemala
 *Algoritmos y Estructuras de Datos
 *Secci�n 30
 *Guillermo Javier de Le�n Archila, 14022
 *Edwin Fernando Coronado Roche, 14148
 *Jos� Pablo Ortega Grajeda, 14565
 *Dan Isa� Alvarez Ruano, 14628
 *Clase: Driver
 *Fecha de �ltima modificaci�n: 04/08/2015
 */
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
public class Driver {

	public static void main(String[] args) {
		Lector lector = new Lector (); //objeto para leer el archivo
		Random random = new Random (); //objeto para generar el random
		int cantidad = 3000; //cantidad usada para generar los n�meros y mostrarlos en pantala
		int[] numeros = new int [cantidad]; //arreglo donde se guardan los n�meros aleatorios
		Comparable[] lista = new Comparable[cantidad]; //arreglo Comparable para ingresar como par�metro en los m�todos de sort
		Sorting sort = new Sorting(); //objeto para llamar a los m�todos de sort
		
		for(int i = 0; i < cantidad; i++){//se rellena la lista con n�meros aleatorios
			numeros[i] = random.nextInt(cantidad + 1);
		}
		
		for(int i = 0; i < cantidad; i++){//se rellena la lista Comparable con los n�meros anteriores
			lista[i] = numeros[i];
		}
		//se crea el archivo de texto y se escribe en �l los n�meros
		PrintWriter pw;
		try {
			pw = new PrintWriter("Numeros.txt");
			pw.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		String cadena ="";
		for(int i = 0; i<cantidad; i++){
			cadena = numeros[i] + " ";
			try{
				BufferedWriter escribir = new BufferedWriter (new FileWriter ("Numeros.txt", true));
				escribir.write(cadena);
				escribir.close();
			} catch (IOException e){
				e.getStackTrace();	
			}
		}
		lector.leerArchivo(); //se leen los datos del arhicvo de texto
		for(int i = 0; i < cantidad; i++){
			System.out.println(numeros[i]);//muestra en pantalla los n�meros desordenados
		}
		sort.mergeSort(lista); //se llama al m�todo de ordenamiento
		//sort.selectionSort(lista);
		//sort.insertionSort(lista);
		//sort.radixSort(lista);
		for(int i = 0; i < cantidad; i++){
			System.out.println(lista[i]);//muestra en pantalla los n�meros ordenados
		}
	}
}