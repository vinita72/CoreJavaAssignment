package dsessertShopApp;
import java.util.Scanner;

public class DessertShop {
	
	
	public static void main(String[] args) {
		 String Role;
			String n = "User";
			boolean Correct = false;

		Scanner S = new Scanner(System.in);

		System.out.println("Enter your Role Owner / User :");
		Role = S.nextLine();
			IceCream I = new IceCream("I", 20, 300);
			Candy C = new Candy("C", 10, 500);
			Cookie CK = new Cookie("CK", 20, 300);
	 
			if(Role == n) {
	            	Correct = true;
			}
			

	      if(!Correct) {
	                System.out.print(Role+ "IceCream : " +(I.getTex()+I.getcostInRupees())+ "Candy: " +(C.getTex()+C.getcostInDoller()) + "Cookie: " +(CK.getTex()+CK.getcostInEuro()));
	            }
	            else {
	                System.out.print(Role+ "Please add the items" +I.getName());

	            }
	            

	
	} 
}

