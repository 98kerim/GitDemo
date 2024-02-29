package stepdefinition;

import java.util.List;

import org.openqa.selenium.WebElement;

import AdvanceLocator.pageobjectmodel;

public class stepDefinitionImpl extends pageobjectmodel {
	
	public LandingPage landingpage:
	public 	ProductCatalogue productCatalogue;
	@Given ("I landed on Ecommerce Page")
	public void I_landed_on_Ecommerce_Page() 
	{
		landingPage = launchApplication();
	}
	
	Given Logged in with username rahulshetty@gmail.com and password Iamking@000
	@Given ("^Logged in with username (.+) and password (.+)$")
	public void logged_in_username_and_password(String username, String password	)
	{
		productCatalogue = landingPage.loginApplication(username,password);
		
	}
	
    @When ("^I add product (.+) to Cart$")
    public void i_add_product_to_cart(String productName) throws InterruptedException 
    {
    	List<WebElement> products =  productCatalogue.getProductList();
		productCatalogue.addProductToCart(productName);
    	
    }
    
    @When ("^Checkout (.+) and submit the order$")
    public void checkout_submit_order(String productName) 
    {
    	CartPage cartPage = productCatalogue.goToCartPage();
    	Boolean match = cartProducts.stream().anyMatch(cartProduct->cartProduct.getText().equalsIgnoreCase(productName))
    	Assert.assertTRUE(match);
    }
    
    @Then ("^(.+) message is displayed on ConfirmationPage$")
    public void message_is_displayed_on_cofirmationPage(String string) 
    {
    	
    }
     
    
    

	


}
