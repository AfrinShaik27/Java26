package Strings;

public class Stringeg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//length and character method
		
		//to find length of a string:
		//using length() method
		String s= "AfrinShaik";
		System.out.println(s.length());
		
		//to character at particular index
		System.out.println(s.charAt(7));

		//to convert to char array we use charArray()
		System.out.println(s.toCharArray());
		
		int count=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
