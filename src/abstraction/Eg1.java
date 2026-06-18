package abstraction;


//Abstraction
		// The process of hiding the data and highlighting the set of services

		// What is abstract
		// abstract is a modifier or a keyword
		// to make a normal class/concrete class as abstract class we use abstract modifier
		// Abstract class contains abstract methods and concrete methods

		//Implementations
		//1.Abs Class contains concrete method and abs methods
		//2.In abs class we have variables line instance and static, static can be executed here, but not instance
		//3.In abs class we can declare static block and instance block, static block is executed, but not instance block
		//4.In abs class we can declare constructor but we cannot initialize it
		//5.Declaring only one abs method in child abs class using multi-level inheritance
		//6.We can extend non abs class from abs class using multilevel inheritance 

abstract class 	Vehical
{
	public abstract void start();
	
	public void stop()
	{
		System.out.println("Vehical stopped");
	}
}
class Car extends Vehical
{
	public void start() {
		System.out.println("Car is Started with a key..");
		
	}
	
}
class Bike extends Car
{
	public void start()
	{
		System.out.println("Bike is started with a self button key....");	
	}
}
public class Eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehical obj=new Car();
		obj.start();
		obj.stop();
		
         Vehical obj1=new Bike();
         obj1.start();

	}

}
