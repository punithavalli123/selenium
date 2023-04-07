package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {

	private static final String Duration = null;

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	
	//driver.findElement(By.xpath("//input[@id='src']").sendKeys("chennai");
	
//	driver.findElement(By.xpath("//input[@id='dest']).sendKeys("Bangalore");
	//driver.findElement(By.id("src")).sendKeys("chennai");
	//driver.findElement(By.className("selected")).click();
	//driver.findElement(By.id("dest")).sendKeys("Bangalore");
	//driver.findElement(By.className("selected")).click();
	//driver.findElement(By.xpath("//td[text()='6']")).click();
	//driver.findElement(By.id("search_btn")).click();
	//System.out.println(driver.findElement(By.xpath("span[@class=f-bold busFound")).getText());
	//driver.findElement(By.xpath("//label[@title= SLEEPER']")).click();
	//System.out.print(driver.findElement(By.xpath("//div[text()='Dhanalakshmi']")).getText());
	//System.out.print(driver.getTitle());
	driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
	driver.findElement(By.xpath("//input [@id='dest']")).sendKeys("Bangalore");
	//driver.findElement(By.xpath("//input[@id='password']")).sendKeys.("crmsfa");

	//driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	//driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
	//driver.findElement(By.xpath("//a[text()='Lead']")).click();

	
	
	

	}

}
