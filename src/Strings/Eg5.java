package Strings;

public class Eg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Afrin Shaik";
		//replace(a, b) =>replace a with b
		System.out.println(s1.replace("A","N"));
		
		//substring(i) =>substring from index
		System.out.println(s1.substring(2));
		
		//substring(i, j) From i to j-1
		System.out.println(s1.substring(2, 6));
	
		//trim() Removes leading/trailing spaces   =>o/p Shaik Afrin

		String s2="        Shaik Afrin       ";
		System.out.println(s2.trim());
	}

}
