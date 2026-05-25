package ElementsTypesOfMethods;

public class Instancemethod {
	// instance methods are also called non-static method
	//to call instance method we need to create an object
	//and again with object reference we can call the specific method
	
		public void countAttendies(int studentId,String studentName)
		{
			System.out.print(studentId);
			System.out.println(studentName);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Instancemethod i=new Instancemethod();
		i.countAttendies(1," Abhi");
		i.countAttendies(2," Priya");
		i.countAttendies(3," Latha");
		i.countAttendies(4," Ravi");
		
		
		//it is also possible with out creating an object
		new Instancemethod().countAttendies(5," Aruna");

	}

}
