package Methodoverriding;
class Cal
{
	public int add(int n1,int n2)
	{
		return n1+n2;
	}
}
class Adcal extends Cal
{
	public int add(int n1,int n2)
	{
		return n1+n2+1;
	}
}

public class Eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adcal obj =new Adcal();
		int r1=obj.add(2, 5);
		System.out.println(r1);

	}

}
