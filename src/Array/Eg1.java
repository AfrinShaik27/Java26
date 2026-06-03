package Array;

public class Eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//when we want to store multiple values in a single variable of same data type in that case we use arrays
		//an array is an object container that holds multiple data types of same data type
		//arrays are mutable 
		//but arrays are fixed in size we can not change the size of an array once it declare
		// arrays are objects
		
		//datatpe arrayname[]={value1,value2,value3,........,valuen}; --> declaration and initialization
		
		int num1[]= {1,2,3,5,56};
		System.out.println(num1.length);
		
		//creating an empty array
		//dataype arrayname[]=new datatype[size];
		
		int num2[]=new int[6];
		//System.out.println(num2[5]);
		
		//initializing values into the array
		num2[0]=19;
		num2[1]=89;
		num2[2]=90;
		num2[3]=45;
		num2[4]=70;
		num2[5]=65;
	
		
		//printing values array
		System.out.println(num2[0]);
		System.out.println(num2[1]);
		System.out.println(num2[2]);
		System.out.println(num2[3]);
		System.out.println(num2[4]);
		System.out.println(num2[5]);
		
		System.out.println(num2.length);
		
		//printing an array with the for loop
		
		for(int i=0;i<num2.length;i++)
		{
			System.out.println("at "+i+"th index "+num2[i]);
		}
		
		
		
//		Integer num3[]=new Integer[6];
//		System.out.println(num3[5]); ==>null
		
		
		
		int nums[]= {2,8,9,6};
		for(int i=0;i<4;i++)
		{
			System.out.println("at "+i +"th Index " + nums[i]);
		}
	}

} 
