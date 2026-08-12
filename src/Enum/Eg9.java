package Enum;

enum HighestQualification
{
	BTECH,BE,BCOM,MTECH,ME,MCOM,MCA,MBA,MASTERS;
}
public class Eg9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HighestQualification hq [] =HighestQualification.values();
		for(HighestQualification h:hq)
		{
			System.out.println(h);
		}

//		String degree="MBA";
		
		HighestQualification h=HighestQualification.valueOf("MBA");
		
		System.out.println(h);
		
		System.out.println(h.ordinal());
		
		
	}

}
