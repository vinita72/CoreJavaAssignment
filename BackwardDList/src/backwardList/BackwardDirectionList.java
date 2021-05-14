package backwardList;
import java.util.*;
import java.util.Collections;

public class BackwardDirectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
 String [] crap = {"First", "Sec", "third", "Four"};
 
 List<String> P = Arrays.asList(crap);
 
   Collections.reverse(P);
   
	System.out.print("list: "+P);

	}

}
