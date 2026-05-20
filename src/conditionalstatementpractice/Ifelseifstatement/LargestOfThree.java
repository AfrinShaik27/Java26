package conditionalstatementpractice.Ifelseifstatement;
import java.util.Scanner;
public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program to find the largest among three given numbers using if-else.
	    Input: Three integers
	    Output: "First is largest", "Second is largest", or "Third is largest".*/
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		int a=sc.nextInt();
		
		System.out.println("Enter Second Number:");
		int b=sc.nextInt();
		
		System.out.println("Enter Third Number:");
		int c=sc.nextInt();
		
		if((a>=b)&&(a>=c))
		{
			System.out.println("First is largest");
		}
		else if((b>=a)&&(b>=c))
		{
			System.out.println("Second is largest");
		}
		else
		{
			System.out.println("Third is largest");
		}
		sc.close();
		

	}

}
