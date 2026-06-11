package Methodoverriding;

class A
{
	public void show()
	{
		System.out.println("in show method of A class");
	}
}
class B extends A
{
	public void show()
	{
		System.out.println("in show method of B class");
	}
}
public class Eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		obj.show();

	}

}
