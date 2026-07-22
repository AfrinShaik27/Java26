package Innerclass;
//Create an outer class Calculator.
//
//Create an inner class Addition that contains a method to add two numbers.
//
//Expected Output:
//Sum = 30

class Calculator
{
	class Addition
	{
	    int a;
	    int b;

		
		public int add(int a,int b)
		{
			return a+b;
			
		}
	}
}

public class Eg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj=new Calculator();
		Calculator.Addition obj1=obj.new Addition();
		int r=obj1.add(20,10);
		System.out.println("Sum:"+r);

	}

}
