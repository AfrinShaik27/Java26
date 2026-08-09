package Enum;

enum Days
{
	Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
	
}

public class Eg3 {
	
	public static void main(String args[])
	{
		
		Days today=Days.Monday;
		
		if(today==Days.Monday)
		{
			System.out.println("Strat of the Workweek");
		}
		else if(today==Days.Friday)
		{
			System.out.println("Week end is near");
		}
		
		
	}

}
