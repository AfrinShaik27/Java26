package Input;
import java.util.Scanner;

public class Eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your name:");
		String name=sc.nextLine();
		
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		
		System.out.println("Hello "+name+" you are "+age+" year's old.");

	}

}
