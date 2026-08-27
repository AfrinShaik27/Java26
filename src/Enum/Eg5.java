package Enum;
enum Seasons
{
	Spring("Warm"),
	Summer("Hot"),
	Autumn("Cool"),
	Winter("Cold");
	
	
	private String temperature;
	
	
	Seasons(String temperature)
	 {
		 this.temperature=temperature;
	 }
	 
	 public String getTemperature()
	 {
		 return temperature;
	 }
	
	
}

public class Eg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for( Seasons s:Seasons.values())
		{
				System.out.println(s+" --> "+s.getTemperature() );
		}
		
		Seasons s = Seasons.Winter;
		System.out.println(s.getTemperature());
		

	}

}
