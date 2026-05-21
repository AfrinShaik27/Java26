package Loopingstatementspractice.Forloop;
import java.util.Scanner;
public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a NUmner");
		int N=sc.nextInt();
		for(int i=1;i<=N;i=i+2)
		{
			System.out.println(i);
		}
		sc.close();
		

	}

}
