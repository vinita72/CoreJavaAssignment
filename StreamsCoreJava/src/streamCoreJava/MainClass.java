package streamCoreJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

	

	public static void main(String[] args) {
		List<Fruit> fru = Arrays.asList(

				new Fruit("Apple", 54, 33, "Red"), 
				new Fruit("Waterelon", 32, 43, "Green"),
				new Fruit("Banana", 34, 54, "Yellow"), 
				new Fruit("Guava", 32, 32, "Green"));

		List<News> news1 = Arrays.asList(

				new News(17, "Vachi", "Ring", " Hey, this is vachi"),
				new News(18, "Vachi", "Ring", " Hey, this is vachi"),
				new News(19, "Vachi", "Ring", " Hey, this is vachi"),
				new News(20, "Vachi", "Ring", " Hey, this is vachi"),
				new News(21, "Vachi", "Ring", " Hey, this is vachi"));
		List<Trader> Trade = Arrays.asList(

				new Trader("Vachi", "Jaipur"), 
				new Trader("Ross", "Delhi"), 
				new Trader("Harry", "Jaipur"),
				new Trader("Vachi", "Delhi"),
				new Trader("Ross", "Jaipur"), 
				new Trader("Sam", "Pune"));
		List<Transection> Tran = Arrays.asList(

				new Transection(new Trader("Vachi", "Jaipur"), 2012, 20001),
				new Transection(new Trader("Vachi", "Jaipur"), 2011, 21021),
				new Transection(new Trader("Harry", "Jaipur"), 2014, 20021),
				new Transection(new Trader("Harry", "Jaipur"), 2014, 20021),
				new Transection(new Trader("Harry", "Jaipur"), 2012, 20021));

		
		
		
		System.out.println("Acoording to <less calories ");
		fru.stream().filter(t -> (t.calories < 100)).collect(Collectors.toList())
				.forEach(t -> System.out.println(t));

		
		
		System.out.println("\nSort according to color");
		fru.stream().sorted((p1, p2) -> p1.color.compareTo(p2.color)).forEach(System.out::println);

		
		
		System.out.println("\nSort Green color fruits sorted withprice in ascending");
		fru.stream().filter(t -> t.color.equals("Green")).forEach(t -> System.out.println(t));

		
		
		System.out.println("\nnewsId which has received maximum comments");
		int p = news1.stream().min((p1, p2) -> {
			return (int) p1.getNewsID() + p2.getNewsID();
		}).get().getNewsID();
		System.out.println(p);

		
		
		System.out.println("\nthe word 'budget' arrived in user comments ");

		news1.stream().filter(t -> t.comment.contains("budget")).forEach(t -> System.out.println(t));

		
		
		System.out.println("\nwhich user has posted maximum comments");
		String n = news1.stream().max((p1, p2) -> {
			return (int) p1.getCommentbyUser().compareTo(p2.getCommentbyUser());
		}).get().getCommentbyUser();

		System.out.println(n);

		
		
		System.out.println("\ncommentByUser wise number of comments");
		news1.stream().sorted((p1, p2) -> p1.getCommentbyUser().compareTo(p2.getCommentbyUser()))
				.collect(Collectors.toList())
				.forEach(t -> System.out.println(t.getCommentbyUser() + "=" + t.comment));

		
		
		System.out.println("\ntransactions in the year 2014 and sort them by value (small to high).");
		Tran.stream().filter(t -> (t.getYear() == (2014)))
				.forEach(t -> System.out.println("year=" + t.year + " value=" + t.value));

		
		
		System.out.println("\nall the unique cities where the traders work");

		Trade.stream()

				.forEach(t -> System.out.println("Cityies=" + t.tcity));
		
		
		
		System.out.println("\ntraders from Jaipur and sort them by name");
		Trade.stream().filter(t -> t.tcity.equals("Jaipur"))
				.sorted((p1, p2) -> p1.tname.compareTo(p2.tname))
				.forEach(t -> System.out.println(t.tcity + "=" + t.tname));



		System.out.println("\nstring of all traders’ names sorted alphabetically");
		Trade.stream().sorted((p1, p2) -> p1.tname.compareTo(p2.tname))
				.forEach(t -> System.out.println(t.tname));



		System.out.println("\nany traders based in Pune?");
		boolean a = Trade.stream().anyMatch(t -> t.tname.equals("Pune"));
		System.out.println(a);



		System.out.println("\nall transactions’ values from the traders living in Delhi");

		Tran.stream().filter(t -> t.trader.tcity.equals("Delhi"))
				.forEach(t -> System.out.println(t.trader.tcity + "=" + t.value));



		System.out.println("\nhighest value of all the transactions");

		int b = Tran.stream().max((p1, p2) -> p1.value - p2.value).get().getValue();

		System.out.println(b);


		System.out.println("\ntransaction with the smallest value");
		int s = Tran.stream().min((p1, p2) -> p1.value - p2.value).get().getValue();

		System.out.println(s);

	}

}
