package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base{
	
	/**
	 * we will create a constructor and inside the constructor 
	 * we will use PageFactory Class of Selenium and its method initElements to
	 * initialize the UI Elements in this page
	 */
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	// for locating UI Elements using PageFactory we use @FindBy annotation and then we 
	// store UI Elements in WebElement data type and make it private. 
	// driver.findElement(By.LocatorType) == @FindBy(locatorType = "value")
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement myAccount;
	
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	private WebElement loginOption;
	
	@FindBy(id = "input-email")
	private WebElement emailField;
	
	@FindBy(id="input-password")
	private WebElement passwordField;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[contains(text(),'TEST ENVIRONMENT')]")
	private WebElement homePageLogo;
	
	@FindBy(xpath = "//h2[contains(text(),'My Account')]")
	private WebElement myAccountValidation;
	
	
	public void clickOnMyAccount() {
		myAccount.click();
	}
	
	public void clickonLoginOption() {
		loginOption.click();
	}
	
	public void enterUserNameAndPassword(String emailValue, String passValue) {
		emailField.sendKeys(emailValue);
		passwordField.sendKeys(passValue);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public boolean isTestEnvironmentLogoPresent() {
		if(homePageLogo.isDisplayed())
			return true;
		else 
			return false;
	}
	
	public boolean ismyAccountValidationPresent() {
		if(myAccountValidation.isDisplayed())
			return true;
		else 
			return false;
	}

	//----------
	//NEW SCENARIO
	
 @FindBy(xpath = "//span[text()='Currency']")
 private WebElement clickOnCurrency;
 
 
 @FindBy(xpath = "(//button[@type='button'])[1]")
 private WebElement EuroOption;
 
 @FindBy(xpath = "(//button[@type='button'])[2]")
 private WebElement poundSterling;
 
 @FindBy(xpath = "(//button[@type='button'])[3]")
 private WebElement usDollar;
 
 @FindBy(xpath = "(//button[@type='button'])[1]")
 private WebElement EuroOptionValidation;

 
 
 
 public void clickOnCurrenyButton() {
clickOnCurrency.click();

 }

public void chooseEuro() {
if(!clickOnCurrency.equals("€ Euro")) {
EuroOption.click();}
else if(usDollar.equals("$ US Dollar")) {
	usDollar.click();}else {
		poundSterling.click();


	}
}
public void EuroOption1() {
	EuroOption.isDisplayed();
}


//New Scenario

@FindBy(xpath = "//span[text()='Shopping Cart']")
private WebElement UserClickOnShopingCart;


@FindBy(xpath = "(//p[text()='Your shopping cart is empty!'])[2]")
private WebElement shopinCartMessage;


public void clickOnShopingCart() {
UserClickOnShopingCart.click();

}
public boolean shopingCartMessage() {
if(shopinCartMessage.isDisplayed()) 
return true;
else
return false;
		

}}





    

     
		
	


