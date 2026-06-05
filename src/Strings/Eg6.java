package Strings;

public class Eg6 {
	
	public static void main(String args[])
	{
		//=> Joining & Splitting
		//Method Description Example
		//concat(str) Joins strings "Hi".concat("Bye")
		//split(regex) Splits into array "a,b,c".split(",")
		
		String s1="Java Learning";
		System.out.println("Afrin is ".concat(s1));
		
		String learn []=s1.split(" ");
		System.out.println(learn[0]);
		
		
		String s2=new String("Apple,Banana,Mango");
		System.out.println(s2);
		String friuts[]=s2.split(",");
		System.out.println(friuts[0]);
		System.out.println(friuts[1]);
		System.out.println(friuts[2]);
		
		String s3=new String("Afrin");
		System.out.println(s3.toCharArray());
		System.out.println(s3);
		
		String s4="Afrin is learning java After Afrin will get a Job In her dream company She is So Happy Then";
		
		System.out.println(s4.replaceAll("is", "IS"));
		System.out.println(s4.replace("is","IS"));
	}

}
