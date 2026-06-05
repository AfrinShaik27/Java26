package Strings;

public class eg9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuilder is mutable,
		//It's not a thread safe
	    //it's faster than the StringBuffer
		
		//what ever the method we discussed for StringBuffer is same as the Sting Builder too
		StringBuilder sr=new StringBuilder("Programming ");
		System.out.println(sr);
		System.out.println(sr.charAt(11)); //=> it returns space
		System.out.println(sr.append("Java"));
		System.out.println(sr.toString());
		System.out.println(sr.append(" learning"));
		
				

	}

}
