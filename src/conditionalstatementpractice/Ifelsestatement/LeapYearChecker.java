package conditionalstatementpractice.Ifelsestatement;
import java.util.Scanner;

public class LeapYearChecker {
	 /*Write a program to check if a given year is a leap year or not. Conditions:
    A year is a leap year if it is divisible by 4 and not divisible by 100, or divisible by 400.
    Input: Year as an integer
    Output: "Leap Year" or "Not a Leap Year"*/
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year:");
		int year=sc.nextInt();
		if(((year%4==0)&&(year%100!=0))||(year%4==0))	
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a Leap Year");
		}
		sc.close();
				
	}

}
