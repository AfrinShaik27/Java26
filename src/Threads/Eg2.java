package Threads;

class C implements Runnable
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
class D implements Runnable
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

public class Eg2 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Runnable obj1=new C();
		Runnable obj2=new D();
		
//		System.out.println(obj1.NORM_PRIORITY);
		
//		obj1.setPriority(Thread.MAX_PRIORITY);
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		t1.start();
		t2.start();

	}

}