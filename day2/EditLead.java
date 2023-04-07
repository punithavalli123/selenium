package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub




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
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("punitha");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");			
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("puni");
	driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("valli");
	driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning Automation");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("punithaparthipan@gmail.com");
	//driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	WebElement cou= driver.findElement(By.id("createLeadForm_generalCountryGeoId"));//createLeadForm_generalstateProvinceGeold"));
					Select st = new Select(cou);
	st.selectByVisibleText("United States");
	Thread.sleep(3000);
	driver.findElement(By.className("smallSubmit")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.name("UpdateLeadForm_companyName")).sendKeys("Testlead");
	driver.findElement(By.name("UpdateLeadForm_importantNote")).sendKeys("edit successfully");
	//driver.findElement(By.xpath("//input[@name='submitbutton']")).click();
	//Thread.sleep(3000);	
	driver.findElement(By.className("smallSubmit")).click();
	String Title = driver.getTitle();
			System.out.println(Title);
		
			//driver.close();
		}
	}			
	