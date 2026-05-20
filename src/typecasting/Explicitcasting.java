package typecasting;

public class Explicitcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//large to small
		//data may loss
//		double d=89.90;
//		System.out.println(d);
//		int a =(int) d;
//		System.out.println(a);
//		float f =3.14f;
//		System.out.println(f);
//		int i =(int) f;
//		System.out.println(i);//it gives 3 as output here 0.14 data loss
//		 char ch='a';
//		 System.out.println(ch);
//		 String s=(String) ch;
		// it giving error that we can not cast from char to string
//		String s = "123";
//		int x = 10;
//		String s = String.valueOf(x);
//        System.out.println(s);
//		int p=67;
//		char ch=(char) p;
//		System.out.println(ch);
		
		
		
//		int q=23;
//		double r= 23.98;
//		int result = (q+r);
//		System.out.println(result);
//		//it gives error means that can not conver double to int 
		
		int q=23;
		double r= 23.98;
		int result = (int) (q+r);
		System.out.println(result);
		
		
		//converting String to primitive type;
		//String<->int;(needed parsing)
//		String num="123";
//		int t=Integer.parseInt(num);
//		System.out.println(t);
//		String myAge="23";
//		int s=Integer.parseInt(myAge);
//		System.out.println(s);
//		String e="129";
//		double g=Double.parseDouble(e);
//		System.out.println(g);
//		
//		String mysalary="129";
//		short h=Short.parseShort(mysalary);
//		System.out.println(h);
//		
//		String iGetJob="true";
//		boolean j=Boolean.parseBoolean(iGetJob);
//		System.out.println(j);
//		String a="10";
//		System.out.println(String.valueOf(a));
//		int x = 10;
//		String s = String.valueOf(x);
//		System.out.println(s);
		
//		int i=10;
//		float d=i;
//		System.out.println(d);
//		
//		char ch='d';
//		System.out.println(ch);
//		int j= (int) ch;
//		System.out.println(j);
		
		String s="123";
		int a=Integer.parseInt(s);
		System.out.println(a);
		 
		double d=Double.parseDouble(s);
		System.out.println(d);
		
		float f=Float.parseFloat(s);
		System.out.println(f);
		
		long l=Long.parseLong(s);
		System.out.println(l);
		
		short st=Short.parseShort(s);
		System.out.println(st);
		
		byte b=Byte.parseByte(s);
		System.out.println(s);
		
//		int x=10;
//		String y=String.valueOf(x);
//		System.out.println(y+7);
		
		int x=10;
		String s1="I Got Marks ";
		System.out.println(s1+100+" "+"in my Maths Subject");
		
	}
} 
