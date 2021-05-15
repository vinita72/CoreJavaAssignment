package CollectionFrameworkHashDOB;

import java.util.Hashtable;
import java.util.Map;

public class Main {

	
	public static void main(String[] args) {
        Emp e1=new Emp(123,"Vachi");
        Emp e2=new Emp(789,"Ross");
        Department d1=new Department(567,"Management");
        Map<Emp,Department> m1=new Hashtable<>();
        m1.put(e1,d1);
        m1.put(e2,d1);
        System.out.println(" The Hashcode of e1 is:" +e1.hashCode());
        System.out.println(" The Hashcode of e2 is:" +e2.hashCode());
        for(Map.Entry<Emp,Department>entry: m1.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
