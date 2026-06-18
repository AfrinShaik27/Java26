package abstraction;
//In abs class we can declare constructor but we cannot initialize it
abstract class Constuctor
{
	public Constuctor()
	{
		System.out.println("in Constructor class");
	}
	
	
//		new Constuctor();  --->we can not create a object to a abstract class
	//}
}

 class Eg4  extends Constuctor{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Eg4();

	}

}

