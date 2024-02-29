package AdvanceLocator;
>ackage automationtesting.mavenproject;div[aria-label='Incorrect email or password.']        //div[aria-label='Incorrect email or password.']

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestComponenes.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ErrorValidations1 extends BaseTest {

	@Test
	public void submitOrder()
	{
		
		String productName = "ZARA COAT 3";
        ProductCatalogue productCatalogue = landingPage.loginApplication("kerim@gmail.com","12345");
        Assert.assertEquals("Incorrect email or password",landingPage.getErrorMessage());
       
     @Test
     public void ProductErrorValidation() 
     {
    	 String productName = "ZARA COAT 3";
    	 
    	 
     }
     
	}

}
