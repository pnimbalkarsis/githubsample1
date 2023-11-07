package Keys_Robots;

import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Cyber {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Kisho\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://uk-cyberprotection.stage-affinionservices.com/login");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("stageusercduk244@mailinator.com",Keys.TAB,"Password1@",Keys.ENTER);
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(5000);
		driver.findElement(By.id("rulai-widget-launch-icon-greeting-close")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button)[3]")).click();
		
	}

}
