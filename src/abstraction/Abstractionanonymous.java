//here we are using both at a time abstraction and anonymous innerclass

package abstraction;

abstract class absanonymous
{
	public void show()
	{
		System.out.println("in absanonymous");
	}
}

public class Abstractionanonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 absanonymous obj=new absanonymous()
		 	{
			 
			 public void show()
			 {
				 System.out.println("in new absanonymous");
			 }
			 
		    };
		    obj.show();

	}

}
