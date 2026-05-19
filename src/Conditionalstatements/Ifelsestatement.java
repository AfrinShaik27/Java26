package Conditionalstatements;

public class Ifelsestatement {

	//when we to want work with 2 condition we go for if-else statement
		//if-else statement in java works like if condition is true then the first block code is executed,otherwise else block code is executed.

		public static void main(String[] args) {
			// TODO Auto-generated method   
			int age=8;
			if(age>=18)
			{
				System.out.println("Person is eligible to vote:"+age);
				
			}
			else
			{
				System.out.println("Person is not eligible to vote:"+age);	
			}
		}

}
