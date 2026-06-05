package encapsulation;
 class Encaps
{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		this.age = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		this.name = n;
	}
	
	
}
 

public class Eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//wrapping the data and their methods into a single unit is called as encapsulation
//		Protect data from unauthorized access
//		● Hide internal details (data hiding)
//		● Control how data is accessed or modified
//		● Improves code maintainability and security
		//we can achieve encapsulation by using getters and setters
		
		Encaps obj=new Encaps();
//		System.out.println(obj.getAge());
	     obj.setName("Afrin Shaik");
	     obj.setAge(23);
	     
	     System.out.println("Name: "+obj.getName());
	     
	     System.out.println("Age: "+obj.getAge());

	}

}
