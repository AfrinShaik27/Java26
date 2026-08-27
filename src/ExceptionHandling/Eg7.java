package ExceptionHandling;

public class Eg7 {
	static void methodA() throws ArithmeticException
	{
		int a=100;
		int b=0;
		int result=a/b;
		System.out.println( "Result:"+ result);
	}
	static void methodB() throws ArithmeticException
	{
		methodA();
	}
	static void methodC() throws ArithmeticException
	{
		methodB();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			methodC();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handle in main:" + e.getMessage());
		}

	}

}
