package Interface;

interface fruits
{
	void name();
	void color();
	
}
interface vegitables
{
	void name();
}

class fruitsvegitable implements fruits,vegitables
{
	public void name()
	{
		System.out.println("Apple");
	}
	
	public void color()
	{
		System.out.println("Red");
	}

	public void veginame() {
	System.out.println("Tomato,Onion");
		
	}
}

public class Eg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fruits f = new fruitsvegitable();
		vegitables g=new fruitsvegitable();
		f.name();
		f.color();
		g.name();
		
	}

}
