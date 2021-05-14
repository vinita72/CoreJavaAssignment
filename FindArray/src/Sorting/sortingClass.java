package Sorting;
import java.util.Arrays;

public class sortingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] values = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 47};
		Arrays.sort(values);
		
		System.out.println("Sortes Arrays: ");
		
		for (int i=0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		
	}

}
