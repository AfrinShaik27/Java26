package conditionalstatementpractice.Ifelsestatement;
import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	 Write a program to simulate a login system.
//	 Input: A username and a password
//	 output: If the username is "admin" and the password is "1234",
//	 print "Login successful"; otherwise, print "Invalid credentials"
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter username:");
		String username=sc.next();
		System.out.println("Enter userpassword:");
		String password=sc.next();
		if(username.equals("admin")&&password.equals("123"))
		{
			System.out.println("Login successful");
		}
		else
		{
			System.out.println("Invalid credentials");
		}
		sc.close();

	}

}
