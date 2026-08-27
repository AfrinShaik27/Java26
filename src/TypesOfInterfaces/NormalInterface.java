package TypesOfInterfaces;

interface Animal
{
	void eat();
	void sleep();
}

class Dog implements Animal
{
	public void eat()
	{
		System.out.println("Dog is eatting");
	}
	
	public void sleep()
	{
		System.out.println("Dog is Sleeping");
	}
}
public class NormalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj=new Dog();
		obj.eat();
		obj.sleep();

	}

}
