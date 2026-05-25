package ElementsTypesOfMethods;

public class ICICI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ICICI().display();

	}
	public static void bankname(String bankName,String ifscCode)
	{
		System.out.println("Bank Name: "+bankName);
		System.out.println("Bank IFSCcode: "+ifscCode);
	}
	
	public void customername(String customerfirstname, String customerlastname,String customeremail,long phonenumber) {
		System.out.println("CustomerFirstName: "+customerfirstname);
		System.out.println("CustomerLasttName: "+customerlastname);
		System.out.println("CustomerEmail: "+customeremail);
		System.out.println("CustomerPhoneNumber: "+phonenumber);
		System.out.println("_______________________");
	}
	public void display()
	{
		bankname("ICICI","ICIC201201");
		customername("Afrin","Shaik","shaikafrin750@gmail.com",7013491025l);
		
		bankname("ICICI","ICIC201201");
		customername("Sajida","Shaik","shaiksajida175@gmail.com",8919491025l);
		
		bankname("ICICI","ICIC201201");
		customername("Ruffiya","Shaik","shaikruffiya014@gmail.com",9783491025l);
		
		bankname("ICICI","ICIC201201");
		customername("Hazeera","Shaik","shaikhazeera012@gmail.com",956691025l);
		
		bankname("ICICI","ICIC201201");
		customername("Ramya","Pitta","pittaramya2112@gmail.com",8986491025l);
		
		bankname("ICICI","ICIC201201");
		customername("Sathwika","Poturu","poturusathwika178@gmail.com",7021491025l);
	}
	
	

}
