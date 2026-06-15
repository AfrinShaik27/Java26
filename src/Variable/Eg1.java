package Variable;
import accessmodifiers.Eg2;
import accessmodifiers.Eg3;
import accessmodifiers.Eg4;
import accessmodifiers.Eg5;
import accessmodifiers.Eg6;

//to show protected modifier use case we need to use inheritance
//i declare the values a and b in Eg6 class name of accessmodifier package.
class Eg extends Eg6
{
	public void show()
	{
		System.out.println("From Eg6 class:"+a);
		System.out.println("From Eg6 class:"+b);
	}
}
public class Eg1  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variable in java is a container that holds the data which can be changed during the execution of a program
	// dataType VariableName=value;
		int age=23;
		System.out.println("Age:" +age);
		Eg1 obj=new Eg1();
		
		//accessing from accessmodifiers.Eg2 class to show use case of "public modifier";
		
		Eg2 obj1=new Eg2();
		obj1.show();
		System.out.println("value of a:"+obj1.a);
		
		
		Eg3 obj2=new Eg3();
		System.out.println("Sum of two Values:"+obj2.add(2, 4));
		
		Eg4 obj3=new Eg4();
		//System.out.println(obj3.a);  ->we are getting error why means a is private
		
		Eg5 obj4=new Eg5(); 
		//System.out.println(obj4.a);  ->we are getting error why means it is default modifier we can't access from other package , with in the same package can only we access.
		
		System.out.println();
		Eg obj5=new Eg();
		obj5.show();

	}

}
