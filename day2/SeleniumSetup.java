package week2.day2;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
public class SeleniumSetup {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperties("webdriver.chrome.driver");
		WebDriverManager.ChromeDriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver= new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/contorl/main");
		

	}
 
}
