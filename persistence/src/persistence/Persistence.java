package persistence;

public abstract class Persistence {
	String Name;
	abstract public void persist();
	

public static void main(String[] args) {

	Persistence P =	new FilePersistence();
	P.persist();
	
	Persistence D =	new DataBasePersistence();
	D.persist();
	
}
}