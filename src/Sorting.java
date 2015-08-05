/*Universidad del Valle de Guatemala
 *Algoritmos y Estructuras de Datos
 *Sección 30
 *Guillermo Javier de León Archila, 14022
 *Edwin Fernando Coronado Roche, 14148
 *José Pablo Ortega Grajeda, 14565
 *Dan Isaí Alvarez Ruano, 14628
 *Clase: Sorting
 *Fecha de última modificación: 04/08/2015
 */
public class Sorting
{
   //-----------------------------------------------------------------
   //  Sorts the specified array of objects using the selection
   //  sort algorithm. Author: Lewis/Loftus
   //-----------------------------------------------------------------
   public static void selectionSort (Comparable[] list)
   {
      int min;
      Comparable temp;

      for (int index = 0; index < list.length-1; index++)
      {
         min = index;
         for (int scan = index+1; scan < list.length; scan++)
            if (list[scan].compareTo(list[min]) < 0)
               min = scan;

         // Swap the values
         temp = list[min];
         list[min] = list[index];
         list[index] = temp;
      }
   }

   //-----------------------------------------------------------------
   //  Sorts the specified array of objects using the insertion
   //  sort algorithm. Author: Lewis/Loftus
   //-----------------------------------------------------------------
   public static void insertionSort (Comparable[] list)
   {
      for (int index = 1; index < list.length; index++)
      {
         Comparable key = list[index];
         int position = index;

         //  Shift larger values to the right
         while (position > 0 && key.compareTo(list[position-1]) < 0)
         {
            list[position] = list[position-1];
            position--;
         }
            
         list[position] = key;
      }
   }
   
   /*Radix Sort
    * Código recuperado de: http://www.sanfoundry.com/java-program-implement-radix-sort/
    * Adaptado por: José Pablo Ortega
    */
   public static void radixSort (Comparable[] list){
	   int index, exp = 1, n = list.length;
	   Comparable m = list[0];
	   Comparable[] listaB = new Comparable[n];
	   for (index = 1; index < n; index++)
           if (list[index].compareTo(m) == 1)
               m = list[index];
	   while( (int) m > exp){
		   int[] bucket = new int[n];
		   
           for (index = 0; index < n; index++)
               bucket[( (int) list[index] / exp) % 10]++;
           for (index = 1; index < 10; index++)
               bucket[index] += bucket[index - 1];
           for (index = n - 1; index >= 0; index--)
               listaB[--bucket[((int) list[index] / exp) % 10]] = list[index];
           for (index = 0; index < n; index++)
               list[index] = listaB[index];
           exp *= 10; 
	   }
	   
   }
   /*MERGE SORT
    * Codigo de: Carnegie Mellon University
    * Link: https://www.cs.cmu.edu/~adamchik/15-121/lectures/Sorting%20Algorithms/code/MergeSort.java
    * */
   public static void mergeSort(Comparable [ ] a)
	{
		Comparable[] tmp = new Comparable[a.length];
		mergeSort(a, tmp,  0,  a.length - 1);
	}


	private static void mergeSort(Comparable [ ] a, Comparable [ ] tmp, int left, int right)
	{
		if( left < right )
		{
			int center = (left + right) / 2;
			mergeSort(a, tmp, left, center);
			mergeSort(a, tmp, center + 1, right);
			merge(a, tmp, left, center + 1, right);
		}
	}


   private static void merge(Comparable[ ] a, Comparable[ ] tmp, int left, int right, int rightEnd )
   {
       int leftEnd = right - 1;
       int k = left;
       int num = rightEnd - left + 1;

       while(left <= leftEnd && right <= rightEnd)
           if(a[left].compareTo(a[right]) <= 0)
               tmp[k++] = a[left++];
           else
               tmp[k++] = a[right++];

       while(left <= leftEnd)    // Copy rest of first half
           tmp[k++] = a[left++];

       while(right <= rightEnd)  // Copy rest of right half
           tmp[k++] = a[right++];

       // Copy tmp back
       for(int i = 0; i < num; i++, rightEnd--)
           a[rightEnd] = tmp[rightEnd];
   }
   
   
   
}