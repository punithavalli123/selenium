package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser2 {
	ChromeOptions option= new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");

	ChromeDriver driver= new ChromeDriver(option);
driver.get("http://leaftaps.com/opentaps/control/main");
driver.get("http://www.facebook.com/login");

}



}
