package pageObjects;
import java.util.List;

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

}



}







