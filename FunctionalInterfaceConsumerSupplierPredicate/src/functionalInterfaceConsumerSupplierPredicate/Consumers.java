package functionalInterfaceConsumerSupplierPredicate;

import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Consumers {

	static String cities;
	public Consumers() {
		// TODO Auto-generated constructor stub
	
		    ArrayList<String> cities = new ArrayList <>();
		    
		    cities.add("Jaipur");
		    cities.add("DR");
		    
		    Consumer<List<String>> upperCaseConsumer = list -> {
		        for(int i=0; i< list.size(); i++){
		            list.set(i, list.get(i).toUpperCase());
		        }
		    };
		    Consumer<List<String>> printConsumer = list -> list.stream().forEach(System.out::println);

		    upperCaseConsumer.andThen(printConsumer).accept(cities);
		}
	public static void main(String[] args) {
		
		System.out.print("List : " +cities);
		
	}

}