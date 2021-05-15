package functionalInterfaceConsumerSupplierPredicateMain;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerSupplierPredicate {
	public static void main(String[] args) {
		 
	     Consumer<String> firstC = x -> System.out.println(x.toLowerCase());
	     Consumer<String> secondC = y -> System.out.println(y.toUpperCase());
	 
	     Consumer<String> result = firstC.andThen(secondC);
	 
	    result.accept("Vachi");
	 }
	}

	class JavaPrediction {  
	    public static void main(String[] args) {  
	        Predicate<Integer> pr = a -> (a > 18); 
	        System.out.println(pr.test(18));      
	    }  
	}


	class JavaSupplier {

		 
		 public static void main(String[] args) {
		 
		  Supplier<String> supplier= ()-> "Vachi";
		  System.out.println(supplier.get());
		 }
		}
	

