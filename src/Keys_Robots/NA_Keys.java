package Keys_Robots;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class NA_Keys {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Kisho\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://protection.qa.tenerityservices.com/secure/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("protectionqa1007@mailinator.com",Keys.TAB,"Password@1",Keys.ENTER);
		
	}

}
