package Interface;

interface P
{ 
	int age=24;
	String Area="Nellore";
	
	void show();
	void config();
}

interface R
{
	void run();
}

interface S extends R
{
	
}

class Q implements P,R
{
	public void show()
	{
		System.out.println("in show");
	}
	public void config()
	{
		System.out.println("in config");
	}
	public void run()
	{
		System.out.println("in run");
	}
}

public class Eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		P obj;
		obj=new Q ();
		obj.show();
		obj.config();
		
		R obj1 = new Q();
		obj1.run();

	}

}
