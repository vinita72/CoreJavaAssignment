package BMSys;

public class AccountHolders {

	public int id;
	protected String Name;
	public int cash;
	
	public void setid(int id) {
		this.id=id;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	
	public void setcash(int cash) {
		this.cash = cash;
	}
	
	public int getId() {
		return id;
	}
	
	
	public String getName() {
		 return Name;
	 }
	
	 
	public int getCash() {
		
		return cash;
	}
	
	
	
	
}
