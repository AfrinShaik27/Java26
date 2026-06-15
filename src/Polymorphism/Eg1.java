package Polymorphism;
//Create a class MathOperation with two add() methods (overloading):
//one for int, another for double. Show compile-time polymorphism
class MathOperation
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public double add(double a,double b)
	{
		return a+b;
	}
}
public class Eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation obj=new MathOperation();
		System.out.println("Sum of two int Values:"+obj.add(12, 67));
		System.out.println("Sum of two double Values:"+obj.add(23.7, 45));
	}

}
