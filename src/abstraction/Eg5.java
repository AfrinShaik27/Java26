package abstraction;
//Declaring only one abs method in child abs class using multi-level inheritance
abstract class Hyundaicar
{
	public abstract void i20Base();
	public abstract void i20Asta();
	public abstract void i20Sport();
	public abstract void i20Astaplus();
}
 
abstract class CustomorOne  extends Hyundaicar
{
	public void i20Base()
	{
		System.out.println("Customor Booked i20Base Model");
	}
}

abstract class CustomorTwo extends CustomorOne
{
	public void i20Asta()
	{
		System.out.println("CustomorTwo Booked i20Asta Model");
	}
}
 class CustomorThree extends CustomorTwo
{


	public void i20Sport() {

		System.out.println("CustomerThree Booked i20Sport");
	}

	
	public void i20Astaplus() {
		
		System.out.println("CustomorThree Booked i20Astaplus");
	}
	
}
public class Eg5 extends CustomorThree  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Eg5 obj=new Eg5();
        obj.i20Base();
        obj.i20Asta();
        obj.i20Sport();
        obj.i20Astaplus();
        
	}

}
