package upcastingdowncasting;
class C
{
	public void cat()
	{
		System.out.println("cat says Meow");
	}
}
class D extends C
{
	public void dog()
	{
		System.out.println("Dog says gavv gavv");
	}
}
public class Eg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C obj = new D();
		//downcasting
		D d=(D) (obj);
		d.dog();
		d.cat();

	}

}
