package collectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayListCollectionFremework {
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
			a.add(9);
			a.add(4);
			a.add(3);
			a.add(5);
			a.add(7);
			a.add(2);
			a.add(8);
			a.add(1);
			Collections.sort(a);
			System.out.println(a);
			Collections.sort(a, Collections.reverseOrder());
		ListIterator lr = a.listIterator();
		while(lr.hasNext())
		{

			System.out.println(lr.next());
		}
	}

}
