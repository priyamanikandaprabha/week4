package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebtable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='form:j_idt89:globalFilter']")).sendKeys("india");
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//tr[@class='ui-widget-content ui-datatable-odd ui-datatable-selectable ui-state-highlight']/tbody/tr[2]")).getText();
		String text2 = driver.findElement(By.xpath("//td[@class='role=\"gridcell\"']//tr[2]/td[3]//a")).getText();
		System.out.println(text);
		System.out.println(text2);
	}

}
