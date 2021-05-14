package findArrya;

import java.util.Scanner;

public class ArrayValues {
	public static void main(String[] args) {
		int [] values = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 47};
		int toFind;
		boolean Found = false;
		
		Scanner s = new Scanner(System.in);
        System.out.print("Enter value:");
        toFind = s.nextInt();	
		
        for(int n : values) {
            if(n == toFind) {
            	Found = true;
            	break;
            }
        }
            if (Found) {
                System.out.print(toFind+ "Found");
            }
            else {
                System.out.print(toFind+ "Not Found:");

            }

        }
        	
  
	}
	

