import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_Appium {
	WebDriver driver;
	
	@Test
	
	public void launch_url()
	{
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", driver_path + "\\ChromeDriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
	}

}
