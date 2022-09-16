package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertandWindowHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
        driver.get("//www.irctc.co.in/");
        Alert alert = driver.switchTo().alert();
        alert.accept();
        
        
        
        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);
        String Ptitle = driver.getTitle();    
        System.out.println(Ptitle);
        driver.findElement(By.linkText("FLIGHTS")).click();;
        //get the address of the all opened windows
        Set<String> windowHandles = driver.getWindowHandles();
        
        
        /*int size = windowHandles.size();
        System.out.println(size);
        
        for(String wh:windowHandles) {
          System.out.println(wh);                
        }*/
    //    convert set to list
        List<String> switchTOWindow=new ArrayList<String>(windowHandles);
        //switch to the required child window
        driver.switchTo().window(switchTOWindow.get(1));
        String title = driver.getTitle();    
        System.out.println(title);
        driver.findElement(By.xpath("//div[@class='Nav-icons Flights']")).click();
        driver.close();
	}

	
	
/*Load https://www.irctc.co.in/
2. Click on OK button in the dialog  
3. Click on FLIGHTS link            
4. Go to the Flights tab
5. Print title of the child window and close the window
6. close all windows*/
}

