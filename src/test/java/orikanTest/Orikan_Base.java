package orikanTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Orikan_Base {
	
	WebDriver driver;
	
	public Orikan_Page orikanobj;
	
	@BeforeTest
	public void setupBrowser() {
		
		driver = new ChromeDriver();
		driver.get("https://orikan-ui-automation-test.azurewebsites.net/");
		driver.manage().window().maximize();
		orikanobj = new Orikan_Page(driver);
	}

	
	@AfterTest
	public void tearDownBrowser() {
		
//		driver.close();
	}

}
