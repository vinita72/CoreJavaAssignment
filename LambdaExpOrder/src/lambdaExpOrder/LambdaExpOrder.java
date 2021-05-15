package lambdaExpOrder;

import java.util.Scanner;

public class LambdaExpOrder {

	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Amount");
		
		int price=sc.nextInt();
		
		if(price>10000)
		{
		 System.out.println(" Order Accepted");
		    
		}
		else
		{
			System.out.println("Oder denied");
			
			
			
		}
		
	}
	
}
