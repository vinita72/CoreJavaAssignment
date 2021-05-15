package collectionFrameWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashMapHashSet {

	public static void main(String[] args){
        HashSet<String> hm=new HashSet<>();
        hm.add("Cat");
        hm.add("Dog");
        hm.add("Elephant");
        hm.add("Monkey");
        hm.add("Cow");
        System.out.println("HashSet is Unordered");
        Iterator<String> i=hm.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("                   ");
        LinkedHashSet<String> h=new LinkedHashSet<>();
        h.add("Cat");
        h.add("Dog");
        h.add("Elephant");
        h.add("Monkey");
        h.add("Cow");
        System.out.println("LinkedHashSet is Ordered");
        Iterator<String> i1=h.iterator();
        while (i1.hasNext())
        {
            System.out.println(i1.next());
        }
    }
}
