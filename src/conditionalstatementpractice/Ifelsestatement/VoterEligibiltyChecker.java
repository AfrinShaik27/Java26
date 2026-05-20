package conditionalstatementpractice.Ifelsestatement;
import java.util.Scanner;

public class VoterEligibiltyChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program to determine if a person is eligible to vote.
	    Input: Age of the person
	    Output: "Eligible to vote" if age is 18 or above, otherwise "Not eligible".*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Voter Age:");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Eligible to Vote");
		}
		else
		{
			System.out.println("Not Eligible");
		}
		sc.close();

	}

}
