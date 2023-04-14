package week3.day1;

public class Automation extends MultipleLanguage implements Language, TestTool
{

	public static void main(String[] args) {
		// TODO Auto-ted method stub
 
 Automation aa = new Automation();
 aa.java();
 aa.Ruby();
 aa.Selenium();
 
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenuim Automation Testing");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Java Language ");
		
	}

	@Override
	public void Ruby() {
		// TODO Auto-generated method stub
		System.out.println(" Ruby Language");
	}

}
