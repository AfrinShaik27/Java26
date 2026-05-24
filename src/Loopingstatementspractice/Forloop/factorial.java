package Loopingstatementspractice.Forloop;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int N =sc.nextInt();
		int fact=1;
		for(int i=1;i<=N;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorail of "+ N +"!"+" is:" +fact);
		sc.close();
		
		

	}

}
