package ElementsTypesOfVariables;

public class InstanceVariable {
	//Instance variables are created inside a class and a outside a methods
	int myAge=23;
	String myname= "Afrin";
	String myemail="shaikafrin750@gmail.com";
	String Graduation="B.Tech";
	long myNumber=7013491025L;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariable obj1=new InstanceVariable();
		System.out.println("My Age is: "+obj1.myAge);
		System.out.println("My Name is: "+obj1.myname);
		System.out.println("My Email is: "+obj1.myemail);
		System.out.println("My MobileNumber is: "+obj1.myNumber);
		System.out.println("My Graduation is: "+obj1.Graduation);
		

	}

}
