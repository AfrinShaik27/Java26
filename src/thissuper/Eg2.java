package thissuper;
class C
{
	public C()
	{
		super();
		System.out.println("in C");
	}
	public C(int n)
	{
		System.out.println("in C int");
	}
}
class D extends C
{
	public D()
	{
		super();
		System.out.println("in D");
	}
	public D(int n)
	{ 
		super(n);
		System.out.println("in D int");
	}
}

public class Eg2 {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		D obj=new D(6);
		D obj1=new D();

	}

}