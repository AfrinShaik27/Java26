package JavaInterview;
//local variables
public class Eg2  {
	
	int age=26;
	String name="Afrin";
	
	static String college="SVCN";
    
	
	public void myDetails()
	{
		String job="Junior HR";
		
		System.out.println(job);
	}
	
	
	public void add(int a,int b)
	{
		
		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Eg2 obj1=new Eg2();
	    
	    System.out.println(obj1.age);
	    String S=obj1.name;
	    System.out.println(S);
	    
	    obj1.myDetails();
	    obj1.add(3, 5);
	    
	    
	    System.out.println(Eg2.college);
	    
	    
	    

	}

}
