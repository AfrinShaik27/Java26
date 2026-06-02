package oops;
//method in java is block of code that performs of task,it defines the  of an object.
class Computer{
	
	public void musicPlaying()
	{
		System.out.println("MusicPlaying...");
	}
	
	public int add (int a,int b)
	{
		return a+b;
	}
}
public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c=new Computer();
		c.musicPlaying();
		int result=c.add(9, 7);
		System.out.println(result);

	}

}
