package abstraction;
//In abs class we can declare static block and instance block, static block is executed, but not instance block
abstract class C
{
	{
		System.out.println("in instance block");
	}
	
	static 
	{
		System.out.println("in static block");
	}
			
		
}
public class Eg3 extends C {
	
	public static void main(String args[])
	{
//		new Eg3();
		
		//when we create an object then instance method is executed.
	}

}
