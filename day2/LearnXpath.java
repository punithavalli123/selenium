package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnXpath {

	public static void main(String[] args) {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
	
		ChromeDriver driver= new ChromeDriver(option);
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
driver.findElement(By.xpath("//input [@id ='password']")).sendKeys("crmsfa");
//driver.findElement(By.xpath("//input[@id='password']")).sendKeys.("crmsfa");

driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
driver.findElement(By.xpath("//a[text()='Lead']")).click();

}

}