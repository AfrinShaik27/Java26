package conditionalstatementpractice.Ifstatement;
import java.util.Scanner;

public class Voterelgibilitychecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Voter Age:");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Voter is Eligible to Vote");
		}
		
		

	}

}
