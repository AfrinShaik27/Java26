package finalkeyword;

public class Eg1 {
	
	final int a=10;
	public void show()
	{
		//a=12;---> it giving an error once a variable decalre as final we can not re assign it ,it behaves like a constant now
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eg1 obj=new Eg1();
		int r =obj.a;
		System.out.println(r);
		obj.show();
	}

}
