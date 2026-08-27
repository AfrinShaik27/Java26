package ExceptionHandling;
public class Eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		int j=0;
		try {
			
			 j=23/i;	 
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong... "+e);
		}
		
		
		System.out.println(j); 
		System.out.println("Bye");

	}

}
