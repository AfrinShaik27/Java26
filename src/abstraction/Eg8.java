package abstraction;
//Create an abstract class Shape.
//
//Requirements:
//Abstract method area()
//Create subclasses:
//Circle
//Rectangle
//
//Use constructors to initialize dimensions.
//
//Expected Output
//Area of Circle: 78.5
//Area of Rectangle: 50.0

abstract class Shape
{
	public abstract double area();
}
class Circle extends Shape
{
	double radius;
	
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public double area()
	{
		return 3.14 * radius * radius; 
	}
}

class Rectangle extends Shape
{
	double length;
	double breadth;
	
	public Rectangle(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	public double area()
	{
		return length * breadth;
	}
}

public class Eg8 {

	public static void main(String[] args) {
		Shape obj=new Circle(5);
		System.out.println("Area of Circle: "+obj.area());
		Shape obj1=new Rectangle(5,10);
		System.out.println("Area of Rectangle: "+obj1.area());
	

	}

}
