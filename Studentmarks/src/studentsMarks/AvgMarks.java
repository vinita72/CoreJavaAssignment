package studentsMarks;
import java.util.Scanner;

public class AvgMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
   int [] StudentMarksA = new int [4];
   int [] StudentMarksB = new int [4];
   int [] StudentMarksC = new int [4];
   int i = 0;
    int sum = 0;
   int total_scoreA, total_scoreB, total_scoreC, AverageA, AverageB, AverageC;
   
   
   System.out.print("Enter the Marks of student A in 3 subjects: ");
   StudentMarksA[i] = s.nextInt();
   
   sum = sum + StudentMarksA[i];
   System.out.print("total Marks in subject1: " +sum);
   
   AverageA = sum/300;
   System.out.print("Avg Marks in subjectA: " +AverageA);


   System.out.print("Enter the Marks of student B in 3 subjects: ");
   StudentMarksB[i] = s.nextInt();
   total_scoreB = StudentMarksB[1] + StudentMarksB[2] + StudentMarksB[3];
   System.out.print("total Marks in subjectB: " +total_scoreB);
   AverageB = total_scoreB/300;
   System.out.print("Avg Marks in subjectB: " +AverageB);

   
   
   System.out.print("Enter the Marks of student C in 3 subjects: ");
   StudentMarksC[i] = s.nextInt();
   total_scoreC = StudentMarksC[1] + StudentMarksC[2] + StudentMarksC[3];
   System.out.print("total Marks in subjectC: " +total_scoreC);
  AverageC = total_scoreC/300;
  System.out.print("Avg Marks in subjectC: " +AverageC);
  
  
}
}