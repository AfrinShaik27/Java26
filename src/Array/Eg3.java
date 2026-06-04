package Array;

public class Eg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//two-dimensional array 
		System.out.println("One Dimensional array");
		int a1[]= {10,20,70,80,90};
		for(int i:a1)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		
		System.out.println("Two Dimesional array");
		int a2[][] =new int[3][4];
		a2[0][0]=1;
		a2[0][1]=2;
		a2[0][2]=3;
		a2[1][0]=2;
		a2[1][2]=4;
		a2[1][3]=6;
		a2[2][0]=1;
		a2[2][1]=2;
		a2[2][2]=3;
//		System.out.println(a1);	
		for(int i[]:a2)
		{
			for(int element:i)
			{
			System.out.print(element +" ");
			}
			System.out.println();
		}
		
		
		
		float prices[][]= {{99.00f,89.00f,65.00f},{99.00f,89.00f,65.00f},{99.00f,89.00f,65.00f}};
		
		//printing array elements using for each loop /enhanced for loop
		for(float i[]:prices)
		{
			for(float j:i)
			{
				System.out.print(j+ " ");
			}
			System.out.println("");
			
		}
		
		//to print array values using a condition 
		 for(int i=0;i<3;i++) {
			 for(int j=0;j<3;j++)
			 {
				 System.out.print(prices[i][j]);
			 }
			 System.out.println();
		 }
		 System.out.println();
		 //printing using length method of an array
		 
		 for(int i=0;i<prices.length;i++) {
			 for(int j=0;j<prices.length;j++)
			 {
				 System.out.println(prices[i][j]);
			 }
		 }
	
		
		
		

  }
}
