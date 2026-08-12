package Enum;

enum Departments
{
	CSE,ECE,EEE,Mechanical,Civil,AI_DS;
}

public class Eg8 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Departments D=Departments.CSE;
		
//		Departments DD[]=Departments.values();
//		for(Departments d:DD)
//		{
//			System.out.println(d);
//			
//	
//		}
		
		//using valueOf()
		
		
	    String newDept="AI_DS";
		
		Departments d=Departments.valueOf("AI_DS");
		System.out.println(d);
		
		
		
		Departments dd=Departments.valueOf(newDept);
		System.out.println(dd);
		
		System.out.println(dd.ordinal());
		
		Departments ddd=Departments.ECE;
		System.out.println(ddd.ordinal());
		System.out.println(d.ordinal());
	

	}

}
