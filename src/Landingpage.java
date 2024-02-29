import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import advancedmy.abstractcomponent.AbstractComponent;

public class Landingpage extends AbstractComponent {
	
    WebDriver driver;
    
    public Landingpage (WebDriver driver) {
    	super(driver);
    	this.driver=driver;
    	PageFactory.initElements(driver, this);	
    }
    
	//WebElement userEmail = driver.findElement(By.id("userEmail"));
	
    @FindBy(id="userEmail")
	WebElement userEmail;
    
    @FindBy(id="userPassword")
    WebElement passwordEle;
    
    @FindBy(id="login")
    WebElement submit;
    
    @FindBy(css="[class*='flyInOut']")
    WebElement errorMessage;
    
    public void loginApplocation(String email,String password) {
    	userEmail.sendKeys(email);
    	passwordEle.sendKeys(password);
    	submit.click();
    	
    	
    }
    driver.
    
    public void getErrorMessage() 
    {
    	waitForWebElementToAppear(errorMessage);
    	errorMessage.getText();
    }
    
    public void goTo() {
    	driver.get("rahul");
    }
   
			
}