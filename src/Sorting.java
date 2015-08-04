//********************************************************************
//  Sorting.java       Author: Lewis/Loftus
//
//  Demonstrates the selection sort and insertion sort algorithms.
//********************************************************************

public class Sorting
{
   //-----------------------------------------------------------------
   //  Sorts the specified array of objects using the selection
   //  sort algorithm.
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
   //  sort algorithm.
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
}
