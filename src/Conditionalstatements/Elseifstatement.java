package Conditionalstatements;

public class Elseifstatement {
	// if want work with multiple conditions then we go for elseif statement
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=36;
		if(marks>=90)
		{
			System.out.println("Grade:A");
		}
		else if(marks>=80){
			System.out.println("Grade:B");
		}
		else if(marks>=70){
			System.out.println("Grade:C");
		}
		else if(marks>=60){
			System.out.println("Grade:D");
		}
		else if(marks>=50){
			System.out.println("Grade:E");
		}
		else
		{
			System.out.println("fail");
	    }
		

	}

}
