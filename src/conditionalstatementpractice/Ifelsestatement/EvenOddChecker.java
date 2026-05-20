package conditionalstatementpractice.Ifelsestatement;
import java.util.Scanner;
public class EvenOddChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to check if a number is even or odd. Use if-else to print "Even" or "Odd"
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Entered Number is Even");
		}
		else
		{
			System.out.println("Entered Number is Odd");
		}
		sc.close();

	}

}
