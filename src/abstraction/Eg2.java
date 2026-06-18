package abstraction;
//In abs class we have variables line instance and static, static can be executed here, but not instance
abstract class A
{
	int age=23;
	String name="Afrin";
	static String username="afrinaffu";

}


public class Eg2 extends A {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //       System.out.println(name);
        //		System.out.println(age);  
		//  ---> we are geeting error we can access non static variables in a static method
	
		System.out.println(username);
 
		Eg2 obj=new Eg2();
		System.out.println(obj.age);
		System.out.println(obj.name);
		
		
	}
	

}
