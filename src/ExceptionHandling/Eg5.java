package ExceptionHandling;
import java.util.Scanner;

public class Eg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		try
		{
			if(age<18)
			{
				throw new ArithmeticException("Your not eligible to vote");
			}
			System.out.println("Your eligible to vote");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			 e.printStackTrace();
			
		}
		System.out.println("Bye");
		

	}

}
