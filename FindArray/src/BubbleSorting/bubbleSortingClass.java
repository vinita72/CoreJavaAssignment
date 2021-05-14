package BubbleSorting;

import java.util.Arrays;

public class bubbleSortingClass {
	static void bubbleSort(int [] values) {
		int p = values.length;
		int temp = 0;
		
		for(int q = 0; q < p; q++ ) {
			for(int r = 1; r < (p-q); r++) {
			
				if(values[r-1]> values[r]) {
					temp = values[r-1];
					values[r-1]  = values[r];
					values [r] = temp;
				}
			}
			
		}
	} 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int values [] = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 47};
		Arrays.sort(values);
		
		System.out.println("Sortes Arrays: ");
		
		for (int i=0; i < values.length; i++) {
			System.out.println(values[i]);
		}
	}

}
