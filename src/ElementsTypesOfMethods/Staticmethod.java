package ElementsTypesOfMethods;


public class Staticmethod {
		public static void details(int id,String name,int age)
	{
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	
	}
	public static void coursetaken(String courseName)
	{
		System.out.println("Course: "+courseName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticmethod.details(1,"Afrin",23);
		Staticmethod.coursetaken("Java");
		Staticmethod.details(2,"Sowmyasree",22);
		Staticmethod.coursetaken("Python");
		Staticmethod.details(3,"Buelaw",22);
		Staticmethod.coursetaken("C++");
		
	}

}
