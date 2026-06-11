package Inheritance;
/*
Demonstrate multilevel inheritance with classes Shape → Rectangle → ColoredRectangle.
 Call methods of all classes using ColoredRectangle object.
*/
class Shape
{
	public void shape()
	{
		System.out.println("This is a Shape");
	}
}
class Rectangle extends Shape
{	
	public void rectangle()
	{
		System.out.println("This is a Rectangle");
	}
	
}
class ColoredRectangle extends Rectangle
{
	public void coloredReactangle()
	{
		System.out.println("This is a ColoredReactangle");
	}
}

public class Eg8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColoredRectangle obj=new ColoredRectangle();
		obj.shape();
		obj.rectangle();
		obj.coloredReactangle();

	}

}
