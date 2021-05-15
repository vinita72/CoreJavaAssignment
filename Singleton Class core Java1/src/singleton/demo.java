package singleton;

public class demo extends Singletonclass {

	    private static demo instance;

	    public static synchronized Singletonclass getInstance() {
	       if (instance == null) {
	          instance = new demo();
	       }

	       return instance;
	    }       
	}

