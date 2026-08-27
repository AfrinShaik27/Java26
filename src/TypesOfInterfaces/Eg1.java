package TypesOfInterfaces;
@FunctionalInterface

interface add
{
	int addition(int a ,int b,int c);
	
}

public class Eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add obj= ( a,b,c) ->  a+b+c ;
		
			
			
			System.out.println(obj.addition(3,7,8));	
		}

	}
