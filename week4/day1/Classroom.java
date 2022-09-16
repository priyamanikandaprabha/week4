package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Classroom {

	

	public static void main(String[] args) {
		
		
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.leafground.com/table.xhtml");
			driver.manage().window().maximize();
        driver.get("https://erail.in/");
        driver.manage().window().maximize();
        
        WebElement from = driver.findElement(By.id("txtStationFrom"));
        from.clear();
        from.sendKeys("MAS",Keys.ENTER);
        WebElement To = driver.findElement(By.id("txtStationTo"));
        To.clear();
        To.sendKeys("MDU",Keys.ENTER);
        driver.findElement(By.id("chkSelectDateOnly")).click();
        //identified the table
        driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']"));
        
        List<WebElement> rowCount = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
        int rsize = rowCount.size();
        
        System.out.println("Train Names");
        for(int i=1;i<=rsize;i++) {
            String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]")).getText();
            System.out.println(text);
        }

}
}

