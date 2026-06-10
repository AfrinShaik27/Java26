package ElementsTypesOfMethods;
class staticmethod{
	String brand;
	int price;
	static String name;
	
	
	public static void details(String brand,int price)
	{
		System.out.println("Brand : "+brand+"Price : "+price+"Name : "+name);
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticmethod obj=new staticmethod();
		obj.name="Smart Phone";
		staticmethod.details("VIVO V60",42500);

	}

}
