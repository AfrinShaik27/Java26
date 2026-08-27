package ExceptionHandling;
class InvalidAgeException extends Exception
{
	public InvalidAgeException(String message)
	{
		super(message);
	}
}

public class Eg8 {
	
	static void validateAge(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Age is need to be above 18");
		}
		else
		{
			System.out.println("Age is eligible to vote");
		}
	}
	
	public static void main (String args[])
	{
		try
		{
			validateAge(13);
		}
		catch (InvalidAgeException e)
		{
			System.out.println("Caught Exception: "+e.getMessage());
		}
	}
	
}

