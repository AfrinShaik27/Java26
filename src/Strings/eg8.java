package Strings;

public class eg8 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb =new StringBuffer("Afrin");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb);
		System.out.println(sb.append(" Shaik"));
		System.out.println(sb.deleteCharAt(3));
		System.out.println(sb.reverse());
		sb.ensureCapacity(50);
		System.out.println(sb.capacity());

	}

}
