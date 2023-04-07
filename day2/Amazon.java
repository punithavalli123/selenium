package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/"); 
		driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@placeholder= 'Search Amazon.in']")).sendKeys("Bags");
Thread.sleep(2000);

driver.findElement(By.xpath("//div[@aria-label ='bags for boys']")).click();
	//String text1= driver.findElement((By.xpath("//span[text()='1-16 of over 80,000 results for']").getText();
	//String text2 = driver.findElement((By.xpath("//span[text()='\"bags for mens\"']").getText();

WebElement totresult =driver.findElement(By.xpath("//span[text()='1-48 of over 50,000 results for']"));
WebElement forboys =driver.findElement(By.xpath("//span[text()= '\"bags for boys\"']"));
System.out.println(totresult.getText()+forboys.getText());

driver.findElement(By.xpath("//1i/span/text()='Safari']")).click();
		driver.findElement(By.xpath("//li/spab[text()='Americal Tourister']")).click();
		driver.findElement(By.xpath("//span[@class= 'a-button-text a- declarative']")).click();
		driver.findElement(By.xpath("//li[@aria-labelledby='s-reslut-sort-select_4']")).click();
		

	WebElement desc= driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal'][1]"));
	WebElement rate = driver.findElement(By.xpath("//div[@class ='a-row a-size-base a -color base'][1]"));
	System.out.println("description of product:" +desc.getText());
	System.out.println("rate od product:" +rate.getText());
System.out.println(driver.getTitle());
driver.close();

			
		


	}

	
}
