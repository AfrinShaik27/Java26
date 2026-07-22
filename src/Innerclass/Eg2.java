package Innerclass;
//Create a class Outer with a variable x = 10.
//
//Create an inner class Inner that displays the value of x.
//
//Expected Output:
//Value of x: 10

class outer
{
	int x=10;
	
	class inner
	{
		public void display()
		{
			System.out.println("The value of X is:" +x);
		}
	}
}

public class Eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer obj=new outer();
		outer.inner obj1=obj.new inner();
		obj1.display();

	}

}
