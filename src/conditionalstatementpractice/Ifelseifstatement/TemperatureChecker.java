package conditionalstatementpractice.Ifelseifstatement;
import java.util.Scanner;
public class TemperatureChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*Write a program to display a message based on temperature:
	    Temp < 0 → "Freezing cold"
	            0–10 → "Very Cold"
	            11–20 → "Cold"
	            21–30 → "Pleasant"
	            31–40 → "Hot"
	            40 → "Very Hot"
	    Input: Temperature (integer)
	    Output: Message*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Temperature Value:");
		int Temp=sc.nextInt();
		if(Temp<0)
		{
			System.out.println("Freezing cold");
		}else if(Temp<=10)
		{
			System.out.println( "Very Cold");
		}
		


	}

}
