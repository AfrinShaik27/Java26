package upcastingdowncasting;
class Animal
{
	public void sound()
	{
		System.out.println("Animal makes sound");
	}
}
class Dog extends Animal
{
	public void brank()
	{
		System.out.println("Dog branking");
	}
}

public class Eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//upcasting
		Animal obj=new Dog();
		obj.sound();
	}

}
