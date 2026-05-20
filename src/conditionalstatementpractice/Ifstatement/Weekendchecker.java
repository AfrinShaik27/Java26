package conditionalstatementpractice.Ifstatement;
import java.util.Scanner;
public class Weekendchecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  /*Write a program to check if a person is eligible to vote.
	     The person must be 18 or older and a citizen of the country.
	     Use age and isCitizen boolean flag as input.
	     Print "Eligible to vote" or "Not eligible to vote".*/
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a day");
		String s=sc.next();
		if((s.equalsIgnoreCase("Saturday"))||(s.equalsIgnoreCase("Sunday")))
		{
			System.out.println("Enter day is Weened");
		}
		System.out.println((s.equalsIgnoreCase("Saturday")));
		
		

	}

}
