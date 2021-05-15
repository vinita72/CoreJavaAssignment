package BMSys;

public class CurrentAcc extends AccountHolders{

	int cashCredit;
	 public CurrentAcc(int id, String Name, int cash, int cashCredit) {
		this.cashCredit = cashCredit;
		this.id = id;
		this.Name= Name;
		this.cash = cash;

	}
	
	public int getcashCredit() {
		return cashCredit;
	}
	
}
