package armstrongNum1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 153;
		int temp = i;
		int r, sum = 0;
		
		while(i>0) {
			r = i%10;
			i = i/10;
			sum = sum + (r*r*r);

		}
		if (sum == temp) {
			System.out.print("this is armstrong number");

		}else {
			System.out.print("this is not an armstrong number");

		}
		
	}

}
