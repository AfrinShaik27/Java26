package Inheritance;
/*Write a program with base class Vehicle and derived class Car
that adds a method fuelType(). Show single inheritance.
*/
class Vehical
{
	public void move() {
		System.out.println("Car is Moving");
	}
}
class Car extends Vehical
{
	public void fuelType()
	{
		move();
		System.out.println("Car is fully with Fuel");
	}
}

public class Eg7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj=new Car();
		obj.fuelType();

	}

}
