package AssignmentLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_create_account {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Kisho\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@aria-label=\"New password\"]")).sendKeys("Tester");
		WebElement day=driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
		Thread.sleep(2000);
		Select s = new Select(day);
		s.selectByVisibleText("14");
		Thread.sleep(2000);
		WebElement month=driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
		Select s1=new Select(month);
		s1.selectByVisibleText("Feb");
		Thread.sleep(2000);
		 WebElement year =driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
		 Select s2= new Select(year);
		 s2.selectByVisibleText("1994");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//label[text()=\"Female\"]")).click();
		 driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();

		
	}


}
