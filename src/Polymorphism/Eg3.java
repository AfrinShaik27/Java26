package Polymorphism;
//Create a class Animal with method sound().
//Inherit in class Cat and override sound() to print "Meow".
//Show run-time polymorphism using a parent reference.
class Animal
{
	public void sound()
	{
		System.out.println("Animal is braknig");
	}
}
class Cat extends Animal
{
	public void sound()
	{
		System.out.println("Meow");
	}
}
public class Eg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat obj=new Cat();
		obj.sound();

	}

}
