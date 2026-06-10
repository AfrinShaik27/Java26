package ElementsConstructors;

public class ParameterizedConstructor {
	int id;
	String name;
	
	ParameterizedConstructor(int i, String n)
	{
		 id=i;
	    name=n;
	}
	public ParameterizedConstructor(String name) {
		this.name = name;
	}
	public ParameterizedConstructor(int id) {
		this.id = id;
	}
	void display()
	{
		System.out.print(id);
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedConstructor s1=new ParameterizedConstructor(1," Afrin");
		ParameterizedConstructor s2=new ParameterizedConstructor(2," Sajida");
		ParameterizedConstructor s3=new ParameterizedConstructor(" Shaik");
		ParameterizedConstructor s4=new ParameterizedConstructor(3," ");
		
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();

	
	}
	

}
