package Innerclass;
class P
{
	int age;
	public void show()
	{
		System.out.println("In P Show");
	}
	//making class Q as static so that we dont need reference of P class we can directly use it
	static class Q
	{
		public void config()
		{
			System.out.println("In Q Config");
		}
	}
}

public class Eg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P obj=new P();
		obj.show();
		System.out.println(obj.age=23);
		P.Q obj1=new P.Q();
		obj1.config();

	}

}
