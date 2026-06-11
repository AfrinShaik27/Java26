package Inheritance;
/*
Create a class A, inherit it in B, then B in C (Multilevel).
 Add one method in each class and call all from C object
*/
class A
{
	public void methodA()
	{
		System.out.println("Method in A class");
	}
}

class B extends A
{
	public void methodB()
	{
		System.out.println("Method in B class");
	}
}

class C extends B
{
	public void methodC()
	{
		System.out.println("Method in C class");
	}
}

public class Eg6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj=new C();
		obj.methodA();
		obj.methodB();
		obj.methodC();

	}

}
