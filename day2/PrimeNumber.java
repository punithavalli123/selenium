package week2.day2;

public class PrimeNumber {

	public static void main(String[] args) {
int input =15;
boolean visible = false;
for (int i=2; i<=input/2; i++) {
	if(input%i==0) {
		visible = true;
	} if(visible) {
System.out.println("The given number is" +input+ "is not prime number");
}else {
	
	System.out.println("The given number is" +input+ "is prime number");
}
}
	}
	


	}

