package AssignmentLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipkart_Searchmobile {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Kisho\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[class='_30XB9F']")).click();
		driver.findElement(By.xpath("//input[@placeholder= 'Search for Products, Brands and More']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder= 'Search for Products, Brands and More']")).sendKeys("Mobile under 20000");
		driver.findElement(By.cssSelector("button[class='_2iLD__']")).click();								
		
	}

}
