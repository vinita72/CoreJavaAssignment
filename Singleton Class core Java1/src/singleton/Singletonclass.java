package singleton;

public class Singletonclass {

	
	private static Singletonclass instance;

    protected Singletonclass() {
    }

    public static synchronized Singletonclass getInstance() {
       if (instance == null) {
          instance = new Singletonclass();
       }

       return instance;
    }

    public int a() {
		return 0;
       
    }       
}

