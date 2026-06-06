package Array;
import java.util.Arrays;

public class SortingInDesendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {72,30,89,67,46,67,97};
		Arrays.sort(a);
		for(int i =a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}

	}

}
