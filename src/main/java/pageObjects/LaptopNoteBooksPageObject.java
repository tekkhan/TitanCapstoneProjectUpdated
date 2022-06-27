package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBooksPageObject extends Base {
	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement clickLaptopsNotebooks;

	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement clickShowAllLaptops;

	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement MacBook;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement AddToCart;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;

	@FindBy(xpath = "//span[text()=' 1 item(s) - $602.00']")
	private WebElement valueInCartOption;

	@FindBy(id = "cart-total")
	private WebElement cartOption;

	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement RedButton;

	@FindBy(xpath = "//span[text()=' 0 item(s) - $0.00']")
	private WebElement zeroValueInOpion;

	public void clickLaptopsNotebooks() {
		clickLaptopsNotebooks.click();
	}

	public void clickShowAllLaptops() {
		clickShowAllLaptops.click();
	}

	public void clickOnMacBookItem() {
		MacBook.click();
	}

	public void AddToCartButton() {
		AddToCart.click();
	}

	public boolean successMessage3() {
		if (successMessage.isDisplayed())
			return true;
		else
			return false;

	}

	public boolean valuesInCart() {
		if (valueInCartOption.isDisplayed())
			return true;
		else
			return false;
	}

	public void cartClick() {
		cartOption.click();
	}

	public void redButtoClick() {
		RedButton.click();
	}

	public boolean cartZero() {
		if (zeroValueInOpion.isDisplayed())
			return true;
		else
			return false;
	}


//---------------------

@FindBy(xpath = "(//button[@type='button'])[14]")
private WebElement comparisonIcon;


@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[3]")
private WebElement MacBookAirIcon;

@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
private WebElement SuccessComparisonMessage;

@FindBy(xpath = "//a[text()='product comparison']")
private WebElement comparisonLink;

@FindBy(xpath = "/html/body/div[2]")
private WebElement chartAprovalText;


public void clickOnComparisonIcon() {
comparisonIcon.click();
}
public void comparisonIconAirBook() {
MacBookAirIcon.click();
}

public boolean comparisonSuccessMessage() {
if(SuccessComparisonMessage.isDisplayed())
return true;
else
return false;

}

public void clickOncomparisonLink() {
comparisonLink.click();


}

//public boolean textForAproval() {
//chartAprovalText.getText();
//if(chartAprovalText.isDisplayed()) 
//return true;
//else
//return false;
//
//}
public void productCompareItem() {
	chartAprovalText.isDisplayed();
}

//NEW SCENARIO
  
@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[2]")
private WebElement clickOnHeart;

@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
private WebElement messageAboutcreateAccount;

public void heartNeedToClick() {
clickOnHeart.click();
}

public boolean message() {
if(messageAboutcreateAccount.isDisplayed()){
return true;
}else
return false;

}

//New Scenario laptop3



@FindBy(xpath = "//a[text()='MacBook Pro']")
private WebElement ClickOnMacBook;

@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/ul[2]/li[1]/h2")
private WebElement priceOfMacBook;


public void clickOnProMacBook() {
ClickOnMacBook.click();
}

public boolean priceOfProMacBook() {
if(priceOfMacBook.isDisplayed()) 
return true;
else
return false;

}
}







