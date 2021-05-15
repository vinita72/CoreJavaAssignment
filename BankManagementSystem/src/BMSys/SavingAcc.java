package BMSys;

public class SavingAcc extends AccountHolders{
	
	int fixedDeposit;
	
	 public SavingAcc(int id, String Name, int cash, int fixedDeposit) {
		this.fixedDeposit = fixedDeposit;
		this.id = id;
		this.Name= Name;
		this.cash = cash;

	}
	
	public int getfixedDeposit() {
		return fixedDeposit;
	}
	public void getfixedDeposit(int fixedDeposit) {
		this.fixedDeposit = fixedDeposit;
		
	}
	
}

	
	

	