package conditionalstatementpractice.Ifelseifstatement;
import java.util.Scanner;

public class GradeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program to assign grades based on marks using the following rules:
        90–100 → "Grade A"
        80–89 → "Grade B"
        70–79 → "Grade C"
        60–69 → "Grade D"
        Below 60 → "Grade F"
        Input: Marks as an integer
        Output: Grade as per the range*/
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Marks:");
		int marks=sc.nextInt();
		if((marks>=90)&&(marks<=100))
		{
			System.out.println("Grade A");
		}
		else if(marks>=80 && marks<=89)
		{
			System.out.println("Grade B");
		}
		else if(marks>=70 && marks<=79)
		{
			System.out.println("Grade c");
		}
		else if(marks>=60 && marks<=69)
		{
			System.out.println("Grade D");
		}
		else if(marks<60 && marks>0)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Entered marks are Invalid");
		}
		sc.close();

	}

}
