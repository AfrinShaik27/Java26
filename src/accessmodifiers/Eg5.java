package accessmodifiers;

public class Eg5 {
	int a=15;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eg5 obj=new Eg5();
		System.out.println(obj.a);
		
		System.out.println("From Eg6 class accessing Protected modifier values");
		Eg6 obj1=new Eg6();
		System.out.println(obj1.a);
		System.out.println(obj1.b);

	}

}
