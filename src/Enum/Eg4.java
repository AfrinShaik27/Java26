package Enum;

enum Week
{
	Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
}


public class Eg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Week today = Week.Sunday;
		
		switch(today)
		{
		case Monday:
			System.out.println("Back to Work week");
			break;
			
		case Saturday:
		case Sunday:
			System.out.println("It's Weekend");
			break;
		default:
			System.out.println("It's WorkDay");
		}
			

	}

}
