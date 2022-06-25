package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class DesktopPageObject extends Base {

	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	// Background Scenario
	
	@FindBy(xpath="//a[text()='Desktops']")
	private WebElement DesktopsOption;
	
	
	@FindBy(xpath="//a[text()='Show All Desktops']")
	private WebElement showDesktopOption;
	
	
	public void moveToDesktopOption() {
	WebDriverUtility.moveToEl(DesktopsOption);	
	}
	
	
	public void clickonshowDesktopOption() {
		showDesktopOption.click();
	}
	//-------------------------------------------------
	
	// desktopPagetab1 first scenario
	
	@FindBy(tagName="img")
	private List<WebElement> desktopItems;
	
	
	public List<WebElement> isDesktopItemsPresent() {
		List<WebElement>  deskItems = desktopItems;
		return deskItems;
   //-------------------------------------------------
  	}
	
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement AddTOCart;
	
	@FindBy(id = "input-quantity")
	private WebElement quantityOption;
	
	@FindBy(id = "button-cart")
	private WebElement AddButton;
	
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement CartSuccessMessage;
	
	
	public void AddToCartOption() {
	AddTOCart.click();
	
	}
	public void selectquantity(String quantyValue) {
	quantityOption.sendKeys(quantyValue);
	}
	public void AddCartButton() {
    AddButton.click();
	}
    
	public boolean seeSuccessMessage() {
	if(CartSuccessMessage.isDisplayed())
	return true;
	else
	return false;
	}
	
	}


//Add Canon EOS 5D
//@FindBy(xpath = "(//span[text()='Add to Cart'])[4]")
//private WebElement CameraAddToCart;

//@FindBy(id = "input-option226")





