package thissuper;
class G
{
	public G()
	{
		super();
		System.out.println("in G");
	}
	public G(int n)
	{
		super();
		System.out.println("in G int");
	}
}
class H extends G
{
	public H()
	{
		super();
		System.out.println("in H");
	}
	public H(int n)
	{
		this();
		System.out.println("in H int");
	}
	
}

public class Eg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H obj =new H(5);
	}

}
