package Array;

public class Eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[][]=new int[3][4];
		nums[0][0]=10;
		nums[0][1]=1;
		nums[0][2]=19;
		nums[0][3]=70;
		nums[1][0]=10;
		nums[1][1]=1;
		nums[1][2]=19;
		nums[1][3]=70;
		nums[2][0]=10;
		nums[2][1]=1;
		nums[2][2]=19;
		nums[2][3]=70;
		
		int nums1[][]=new int[3][4];
		
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				//here math.random is used to get randomly  math values "math" is a class in java and "random()" is a method
				 nums1[i][j]=(int) (Math.random()*100);
				System.out.print(nums1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(nums.length);
		System.out.println(nums[0].length);
		
		System.out.println(" ");
		//using for each loop
		for(int i[]:nums)
		{
			for(int j:i)
			{
				System.out.print(j+ " ");
			}
			System.out.println(" ");
		}
		//Using Strings
		
		String s[]=new String[4];
		s[0]="Afrin";
		s[1]="Afrin";
		s[2]="Afrin";
		s[3]="Afrin";
		
		for(String i:s)
		{
			System.out.print(i+" ");
		}
		
		System.out.println(" ");
		String s1[][]=new String[3][3];
		s1[0][0]="AfrinShaik";
		s1[0][1]="AfrinShaik";
		s1[0][2]="AfrinShaik";
		s1[1][0]="AfrinShaik";
		s1[1][1]="AfrinShaik";
		s1[1][2]="AfrinShaik";
		s1[2][0]="AfrinShaik";
		s1[2][1]="AfrinShaik";
		s1[2][2]="AfrinShaik";
		
		for(String i[]:s1)
		{
			for(String j:i)
			{
				System.out.print(j+" ");
			}
		System.out.println(" ");
		}
	}

}
