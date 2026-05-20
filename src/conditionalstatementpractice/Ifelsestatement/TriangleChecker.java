package conditionalstatementpractice.Ifelsestatement;
import java.util.Scanner;

public class TriangleChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  /*Write a program to check whether three given sides can form a valid triangle.
	    Condition: The sum of any two sides must be greater than the third.
	    Input: Three integers representing sides
	    Output: "Valid triangle" or "Invalid triangle*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side 1:");
		int a=sc.nextInt();
		
		System.out.println("Enter side 2:");
		int b=sc.nextInt();
		
		System.out.println("Enter side 3:");
		int c=sc.nextInt();
		
		if((a+b>c) && (b+c>a) && (b+c>a))
		{
			System.out.println("Valid triangle");
		}
		else
		{
			System.out.println("InValid triangle");
		}
		sc.close();

	}

}
