package conditionalstatementpractice.Ternaryopertor;
import java.util.Scanner;

public class signofnumber {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//Write a program to check whether a number is positive or negative (or zero).
	    //Input: Integer
	    //Output: "Positive", "Negative", or "Zero"
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		String result=(num > 0)?"Positive":(num<0)?"Negative":"Zero";
		System.out.println(result);
		
		
	}

}
