package Loopingstatementspractice.Forloop;
import  java.util.Scanner;

public class EvenNumber{

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a Number:");
		int N=sc.nextInt();
		for(int i=0; i<N; i+=2)
		{
			System.out.println(i);
		}
		sc.close();
		
		
		// TODO Auto-generated method stub

	}

}