package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BookMyshow {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		//driver.get("https://www.amazon.in/"); 
		
		driver.get("http://in.bookmyshow.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@[placeholder= 'Search for movie']")).sendKeys("movie name");
		
}
