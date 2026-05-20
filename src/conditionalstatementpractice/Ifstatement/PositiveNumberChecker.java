package conditionalstatementpractice.Ifstatement;
import java.util.Scanner;

public class PositiveNumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number=sc.nextInt();
		if(number>0)
		{
			System.out.println("Entered Number is positive");
		}

	}

}
