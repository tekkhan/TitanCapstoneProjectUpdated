package stepDef;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObject;
import pageObjects.RetailPageObject;

public class RetailStepDefinition extends Base{

RetailPageObject retail =  new RetailPageObject();


@Given("Given User is on Retail website ")
public void user_is_on_retail_website() {
Assert.assertTrue(retail.isEnvironmentLogoPresent());
logger.info("Evironment logo is present");

try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}}

@Given("User click  on MyAccount")
public void user_click_on_my_account() {
retail.clickOnMyAccount();
logger.info("user clicked on my account");
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();



}
}


@And("User click on Login")
public void user_click_on_login() throws InterruptedException {
retail.clickOnLogin();
logger.info("user clicked on login option");
Thread.sleep(2000);
}


@When("User enter userName {string} and password  {string}")
public void user_enter_user_name_and_password(String string, String string2) {
	retail.enterEmail(string);
	logger.info("user enter the userName " + string);
	retail.enterPassword(string2);
	logger.info("user enter the password  " +string2);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}


@And("User click on Login button")
public void user_click_on_login_button() throws InterruptedException {
retail.clickOnLoginButton();
logger.info("user clicked on loginButton");
Thread.sleep(2000);
}


@Then("User should be logged in to MyAccount dashboard")
public void user_should_be_logged_in_to_my_account_dashboard() throws InterruptedException {
Assert.assertTrue(retail.myAccountTextIsPresent());
logger.info("my account is present");
Thread.sleep(2000);
}





//affiliate scenario
@When("User click on {string} link")
public void user_click_on_link(String affiliateLink) throws InterruptedException {
retail.clickOnlink();
logger.info("user clicked on affiliate link");
Thread.sleep(2000);
}




@And("User will fill Affiliate form with below information")
public void user_fill_affiliate_form_with_below_information_company_website_tax_id_payment_method(DataTable dataTable) throws InterruptedException {
List<Map<String,String>> info =dataTable.asMaps(String.class,String.class);
retail.enterCompanyName(info.get(0).get("company"));
retail.enterWebsiteName(info.get(0).get("website"));
retail.enterTaxValue(info.get(0).get("taxID"));
retail.paymentType(info.get(0).get("paymentMethod"));
retail.enterPayeeValue(info.get(0).get("payee Name"));
logger.info("user filled the information");
Thread.sleep(2000);


}




@And("User should check on about us check box")
public void user_should_check_on_about_us_check_box() throws InterruptedException {
retail.enterCheckBoxValue();
logger.info("user clicked on check box");
Thread.sleep(2000);
}




@When("User click on Continiue button")
public void user_click_on_continiue_button() throws InterruptedException {
retail.contin();
logger.info("user clicked on continue button");
Thread.sleep(2000);
}





@Then("User should see a success message")
public void user_should_see_a_success_message() throws InterruptedException {
retail.sucessMessagesho();
logger.info("user saw success message");
Thread.sleep(2000);
}



@When("User click on {string} links")
public void user_click_on_link1(String editaffiliatelink) {
retail.clickOnlink1();
logger.info("user clicked on edit affiliate link");
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}

@And("User click on Bank Transfer radio button")
public void user_click_on_bank_transfar_radio_button() {
retail.clickOnBankTransfer();
logger.info("user clicked on BankTransfer option");
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}




@And("User fill Bank information with below information")
public void user_fill_bank_information_with_below_information_bankName_abaNumber_swiftcode_accountName_accountNumber(DataTable dataTable) {
List<Map<String,String>>detail= dataTable.asMaps(String.class,String.class);
retail.enterBankName(detail.get(0).get("bankName"));
retail.enterAbaNumber(detail.get(0).get("abaNumber"));
retail.enterSwiftcodeValue(detail.get(0).get("swiftCode"));
retail.enterAccountName(detail.get(0).get("accountName"));
retail.enterAccountNumber(detail.get(0).get("accountNumber"));
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}






@And("User modify below information")
public void user_modify_below_information() {
}

@Then("User should see a message 'Success:Your account has been successfully updated'")
public void user_should_see_a_message_success_account_has_been_successfully_updated() {

	
	
	
	
	
	
	
}

}







