package JavaInterview;

public class Eg1 {
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer  a=126;
		Integer b=126;
		System.out.println(a==b);	
		System.out.println(a.equals(b));
		
		
		Integer c=200;
		Integer d=200;
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		a=null;
		System.gc();

	}
}