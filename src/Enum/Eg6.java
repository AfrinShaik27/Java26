package Enum;

public class Eg6 {

	
	private String name;
	private int age;
	private String myQualification;
	private long number;
	
	public Eg6()

	{
		System.out.println("Afrin");
	}
	
	public Eg6(int a,int b)
	{
	int sum=a+b;
	System.out.println(sum);
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String  getName()
	{
		return name;
	}
	
	
	
	
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	
	public int getAge()
	{
		return age;
	}
	
	
	
	
	public void setQualification(String myQualification)
	{
		this.myQualification=myQualification;
		
	}
	
	
	public String getQualification()
	{
		return myQualification;
	}
	
	
	
	
	public void setNumber(long number)
	{
		this.number=number;
	}
	
	public long getNumber()
	{
		return number;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  
		Eg6 n=new Eg6();
		Eg6 n2=new Eg6(8,9);
		n.setName("Afrin Shaik"); 
		System.out.println("I'm "+n.getName());
		
		n.setAge(24);
		System.out.println("My age is "+n.getAge());
		
		n.setQualification("B.Tech");
		System.out.println("I finished my "+n.getQualification());
		
		n.setNumber(7013491025l);
		System.out.println("This is my PhoneNumber "+n.getNumber());
	}

}
