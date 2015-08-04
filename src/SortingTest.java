import static org.junit.Assert.*;

import org.junit.Test;


public class SortingTest {

	@Test
	public void testSelectionSort() {
		Sorting selection = new Sorting();
		Comparable list[] = new Comparable[10];
		
		for (int i = 9; i>=0; i--){
			list[9-i] = i;
		}
		int n, c=0;
		selection.selectionSort(list);
		for(int i=0;i<list.length;i++){
			n =  (int)list[i];
			if (n==i){
				c++;
			}
		}
		if (c!=10){
			fail();
		}
		
	}

	@Test
	public void testInsertionSort() {
		Sorting insertion = new Sorting();
		Comparable list[] = new Comparable[10];
		
		for (int i = 9; i>=0; i--){
			list[9-i] = i;
		}
		int n, c=0;
		insertion.insertionSort(list);
		for(int i=0;i<list.length;i++){
			n =  (int)list[i];
			if (n==i){
				c++;
			}
		}
		if (c!=10){
			fail();
		}
	}

	@Test
	public void testRadixSort() {
		Sorting Radix = new Sorting();
		Comparable list[] = new Comparable[10];
		
		for (int i = 9; i>=0; i--){
			list[9-i] = i;
		}
		int n, c=0;
		Radix.radixSort(list);
		for(int i=0;i<list.length;i++){
			n =  (int)list[i];
			if (n==i){
				c++;
			}
		}
		if (c!=10){
			fail();
		}
	}

}
