package Polymorphism;
//Create class Shape with method area(). Override it in Circle and Square.
//Call using Shape reference to different objects.
class Shape
{
	public void area()
	{
		System.out.println("Area of a Shape");
	}
}
class Circle extends Shape
{
	public void area()
	{
		System.out.println("Area of a Circle is:πr^2");
	}
}
class Square extends Shape
{
	public void area()
	{
		System.out.println("Area of Square is:(l*b)");
	}
}
public class Eg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Shape();
		
		s=new Circle();
		s.area();
		
		s=new Square();
		s.area();

	}

}
