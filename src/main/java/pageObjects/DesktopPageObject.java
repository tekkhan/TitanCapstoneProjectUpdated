package pageObjects;
import java.util.List;

<<<<<<< HEAD
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
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
		quantityOption.clear();
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
	
	


//Add Canon EOS 5D


@FindBy(xpath = "/html/body/div[2]/div/div/div[4]/div[2]/div/div[2]/div[2]/button[1]")
private WebElement CanonCamera;

@FindBy(id = "input-option226")
private WebElement colorOption;

@FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/select/option[2]")
private WebElement redColor;

@FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/select/option[3]")
private WebElement blueColor;

@FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/select/option[4]")
private WebElement greenColor;



@FindBy(id = "button-cart")
private WebElement AddToCart;

@FindBy(xpath = "//*[@id=\"product-product\"]/div[1]")
private WebElement goodSuccessMessage;



public void AddCameraToCart() {
CanonCamera.click();
}

public void chooseColor() {
if(colorOption!=redColor) {
redColor.click();
}else 
greenColor.click();
}

public void cartButton() {
AddToCart.click();
}
public boolean goodMessage() {
if(goodSuccessMessage.isDisplayed()){
return true;
}else
return false;

=======
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class DesktopPageObject extends Base {
	public DesktopPageObject() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "(//a[@class='dropdown-toggle'])[2]")
	private WebElement DesktopOption;
	
	
	@FindBy(xpath =  "//a[text()='Show All Desktops']")
	private  WebElement showAllDesktopsOption;
	

	@FindBy(tagName = "img")
	private List<WebElement> info;
	
	
	
	
	


public void ClickOnDesktop() {
DesktopOption.click();
 }
 
public void clickOnShowAllDesktops() {
showAllDesktopsOption.click();
}

public List<WebElement> desktopsItem(){
List<WebElement> infor = info;
return infor;
>>>>>>> 7ab974ba53bdf9b80eb00e43804297bc00ce03ba

}


<<<<<<< HEAD
//ADD REVIEW TO CANON SCENARIO

@FindBy(xpath = "//img[@title='Canon EOS 5D Camera']")
private WebElement EOSCanonCamera;


@FindBy(xpath = "//a[text()='Write a review']")
private WebElement reviewLink;


@FindBy(id = "input-name")
private WebElement yourName;

@FindBy(id = "input-review")
private WebElement yourRiview;

@FindBy(xpath = "//input[@type='radio']")
private List<WebElement> RatingButton;

@FindBy(id = "button-review")
private WebElement continueButtonClick;

@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
private WebElement successMessage5d;


public void clickOnCamera() {
EOSCanonCamera.click();
}

public void selectviewLink() {
reviewLink.click();
}
public void NameField(String NameValue) {
yourName.sendKeys(NameValue);
}
public void reviewField(String reviewValue) {
yourRiview.sendKeys(reviewValue); 
}

public void selectRatingOption(String RatingValue) {
List<WebElement> ratingOptoin= RatingButton;
for(WebElement element:ratingOptoin) {
	if(element.getAttribute("value").equalsIgnoreCase(RatingValue.trim())){
	element.click();
	break;
}}}


public void pleaseClickContinue() {
continueButtonClick.click();
}
public boolean showsuccessMessage5d() {
    if(successMessage5d.isDisplayed())
        return true;
    else
        return false;
}
=======

>>>>>>> 7ab974ba53bdf9b80eb00e43804297bc00ce03ba
}







<<<<<<< HEAD

=======
>>>>>>> 7ab974ba53bdf9b80eb00e43804297bc00ce03ba
