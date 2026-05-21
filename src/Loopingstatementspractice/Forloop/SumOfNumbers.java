package Loopingstatementspractice.Forloop;
import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A Number:");
		int N=sc.nextInt();
		int sum=0;
		for(int i=1;i<=N;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
