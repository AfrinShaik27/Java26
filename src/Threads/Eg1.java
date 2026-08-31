package Threads;
class A extends Thread
{
	public void run()
	{
		for(int i=0;i<=100;i++)
		{
			System.out.println("Hi"); 
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("Hello");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1=new A();
		B obj2=new B();
		
//		System.out.println(obj1.NORM_PRIORITY);
		
//		obj1.setPriority(Thread.MAX_PRIORITY);
		
		obj1.start();
		obj2.start();

	}

}
