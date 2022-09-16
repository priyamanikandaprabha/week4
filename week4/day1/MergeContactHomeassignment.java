package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContactHomeassignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		//4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//5. Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		//6. Click on Merge Contacts using Xpath Locator
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		
		
		
		
		
		//7. Click on Widget of From Contact
		Select FromContact = new Select(driver.findElement(By.xpath("//span[@class='requiredField']")));
		//8. Click on First Resulting Contact
		FromContact.selectByIndex(1);
		//9. Click on Widget of To Contact
		Select ToContact = new Select(driver.findElement(By.xpath("//input[@id='ComboBox_partyIdTo']")));
		//10. Click on Second Resulting Contact
		ToContact.selectByIndex(1);
		// 11. Click on Merge button using Xpath Locator
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		//12. Accept the Alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//13. Verify the title of the page
		String title = driver.getTitle();    
        System.out.println(title);
        Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		

	}

}
