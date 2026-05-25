package ElementsConstructors;

public class ParameterizedConstructor {
	int id;
	String name;
	
	ParameterizedConstructor(int i, String n)
	{
		 id=i;
	    name=n;
	}
	void dispaly()
	{
		System.out.print(id);
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedConstructor s1=new ParameterizedConstructor(1," Afrin");
		ParameterizedConstructor s2=new ParameterizedConstructor(2," Sajida");
		
		s1.dispaly();
		s2.dispaly();
		

	}

}
