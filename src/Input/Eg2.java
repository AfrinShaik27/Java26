package Input;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Eg2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name:");
		String name=br.readLine();
		
		System.out.println("Enter your age");
		int age=Integer.parseInt(br.readLine());
		
		System.out.println("Hello "+name+" You are a "+age+" Year's old.");

	}

}
