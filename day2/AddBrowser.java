package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddBrowser {

	public static void main(String[]args) {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
	
		ChromeDriver driver= new ChromeDriver(option);
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
//driver.get("http://facebook.com/login");
//driver.fineElement(by.id("username"));
 WebElement username = driver.findElement(By.id("username"));
 username.sendKeys("demoSalesManager");
 WebElement password = driver.findElement(By.id("password"));
 password.sendKeys("crmsfa");
 driver.findElement(By.className("decorativeSubmit")).click();
 String title =driver.getTitle();
 System.out.println(title);
 driver.findElement(By.linkText("CRM/SFA")).click();
 driver.findElement(By.linkText("Leads")).click();
 String str= driver.getTitle();
 System.out.println(str);

	}

}
