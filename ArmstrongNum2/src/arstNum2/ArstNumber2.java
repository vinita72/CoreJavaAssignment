package arstNum2;

public class ArstNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 100, arm;
		System.out.println("Armstrong numbers between 100 to 999");
		while(i<1000)
		{
		arm=armstrongOrNot(i);
		if(arm==i)
		System.out.println(i);
		i++;
		}
		}
	static int armstrongOrNot(int num)
	{
		int x,a=0;
		while(num!=0)
		{
			x=num%10;
			a=a+(x*x*x);
			num/=10 ;
		}
		return a;
	}
			} 
						
		

