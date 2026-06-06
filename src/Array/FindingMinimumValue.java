package Array;

public class FindingMinimumValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {72,30,89,67,46,67,97};
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
		
		int[][] nums = {
			    {1, 2, 3},
			    {90, 5, 6},
			    {7, 8, 9}
			};
		int mini=nums[0][0];
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums[i].length;j++)
			{
				if(nums[i][j]<mini)
				{
					mini+=nums[i][j];
				}
			}
		}
		System.out.println(mini);
		
		

	}

}
