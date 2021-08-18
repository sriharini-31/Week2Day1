package Week2Day1Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Facebook {
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver(); 
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.findElement(By.linkText("Create New Account")).click();
	driver.findElement(By.name("firstname")).sendKeys("Sri");
	driver.findElement(By.name("lastname")).sendKeys("Harini");
	driver.findElement(By.name("reg_email__")).sendKeys("8778232557");
	driver.findElement(By.name("reg_passwd__")).sendKeys("hari@gmail.com");

	WebElement drop1= driver.findElement(By.name("birthday_day"));
	Select drpdwn1 = new Select(drop1);
	drpdwn1.selectByValue("31");
	
	WebElement drop2= driver.findElement(By.name("birthday_month"));
	Select drpdwn2 = new Select(drop2);
	drpdwn2.selectByVisibleText("Mar");
	
    WebElement drop3 = driver.findElement(By.name("birthday_year"));
	Select drpdwn3 = new Select(drop3);
	drpdwn3.selectByVisibleText("1999");
	
	driver.findElement(By.name("sex")).click();

}
}
