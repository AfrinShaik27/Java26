package Array;

public class Eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[][]=new int[3][4];
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				//here math.random is used to get randomly get math values "math" is a class in java and "random()" is a method
				 nums[i][j]= (int) (Math.random()*10);
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
