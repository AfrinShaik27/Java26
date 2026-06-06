package Array;

public class FindingMaximumValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {72,30,89,67,46,67,97};
		int max=a[0];
//		System.out.print(max)

		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
		    }
		}
		System.out.println(max);
//		for(int i:a)
//		{
//			if(i>max)
//			{
//				max=i;
//			}
//		}
//		System.out.println(max);
		
		int[][] nums = {
			    {1, 2, 3},
			    {90, 5, 6},
			    {7, 8, 9}
			};

		int maxi=nums[0][0];
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums[i].length;j++)
			{
				if(nums[i][j]>maxi)
				{
					maxi=nums[i][j];
				}
			}
		}
		System.out.println(maxi);

	}

}
