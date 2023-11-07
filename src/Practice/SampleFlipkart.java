package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SampleFlipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Kisho\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
	}

}
