package Strings;

public class Eg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//equalsIgnoreCase(str) Ignore case
		String s1="AfrinShaik";
		String s2="afrinshaik";
		System.out.println(s1.equalsIgnoreCase(s2));
		//it returns true becoz it checks case inside a string 
		
		//compareTo(str) Lexicographic compare
		String s3="A";
		String s4="B";
		System.out.println(s3.compareTo(s4));

	}

}
