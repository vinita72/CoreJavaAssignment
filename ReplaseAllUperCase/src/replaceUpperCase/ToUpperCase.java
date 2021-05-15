package replaceUpperCase;

import java.util.ArrayList;

public class ToUpperCase {

	public ToUpperCase() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> alphabets = new ArrayList<String>();
        alphabets.add("a");
        alphabets.add("e");
        alphabets.add("i");
        alphabets.add("o");
        alphabets.add("u");
  
         
     
         
        alphabets.replaceAll(n -> n.toUpperCase());  
         
        System.out.println(alphabets);
        
    }
	}
