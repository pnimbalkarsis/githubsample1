package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorID {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Kisho\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://protection.qa.tenerityservices.com/secure/login");
		Thread.sleep(30000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("protectionqa1017@mailinator.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password1@");
		driver.findElement(By.cssSelector("button[class*='MuiButtonBase-root MuiButton-root']")).click();
	}
	}

