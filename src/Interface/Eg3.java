package Interface;

interface Computer
{
	void code();
	
}

class laptop implements Computer
{
	public void code()
	{
		System.out.println("code,compile,run");
	}
}
class Desktop implements Computer
{
	public void code()
	{
		System.out.println("code,compile,run:faster");
	}
}

class Developer
{
	public void devApp(Computer lap)
	{
		lap.code();
	}
}
public class Eg3 {

	public static void main(String[] args) {
		
		Computer lap= new laptop();
		Computer desk=new Desktop();
		
		Developer navin=new Developer();
		navin.devApp(lap);
		

	}

}
