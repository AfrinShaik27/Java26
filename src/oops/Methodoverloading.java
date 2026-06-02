package oops;
class Demo
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public double add(double a,int b)
	{
		return a+b;
	}
}

public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		int result=d.add(2,8);
		int result2=d.add(2,8,9);
		double result3=d.add(234678909d, 2);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);

	}

}
