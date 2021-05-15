package threadList;

import java.util.ArrayList;

public class ThreadList {

	public static void main(String[] args) {
		ArrayList<Integer> Th = new ArrayList<Integer>();
		Th.add(5);
		Th.add(10);
		Th.add(23);
		Th.add(343);
		Th.add(93);
		Th.add(100);
		Th.add(63);
		Th.add(435);

		Thread n = new Thread(new Runnable() {
			@Override
			public void run() {
				
				Th.stream().forEach(t -> System.out.println(t));
			}
		});
		n.run();
	}
}
