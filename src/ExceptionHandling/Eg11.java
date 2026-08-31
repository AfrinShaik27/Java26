package ExceptionHandling;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Eg11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
	{
		System.out.println("Enter a Number:");
		int num=Integer.parseInt(br.readLine());
		int result=num/0;
		System.out.println(result);
		
	}
	catch(Exception e)
	{
		System.out.println("Exception caught: "+e.getMessage());
	
	}
	finally
	{
		
//		String name=br.readLine();
//		i traied with the after the try block we can not use it now why means in try block it self it clsoing the buffered reader connection
//		System.out.println("Enter Your name");
//		String name=br.readLine();
//		System.out.println("My name is:"+name);
	}

  }
}

