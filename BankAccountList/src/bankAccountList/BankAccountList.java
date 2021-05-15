package bankAccountList;

import java.util.Set;
import java.util.TreeSet;

public class BankAccountList {

	public static void main(String[] args) {


		Set<SavingAccount> set=new TreeSet<SavingAccount>(new AccComp());  
		  
		   SavingAccount b1=new SavingAccount(111,"Vachi",320382f,"No",18230f,23200f);  
		   SavingAccount b2=new SavingAccount(222,"Ross",98909f,"No",3432f,332400f);
		   SavingAccount b3=new SavingAccount(333,"Monica",3284f,"Yes",1321f,32200f);
		   SavingAccount b4=new SavingAccount(444,"El",3048329f,"Yes",393f,22000f);
		   SavingAccount b5=new SavingAccount(555,"Peppa",3983f,"Yes",8000f,322000f);
		 
		     
		   set.add(b1);  
		   set.add(b2);  
		   set.add(b3);
		   set.add(b4);
		     
		   for(SavingAccount b:set){  
		   System.out.println("Account Id:"+b.acc_ID+ 
				   " Account Holder's Name:"+b.accountholdername+
				   " Account Balance: "+b.acc_balance+" Amount withdrawn:"+b.withdraw+
				   " Amount Deposited:"+b.deposit);
		   
		   }
		 

		}
}
