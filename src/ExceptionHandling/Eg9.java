package ExceptionHandling;

class A
{
	public void show() throws ClassNotFoundException
	{
		Class.forName("Eg10");
	}
}

public class Eg9 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			A obj =new A();
			try
			{
				obj.show();
			}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			
			
			
					

	}

}
