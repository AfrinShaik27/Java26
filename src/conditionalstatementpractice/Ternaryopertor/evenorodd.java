package conditionalstatementpractice.Ternaryopertor;
import java.util.Scanner;
public class evenorodd {
	public static void main(String[] args)
	{
	//Write a program to check if a number is even or odd using a ternary operator.
	//Input: An integer
	//Output: "Even" or "Odd"
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		String result=(num % 2 ==0)?"Entered Number is Even":"Entered Number is Odd";
		System.out.println(result);
				
	}

}
