package ExceptionHandling;

public class Eg6 {
	
	static void test() throws Exception
	{
		throw new ArithmeticException("Something went wrong");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			test();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Completed");
	}

}
