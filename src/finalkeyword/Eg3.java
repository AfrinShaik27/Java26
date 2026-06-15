package finalkeyword;
class C
{
	public final  void show()
	{
		System.out.println("in A show");
	}
	
}

class D extends C
{
//	public void show()
//	{
//		System.out.println("in B show");
//	}
	
	//-----> it gives error that a methos can not overrides when a method declare with final keyword.
	
	
	public int add(int a,int b)
	{
		return a+b;
	}
}
public class Eg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D obj=new D();
		obj.show();
		int result=obj.add(4,7);
		System.out.println(result);

	}

}
