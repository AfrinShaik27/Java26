package ElementsTypesOfVariables;

public class StaticVariable {
	//static variables are created using the static keyword.
	//static variables are declare inside a class and outside a method.
	//the scope of static variables are class level
	//static variables are stored in method area.
	//static variables shared same memory to all objects

	static String my_Name="Afrin";
	static int my_Id=123;
	static int my_Salary=300000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My Id Is:"+StaticVariable.my_Id);
		System.out.println("My Name Is:"+StaticVariable.my_Name);
		System.out.println("My Salary Is:"+StaticVariable.my_Salary);
	}

}
