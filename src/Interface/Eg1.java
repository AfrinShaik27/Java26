package Interface;
interface A
{ 
	int age=24;
	String Area="Nellore";
	
	void show();
	void config();
}
class B implements A
{
	public void show()
	{
		System.out.println("in show");
	}
	public void config()
	{
		System.out.println("in config");
	}
}

public class Eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj;
		obj=new B();
		obj.show();
		obj.config();

	}

}
