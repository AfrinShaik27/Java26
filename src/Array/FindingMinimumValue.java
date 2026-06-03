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

	}

}
