package Inheritance;

public class Eg2 extends Eg1 {
	
	public int multi(int n1,int n2)
	{
		return n1*n2;
	}
	
	public int div(int n1,int n2)
	{
		return n1/n2;
	}
	
	public int remain(int n1,int n2)
	{
		return n1%n2;
	}


	
	public static void main(String args[])
	{
		Eg2 obj=new Eg2();
		int r1=obj.add(2, 4);
		int r2=obj.sub(8, 4);
		int r3=obj.multi(4, 3);
		int r4=obj.div(13, 2);
		int r5=obj.remain(13, 2);
		System.out.println(r1 +":"+r2+":"+r3+":"+r4+":"+r5);
	}
	
	
	
	
}
