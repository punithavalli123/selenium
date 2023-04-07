package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver(option);
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
					driver.manage().window().maximize();
					driver.findElement(By.id("username")).sendKeys("demoSalesManager");
					driver.findElement(By.id("password")).sendKeys("crmsfa");
					driver.findElement(By.className("decorativeSubmit")).click();
					driver.findElement(By.linkText("CRM/SFA")).click();
					driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();					
				 driver.findElement(By.id("createLeadForm_companyName")).sendKeys(" testlead");
				 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("puni");
			   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("tha");
			  driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("mechanical");
				 driver.findElement(By.id("createLeadForm_description")).sendKeys("Automobile");
				 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("thiraitheebam@gmail.com");
				
				WebElement co= driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
				Select cd = new Select(co);
				cd.selectByVisibleText("United States");
				//WebElement st= driver.findElement(By.id("createLeadForm_generalStateGeoId"));
				//Select dp= new Select(st);
				//dp.selectByVisibleText("New York");
				driver.findElement(By.className("smallSubmit")).click();
				String tt =driver.getTitle();
				System.out.println(tt);
				
				//duplicateLead
				driver.findElement(By.linkText("Duplicate Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).clear();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("PP testing");
				driver.findElement(By.id("createLeadForm_firstName")).clear();
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("parthi");
				
				driver.findElement(By.className("sumallSubmit")).click();
				String title = driver.getTitle();
				System.out.println(title);
				
				
						
						
				
				
				
						
				
							
						
						
						
				
					
					
					
		

	}

	private static WebElement sendKeys(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
