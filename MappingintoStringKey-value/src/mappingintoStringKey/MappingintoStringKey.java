package mappingintoStringKey;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MappingintoStringKey {

public static void main(String[] args) {
		
		HashMap<String,String> h=new HashMap<>();
		StringBuilder p=new StringBuilder();
		
		 h.put("Harry", "Potter");
		 h.put("Ross", "Monica");
		 
		 
		 
		 Set s=h.entrySet();
		 System.out.println(s);
		 
         Iterator n=s.iterator();
         while(n.hasNext())
         {
        	 Map.Entry h1 =(Map.Entry)n.next();
             String x=(String) h1.getKey()+h1.getValue();
        	 p.append(x);

         }
         
         System.out.println(p);
	}
}
