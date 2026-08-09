package Interface;
interface Payment
{
	void ProcessPayment(double amount);
		
}

class CreditCardPayment implements Payment
{
	
	public void ProcessPayment(double amount) {
		System.out.println("Processing credit card payment of ₹" + amount);	
	} 
	
}

class PayPalPayment implements Payment
{
	public void ProcessPayment(double amount)
	{
		System.out.println("Processing PayPal Payment of ₹"+amount);
	}
}
public class PaymentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p1=new CreditCardPayment();
		Payment p2=new PayPalPayment();
		
		p1.ProcessPayment(300);
		p2.ProcessPayment(8000);

	}

}
