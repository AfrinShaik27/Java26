package Strings;

public class Eg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//=> Searching
		//   Method             Description                   Example
		//	indexOf(ch)      Index of first match      "banana".indexOf('a') → 1
		//  lastIndexOf(ch)  Index of last match       "banana".lastIndexOf('a') → 5
		//  contains(str)    Checks presence           "Java".contains("va") → true
		//  startsWith(str)  Checks prefix             "Java".startsWith("Ja")
		//  endsWith(str)    Checks suffix             "Java".endsWith("va")
		
		String s1="Progrmming";
		System.out.println(s1.charAt(1));  //=>r
		
		System.out.println(s1.contains("gr"));  //=> true
		
		System.out.println(s1.startsWith("Pro")); //=>true
		
		System.out.println(s1.length()); //10
		
		System.out.println(s1.endsWith("ming"));  //true

		 
	}

}
