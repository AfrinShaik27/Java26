package ExceptionHandling;

import java.util.Scanner;

public class Eg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your age:");
		
		int age=sc.nextInt();
			
			if(age<18){
				throw new ArithmeticException("Access denaied You must be 18+");
			}
			
			System.out.println("Access Granted");
		
		
		

	}

}
