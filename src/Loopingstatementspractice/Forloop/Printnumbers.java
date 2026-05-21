package Loopingstatementspractice.Forloop;
import java.util.Scanner;
public class Printnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int N=sc.nextInt();
		for(int i=0;i<=N;i++)
		{
			System.out.println(i);
		}
	}

}
