package ExceptionHandling;

public class Eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]=new int[5];
		String str=null;
		try
		{
			System.out.println(num[1]);
			System.out.println(num[5]);
			
		}
	    catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array range is Exceeded"+e);
		}
		try
		{
			System.out.println(str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("String doesn't have any value "+e);
		}

	}

}
