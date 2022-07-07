package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base{

public RetailPageObject() {  
PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//span[text()='My Account']")
private WebElement myAccount;

@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
private WebElement EnvironmentLogo;



@FindBy(id = "input-email")
private WebElement emailInput;

@FindBy(id = "input-password")
private WebElement passwordInput;

@FindBy(xpath ="//input[@value='Login']")
private WebElement loginButton;

@FindBy(xpath = "//a[text()='Login']")
private WebElement login;

@FindBy(xpath = "//h2[text()='My Account']")
private WebElement myAccountText;



public void clickOnMyAccount() {
myAccount.click();
}
public void clickOnLoginButton() {
	loginButton.click();
}

public void enterEmail(String emailValue) {
	emailInput.clear();
	emailInput.sendKeys(emailValue);
}

public void enterPassword(String passwordValue) {
	passwordInput.sendKeys(passwordValue);
}


public void clickOnLogin() {
	login.click();
}

public boolean isEnvironmentLogoPresent() {
if(EnvironmentLogo.isDisplayed())
return true;
else
return false;
}

public boolean myAccountTextIsPresent() {
	if(myAccountText.isDisplayed())
		return true;
	else 
		return false;
}










//Affiliate link scenario

@FindBy(xpath = "//a[text()='Register for an affiliate account']")
private WebElement link;

@FindBy(id = "input-company")
private WebElement companyField;

@FindBy(id = "input-website")
private WebElement websiteField;

@FindBy(id = "input-tax")
private WebElement taxfield;

@FindBy(xpath = "(//label/input[@name='payment'])[1]")
private WebElement chequeOption;

@FindBy(xpath = "(//div[@class='radio'])[2]")
private WebElement paypalOption;

@FindBy(xpath = "//input[@value='bank']")
private WebElement banktransferOption;

@FindBy(id = "input-cheque")
private WebElement payeeOption;

@FindBy(xpath = "//input[@type='checkbox']")
private WebElement checkboxfield;

@FindBy(xpath = "//input[@value='Continue']")
private WebElement continueOption;

@FindBy(xpath = "//body/div[@id='account-account']/div[1]")
private WebElement successMessage;




public void clickOnlink() {
link.click();
}

public void enterCompanyName(String companyValue){
	companyField.clear();
companyField.sendKeys(companyValue);
}

public void enterWebsiteName(String websiteAddress){
websiteField.sendKeys(websiteAddress);
}

public void enterTaxValue(String taxValue){
taxfield.sendKeys(taxValue);
}

public void paymentType(String chequeValue) {
if(chequeValue.trim().equalsIgnoreCase("cheque")) {
chequeOption.click();
}else if(chequeValue.trim().equalsIgnoreCase("PayPal")) { 
paypalOption.click();
}else
banktransferOption.click();
}






public void enterPayeeValue(String payeeValue){
payeeOption.sendKeys(payeeValue);
}
public void enterCheckBoxValue(){
checkboxfield.click();;
}
public void contin() {
continueOption.click();

}




public boolean sucessMessagesho() {
if(successMessage.isDisplayed()) {
return true;
}else
return false;
}










//EDIT AFFILIATE LINK SCENARIO
@FindBy(xpath = "//a[text()='Edit your affiliate information']")
private WebElement editAffiliateLikk;




public void paymentType1(String bankTransferValue) {
if(bankTransferValue.trim().equalsIgnoreCase("Bank Transfer")) {
banktransferOption.click();
}else if(bankTransferValue.trim().equalsIgnoreCase("cheque")) { 
chequeOption.click();
}else
paypalOption.click();
}

@FindBy(id = "input-bank-name")
private WebElement BankName;

@FindBy(id = "input-bank-branch-number")
private WebElement AbaNumber;


@FindBy(id = "input-bank-swift-code")
private WebElement Swiftcode;


@FindBy(id = "input-bank-account-name")
private WebElement accountName;

@FindBy(id = "input-bank-account-number")
private WebElement accountNumber;


public void clickOnlink1() {
editAffiliateLikk.click();
}

public void enterBankName(String BankNameValue) {
BankName.sendKeys(BankNameValue);
}

public void enterAbaNumber(String AbaValue) {
AbaNumber.sendKeys(AbaValue);
}

public void enterSwiftcodeValue(String swiftValue) {
Swiftcode.sendKeys(swiftValue);
}

public void enterAccountName(String accountNameValue) {
accountName.sendKeys(accountNameValue);
}

public void enterAccountNumber(String accountNumberValue) {
accountNumber.sendKeys(accountNumberValue);
}

public void clickOnBankTransfer() {
banktransferOption.click();

}


//Edit your account information

@FindBy(xpath ="//*[@id=\"content\"]/ul[1]/li[1]/a")
private WebElement editAccountInformation;

@FindBy(id = "input-firstname")
private WebElement editFirstName;

@FindBy(id = "input-lastname")
private WebElement editLastName;

@FindBy(id = "input-email")
private WebElement editEmail;

@FindBy(id = "input-telephone")
private WebElement editPhone;

@FindBy(xpath = "//input[@value='Continue']")
private WebElement continueButtonClick;


@FindBy(xpath = "//*[@id='account-account']/div[1]")
private WebElement successMessageEditAccountInfo;



public void clickOnLink2() {
editAccountInformation.click();
}

public void firstNameEdit(String firstName, String lastName, String email, String telephone) {
editFirstName.clear();
editFirstName.sendKeys(firstName);
editLastName.clear();
editLastName.sendKeys(lastName);
editEmail.clear();
editEmail.sendKeys(email);
editPhone.clear();
editPhone.sendKeys(telephone);
}

public void clickOnContinueButton() {
continueButtonClick.click();
}




//public boolean successMessageshown() {
//if(successMessageEditAccountInfo.isDisplayed())
//return true;
//else
//return false;
public boolean isEditAccountInfoSuccessMessagePresent() {
	// String actualSuccessMessage = successMessageEditAccountInfo.getText();
	// String expectedSuccessMessage = " Success: Your account has been successfully
	// updated.";
	// if (actualSuccessMessage.equals(expectedSuccessMessage)) {
	// return true;
	// } else {
	// return false;
	// }
	if (successMessageEditAccountInfo.isDisplayed()) {
		return true;
	} else {
		return false;
	}

}}






