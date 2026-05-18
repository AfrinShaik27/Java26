package Variable;

public class Eg2 {
	public void showDetails()
	{
		int age=23;
		//int age=23; here it is a local variable
		//local variable is defined inside a method/block
		//the scope of this variable is with in that block/method
		System.out.println("Age:"+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(age);-> it an error"age cannot be resolved to a variable"
		Eg2 a=new Eg2();
		a.showDetails();
	}
}
