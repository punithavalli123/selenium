package week3.day1;

public class SBI implements RBI,loan {
	
	// error occur SBI
	// so we add unimplemet  right click SBI 

	public void withDraw() {
System.out.println(" withdraw 10 laksh");		
	}

	public void kycdocument() {
		// TODO Auto-generated method stub
		System.out.println("Pay slip");
		
	}
public static void main(String[]args)
{
	SBI bank = new SBI();
	bank.kycdocument();
	bank.withDraw();
	bank.securityDoc();
}

public void securityDoc() {
	System.out.println("EC clearance");
	
	
}
}
