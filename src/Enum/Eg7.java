package Enum;

enum Months
{
	January,
	February,
	March,
	April,
	May,
	June,
	July,
	August,
	September,
	October,
	November,
	December
}

public class Eg7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Months M[]=Months.values();
		for(Months m:M)
		{
			System.out.println(m);
		}

	}

}
