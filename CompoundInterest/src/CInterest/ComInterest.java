package CInterest;
import java.util.Scanner;

public class ComInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		 double Principal;
		 double Rate;
		 double Time;
		 double Amount;
		 
		 System.out.print("Enter the Principal: ");
		 Principal = scanner.nextDouble();
		 
		 System.out.print("Enter the Rate: ");
		 Rate = scanner.nextDouble();
		 
		 System.out.print("Enter the time: ");
		 Time = scanner.nextDouble();
		 
		 Amount = Principal * Math.pow(1+Rate/100, Time);
		 System.out.print(" The Amount or comound interest is : " +Amount);


	}

}
