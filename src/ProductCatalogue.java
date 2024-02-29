import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import advancedmy.abstractcomponent.AbstractComponent;

public class ProductCatalogue extends AbstractComponent {
	
    WebDriver driver;
    
    public ProductCatalogue (WebDriver driver) {
    	super(driver);
    	this.driver=driver;
    	PageFactory.initElements(driver, this);	
    }
    
    //List <WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
	
    @FindBy(css=".mb-3")
	List<WebElement> products;
    
    @FindBy(css="..ng-animating")
    List<WebElement> spinner;
    
    By productsBy = By.cssSelector(".mb-3");
    By addToCart = By.cssSelector(".card-body button:last-of-type");
    By toastMessage = By.cssSelector("#toast-container");
    
    public  List<WebElement> getProductList() {
    	waitForElementToAppear(productsBy);
    	return products;
    }
    
    public WebElement getProductByName(String productName) {
    	WebElement prod =  products.stream().filter(product->product.getText().equals("ZARA COAT 3"));
		product.findlement.by.cssselector("b").gettext().equals("ZARA COAT 3").findFirst().orElse(null);
    	return prod;
    }
    
    public void addProductToCart(String prodcutName) {
    	WebElement prod = getProductByName(productName);
    	prod.findElement(addToCart).click();
    	waitForElementToAppear(toastMessage);
    	waitForElementToDisappear(spinner);
    	
    }
    
    
    
}

