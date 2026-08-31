package ExceptionHandling;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Eg10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader in =new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		try
		{
			System.out.println("Enter a value");
			int num =Integer.parseInt(br.readLine());
			int result=num/0;
			System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println("Exception caught"+e.getMessage());
		}
		finally
		{
//			br.close();
			
			//if i close the bufferedreader after that statements are not exceuting 
			System.out.println("Enter Your montly salary:");
			int salary=Integer.parseInt(br.readLine());
			System.out.println("In finally block");
		}

	}

}
