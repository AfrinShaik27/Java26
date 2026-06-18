package abstraction;

//We can extend non abs class from abs class using multilevel inheritance
 class E
{
	public void X()
	{
		System.out.println("in X method");
	}
}
 
 abstract class F extends E
 {
	 public void Y()
	 {
		 System.out.println("in Y method");
	 }
	 public abstract void Z();
 }
 class G extends F
 {
	 public void Z()
	 {
		 System.out.println("in Z method");
	 }
 }
public class Eg6 extends G{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eg6 obj=new Eg6();
		obj.X();
		obj.Y();
		obj.Z();

	}

}
