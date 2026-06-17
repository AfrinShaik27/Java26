package wrapperclasses;

public class Eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a=128;
		Integer b=128;
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		Integer age=Integer.valueOf(23);
		System.out.println(age);
		
		int d=age;
		System.out.println(d);
		
		Integer paresentAge=d;
		System.out.println(paresentAge);
		
		String str="123";
		int c= Integer.parseInt(str);
		System.out.println(c*3);
	}

}
