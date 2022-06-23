package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopPageObject extends Base {

 public DesktopPageObject() {
	PageFactory.initElements(driver, this);
 
}
@FindBy(xpath = "//a[text()='Desktops']")
private WebElement desktops;

@FindBy(xpath = "//a[text()='Show All Desktops']")
private WebElement showAllDesktop;


}
