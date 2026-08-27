package ExceptionHandling;


public class Eg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int salary=5000;
		if(salary<10000)
		{
			throw new  RuntimeException("Your salary is too low");
		}
		

	}

}
