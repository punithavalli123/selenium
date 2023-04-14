package week3.day1;

public class Samsung extends AntroidTV implements Antroid
{

		
		public void watchVideo()
		{
			System.out.println("Play Movie");
			
		}

		public void openApp() {
			System.out.println("Open app");
		}
public static void main(String[]args)
{
Samsung s= new Samsung();
s.watchVideo();
s.openApp();
s.myApp();

}
}
