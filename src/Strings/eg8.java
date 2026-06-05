package Strings;

public class eg8 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuffer is mutable,
		//It's a thread safe
		//it's slower than the StringBulider
		
		StringBuffer sb =new StringBuffer("Afrin");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb);
		System.out.println(sb.append(" Shaik"));
//		System.out.println(sb.deleteCharAt(3));
//		System.out.println(sb.reverse());
		sb.ensureCapacity(50);
		System.out.println(sb.capacity());
//		
//		System.out.println(sb.replace(0,4,"null "));//replace(int start,int end,Str);
		
		System.out.println(sb.insert(5, " Surname"));

	}

}
