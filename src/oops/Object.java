package oops;
//an object is a instance of a class
//it has a real existence in memory
class Practice
{
	 public void studentDetails()
	{
		String name="Afrin";
		int age=23;
		System.out.println(name+" is "+age+" year's old");
	}
}
public class Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating an object
		//here s is a reference not an object
		Practice s=new Practice();
		s.studentDetails();
	}

}
