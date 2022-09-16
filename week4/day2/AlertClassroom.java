package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertClassroom {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		//Click the button under Prompt Dialog
		driver.findElement(By.xpath("(//button[@name='j_idt88:j_idt104']//span)[2]")).click();
		
		//Handle the Alert either accept or Dismiss
		Alert alert = driver.switchTo().alert();
		
		//Hint: Before accept/dismiss use senkeys to the alertbox
	
		alert.sendKeys("priya mathiyalagan");
		alert.accept();
	    System.out.println(driver.findElement(By.id("confirm_result")).getText());
	    
		
	    
		
		//Verify it
	}

}
