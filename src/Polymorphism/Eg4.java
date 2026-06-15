package Polymorphism;
//Write a class Bank with method getInterestRate().
//Inherit it in SBI, ICICI, override the method in each.
//Call using parent reference to show runtime polymorphism.
class Bank
{
	public double getInterestRate()
	{
		return 0.0;
	}
}
class SBI extends Bank
{
	public double getInterestRate()
	{
		return  0.25;
		
	}
}
class ICICI extends Bank
{
	public double getInterestRate()
	{
		return 0.75;
	}

}
public class Eg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj=new Bank();
		
		obj=new SBI();
		System.out.println("Rate of Interest:" +obj.getInterestRate());
		
		obj=new ICICI();
		System.out.println("Rate of Interest:" +obj.getInterestRate());
		
		
		

	}

}
