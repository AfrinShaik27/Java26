package ElementsTypesOfMethods;

public class Staticmethod {
	public static void details(int id,String name)
	{
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
	}
	public static void coursetaken(String courseName)
	{
		System.out.println("Course: "+courseName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticmethod.details(1,"Afrin");
		Staticmethod.coursetaken("Java");
		Staticmethod.details(2,"Sowmyasree");
		Staticmethod.coursetaken("Python");
		Staticmethod.details(3,"Buelaw");
		Staticmethod.coursetaken("C++");
		
	}

}
