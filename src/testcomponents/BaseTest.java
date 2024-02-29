package testcomponents;

import java.io.FileInputStream;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	public LandingPage landingPage;
	
	public void initializeDriver() 
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream();
		prop.load(fis);
		String browserName =prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		
		else if (browserName.equalIgnoreCase("firefox"))
		{
		else if (browserName.equalsIgnoreCase("edge")) 
		{
			System.setProperty("webdriver.edge.driver", "edge.exe")
	        driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
		
		}
		
		@BeforeMethod
		public void launchApplication() 
		{
			driver = initializeDriver();
			LandingPage landingPage = new landingPage(driver);
			landingPage.goTo();
			return landingPage();
		}
		
		@AfterMethod
		public void tearDown() {
			driver.close();
		}
		
		
	}

}
