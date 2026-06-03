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

	}

}
