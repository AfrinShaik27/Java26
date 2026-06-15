package Polymorphism;
//Create a class Printer with method print(String), print(int),
//and print(double). Demonstrate method overloading.
class Printer
{
	public String print(String n)
	{
		return n;
	}
	
	public int print(int a)
	{
		return a;
	}
	public double print(double b)
	{
		return b;
	}
}
public class Eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer obj=new Printer();
		String result =obj.print("Hi, I'm Afrin Welcome to learn Polymorphism");
		int a=obj.print(3);
		double b=obj.print(23);
		System.out.println(result);
		System.out.println(a);
		System.out.println(b);
	}

}
