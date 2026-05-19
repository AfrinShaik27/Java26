package conditionalstatementpractice.Ternaryopertor;
import java.util.Scanner;
public class largernumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Write a program to find the maximum of two numbers using a ternary operator.
	    //Input: Two integers
	    //Output: Larger number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int max=(a>b)?a:b;
		System.out.println("Maximum of two numbers:" +max);
		

	}

}
