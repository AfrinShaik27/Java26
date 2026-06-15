package thissuper;
class E
{
	public E()
	{
		super();
		System.out.println("in E");
	}
	public E(int n)
	{
		super();
		System.out.println("in F int");
	}
}
class F extends E
{
	public F()
	{
		super(7);
		System.out.println("in F");
	}
	public F(int n)
	{
		System.out.println("in F int");
	}
	
}

public class Eg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F obj =new F();

	}

}
