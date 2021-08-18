package Week2Day1Assignment;

// import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.name("UserFirstName")).sendKeys("Sri");
		driver.findElement(By.name("UserLastName")).sendKeys("Harini");
		driver.findElement(By.name("UserEmail")).sendKeys("Hari@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		driver.findElement(By.name("UserPhone")).sendKeys("8778232557");

		WebElement drop = driver.findElement(By.name("UserTitle"));
		Select DrpDwn = new Select(drop);
		DrpDwn.selectByIndex(9);

		WebElement drop1 = driver.findElement(By.name("CompanyEmployees"));
		Select empdrp = new Select(drop1);
		empdrp.selectByIndex(2);

		WebElement drop3 = driver.findElement(By.name("CompanyCountry"));
		Select cmpdrp = new Select(drop3);
		cmpdrp.selectByValue("India");
		
		driver.findElement(By.className("checkbox-ui")).click();

		driver.close();

		

	}

}
