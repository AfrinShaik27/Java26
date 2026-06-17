package upcastingdowncasting;
class A
{
	public void show1()
	{
		System.out.println("in A show");
	}
}
class B extends A
{
	public void show2()
	{
		System.out.println("in B show");
	}
}
public class Eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj =new B();
		obj.show1();
	}

}
