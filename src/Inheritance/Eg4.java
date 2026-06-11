package Inheritance;
//Create a class Person with name and age. Inherit it in class Employee
//and add salary. Write a method to display details from both classes.

class Person
{
	String name;
	int age;
	
	
	
	Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	public void PersonDetails()
	{
		System.out.println("Name: " +name);
		System.out.println("Age: " +age);
	}
}

class Employee extends Person
{

	double salary;
	Employee(String name, int age,double salary) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.salary=salary;
	}
	
	public void EmployeeDetails()
	{
		PersonDetails();
		System.out.println("Salary: "+salary);
	}
	
}

public class Eg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e= new Employee("Afrin Shaik",23,25000);
		e.EmployeeDetails();
		

	}

}
