package Innerclass;
class A
{
	 int age=12;
	
	public void show()
	{
		System.out.println("in A show");
	}
	
	 class B
	{
		
		public void config()
		{
			System.out.println("in a config");
		}
	}
}

public class Eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A ();
		obj.show();
		A.B obj1= obj.new B();
		obj1.config();
		System.out.println(obj.age);
	}

}
