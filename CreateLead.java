package Week2Day1Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement webuser = driver.findElement(By.id("username"));
		webuser.sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// 3. Click on Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		// 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// 5. Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sri");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Harini");
		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("4");

		driver.findElement(By.className("smallSubmit")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String title1 = "View Lead | opentaps CRM ";
		String title2 = driver.getTitle();

		if (title1.equals(title2)) {
			System.out.println("In View Page");

		} else {
			System.out.println("Not in View Page");

		}
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("FirstName" + firstName);

	}

}
