package Innerclass;

class X
{
	public void show()
	{
		System.out.println("in X show");
	}
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X obj =new X()
				{
					public void show()
					{
						System.out.println("in X new show");
					}
				};
		obj.show();

	}

}
