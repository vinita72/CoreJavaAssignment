package artheaticOP;

import java.util.function.BiFunction;

public class ArtheaticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer, Integer, Integer> funcAddObj =(i1, i2) -> i1+i2;
		BiFunction<Integer, Integer, Integer> funcSubtracObj =(i1, i2) -> i1-i2;
		BiFunction<Integer, Integer, Integer> funcDivideObj =(i1, i2) -> i1/i2;
		BiFunction<Integer, Integer, Integer> funcultiplyObj =(i1, i2) -> i1*i2;
		BiFunction<Integer, Integer, Integer> funcModulObj =(i1, i2) -> i1%i2;
		
		System.out.println("Addition of 5 and 50 = " +funcAddObj.apply(5,50));
		System.out.println("Subtration of 5 and 50 = " +funcSubtracObj.apply(5,50));
		System.out.println("Division of 5 and 50 = " +funcDivideObj.apply(5,50));
		System.out.println("Multiplication of 5 and 50 = " +funcultiplyObj.apply(5,50));
		System.out.println("MModul of 5 and 50 = " +funcModulObj.apply(5,50));


	}

}
