package Innerclass;
//Create an outer class Employee with:
//
//empId
//empName
//
//Create an inner class Details that prints employee details.
//
//Expected Output:
//Employee ID: 101
//Employee Name: Afrin
class Employee
{
	int empId=101;
	String empName="Afrin Shaik";
	
	class EmployeeDetails
	{
		 public void display()
		 {
			 System.out.println("Employee Id:"+ empId);
			 System.out.println("Employee Name:" + empName);
		 }
	}
}

public class Eg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee obj=new Employee();
		Employee.EmployeeDetails obj1= obj.new EmployeeDetails();
		obj1.display();

	}

}
