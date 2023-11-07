package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practise_NAProtection_Signup {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Kisho\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://protection.qa.tenerityservices.com/secure/login");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//span[text()='Create an account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("protectiontest@mailinator.com");
		driver.findElement(By.xpath("//input[@name='confirmEmail']")).sendKeys("protectiontest@mailinator.com");
		
	}

}
