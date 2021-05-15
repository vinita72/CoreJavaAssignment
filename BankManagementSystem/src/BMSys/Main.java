package BMSys;
public class Main extends AccountHolders{
	static int totalSavingAcc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
		SavingAcc S1 = new SavingAcc(1, "S1", 200, 39);
		SavingAcc S2 = new SavingAcc(2, "S2", 300, 29);

		CurrentAcc C1 = new CurrentAcc(1, "C1", 300, 39);
		CurrentAcc C2 = new CurrentAcc(2, "C2", 300, 33);
		
	
		totalSavingAcc = (S1.cash + S1.fixedDeposit + S2.cash + S2.fixedDeposit + C1.cash + C1.cashCredit + C2.cash + C2.cashCredit);
		
		System.out.println("Cash in SavingAcc= " +totalSavingAcc);

	}

}
