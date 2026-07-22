package Innerclass;

class Outer1
{
	private int rollNo=101;
	
	class Inner1
	{
		public void show()
		{
			System.out.println("RollNo is :"+rollNo);
		}
	}
}


public class Eg6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer1 obj=new Outer1();
		
		Outer1.Inner1 obj1 =obj.new Inner1();
		
		obj1.show();

	}

}
