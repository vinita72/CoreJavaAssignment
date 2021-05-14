package Studentresult;

import java.util.Scanner;

public class StudentResult {

	
	int A, B, C;
	Scanner src = new Scanner(System.in);

	System.out.print("Enter A marks = ");
	A =src.nextInt();

	System.out.print("Enter B marks = ");
	B =src.nextInt();

	System.out.print("Enter C marks = ");
	C =src.nextInt();

	if(A>60 && B>60 && C>60)
	{
		System.out.println("Pass");
	}
	else if((A>60 && B>60 && C<60) || (A>60 && B<60 && C>60) || (A<60 && B>60 && C>60))
	{
		System.out.println("Promoted");
	}
	else
	{
		System.out.println("Fail");
	}
}
}
