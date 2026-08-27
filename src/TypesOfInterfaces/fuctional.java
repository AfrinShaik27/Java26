package TypesOfInterfaces;

@FunctionalInterface
interface functional
{
	void show(int i);
}


public class fuctional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		functional f=(i) -> 
		{
			System.out.println("in show"+ " value is "+i);
			System.out.println("Afrin");
		};
					
		f.show(5);

	}

}
