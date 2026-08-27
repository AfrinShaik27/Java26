package Enum;

enum Signals
{
	RED,GREEN,YELLOW;
}
public class Eg10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Signals s=Signals.RED;
		
		switch(s)
		{
		case RED:
			System.out.println("Stop!");
			break;
		case GREEN:
			System.out.println("Go!");
			break;
		case YELLOW:
			System.out.println("Slow down!");
			break;
		default:
			System.out.println("No Signal");
		}

	}

}
