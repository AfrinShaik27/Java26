package Strings;

public class Eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Afrin";
		name=name+" Shaik";
		System.out.println("Hello "+name);
		String s1="afrin";
		String s2="afrin";
		
		
		//Diff b/w == operator and equals() methods
		//Reference comparison: ==
		//Content comparison: .equals() 
		
		
		System.out.println(s1==s2);
		String s3=new String("afrin");
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
		
		//to convert any string to uppercase
		System.out.println(s1.toUpperCase());
		
		String s4=new String("AFRIN");
		
		//to convert any string to lowercase
		System.out.println(s4.toLowerCase());
		System.out.println(s4.toCharArray());
	

	}
}
