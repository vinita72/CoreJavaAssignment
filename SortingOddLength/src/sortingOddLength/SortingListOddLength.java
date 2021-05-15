package sortingOddLength;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingListOddLength {

	String alphabets;
	
	public static void main(String[] args) throws CloneNotSupportedException 
    {
        ArrayList<String> alphabets = new ArrayList<String>();
        alphabets.add("Rama");
        alphabets.add("Mohan");
        alphabets.add("Sohan");
        alphabets.add("Rabi");
        alphabets.add("Shabbir");
  
         
     
         
        alphabets.removeIf(n -> (n.length()%2 != 0 ));  
         
        System.out.println(alphabets);
        for (String str : alphabets) {
            System.out.println(str);
        }
    }

 
	}




