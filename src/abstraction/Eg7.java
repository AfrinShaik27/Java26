package abstraction;
//Create an abstract class Vehicle.
//
//Requirements:
//Abstract method: start()
//Concrete method: stop() → prints "Vehicle stopped"
//
//Create two subclasses:
//
//Car
//Bike
//
//Override start() in both classes.
//
//Expected Output
//Car starts with key
//Vehicle stopped
//
//Bike starts with kick
//Vehicle stopped

abstract class Vehicle1
{
	public abstract void start();
	
	public void stop()
	{
		System.out.println("Vehical stopped");
	}
}
class Car1 extends Vehicle1
{
	public void start()
	{
		System.out.println("Car start with key");
	}
}
class Bike1 extends Vehicle1
{
	public void start()
	{
		System.out.println("Bike start with kick");
	}
}
public class Eg7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle1 obj=new Car1();
		obj.start();
		obj.stop();
		Vehicle1 obj1=new Bike1();
		obj1.start();
		obj1.stop();
		

	}

}
