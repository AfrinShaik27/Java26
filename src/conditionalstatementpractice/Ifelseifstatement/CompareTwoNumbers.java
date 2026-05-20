package conditionalstatementpractice.Ifelseifstatement;
import java.util.Scanner;

public class CompareTwoNumbers {
	  /*Write a program to compare two numbers and print which one is greater, or if they are equal.
    Input: Two integers
    Output: "First is greater", "Second is greater", or "Both are equal"*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a =sc.nextInt();
		System.out.println("Enter second number:");
		int b =sc.nextInt();
		
		if(a>b)
		{
			System.out.println("First is greater");
		}
		else if(b>a)
		{
			System.out.println("Second is greater");
		}
		else
		{
			System.out.println("Both are equal");
		}
		sc.close();
		
				

	}

}
