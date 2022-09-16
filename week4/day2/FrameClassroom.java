package week4.day2;

import java.time.Duration;
//import java.util.List;

import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameClassroom {

	

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("//www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
			
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		
		/*3_ Click TryIt 
		4_ Click Cancel/ on the alert
		5_ Print the resulting text
		 Hint:
		-----
		Switch to the frame
		Then click Try It with xpath
		Switch to the alert
		Then perform accept / dismiss
		Get the text using id 
		Verify the text based on the action*/

	}

}
