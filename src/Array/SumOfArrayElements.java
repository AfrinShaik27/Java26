package Array;

public class SumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {67,79,56,43,66,89};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum Of Array Elements: "+sum);
		
		int[][] nums = {
			    {1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9}
			};
		int count=0;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums[i].length;j++)
			{
				count+=nums[i][j];
			}
		}
		System.out.println(count);

	}

}
