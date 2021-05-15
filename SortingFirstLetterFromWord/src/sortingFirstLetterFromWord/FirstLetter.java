package sortingFirstLetterFromWord;


public class FirstLetter {

    static String firstLetterWord(String P) {
		
    	 boolean v = true;
   	     String result = "";
		// TODO Auto-generated method stub
       
		for(int i =0; i < P.length(); i++) {
			if(P.charAt(i) == ' '){
				v = true;
			} 
			else if(P.charAt(i) != ' ' && v == true)
			{
				result += (P.charAt(i));
				v = false;
			}
		}
			
		return result;

		}
	public static void main(String[] args) {

		 String P =  "Friends don't lie"; 

        System.out.println(firstLetterWord(P));

	
	}
}


