package Loopingstatementspractice.Forloop;
import java.util.Scanner;
public class Perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter A Number:");
		int N=sc.nextInt();
		int P=0;
		for(int i=1;i<N;i++)
		{
			if(N%i==0)
			{
				P=P+i;
			}
		}
		if(P==N)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("NOT A Perfect Number");
		}
	}

}
