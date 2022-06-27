package stepDef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.DesktopPageObject;
import utilities.WebDriverUtility;

public class DesktopPageStepDefinition extends Base{


		DesktopPageObject desktop= new  DesktopPageObject();
			
		
		
		@When("User click on Desktops tab")
		public void user_click_on_desktops_tab() {
		desktop.moveToDesktopOption();
		logger.info("User move to Desktop Option");
		
		}
		
		@When("User click on show all desktops")
		public void user_click_on_show_all_desktops() {
		desktop.clickonshowDesktopOption();
		logger.info("User clicked on Show all desktop option");
		   
		}
		
		
		@Then("User should see all items are present in Desktop page")
		public void user_should_see_all_items_are_present_in_desktop_page() {
		List<WebElement> desktopsElements = desktop.isDesktopItemsPresent();
		for(WebElement element:desktopsElements ) {
		Assert.assertTrue(element.isDisplayed());
		logger.info(element.getAttribute("title")+ "is present");
		WebDriverUtility.takeScreenShot();
	
		}}
		
		
		
	
	
    //ADD HP LP 3065 SCENARIO
	@When("User click ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
	desktop.AddToCartOption();
	logger.info("user clicked on Add to cart optoin");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	@When("User click quantity {string}")
	public void user_click_quantity(String quantity) {
	desktop.selectquantity(quantity);
	logger.info("user selected 1");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	@And("User click add to Cart button")
	public void user_click_add_to_cart_button() {
	desktop.AddCartButton();
	logger.info("user clicked on Add to cart Button");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
	desktop.seeSuccessMessage();
	logger.info("user saw a success message");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}


	
	
//ADD EOS 5D CAMERA TO CART SCENARIO	

@When("User click ADD TO CART option on Canon EOS 5D item")
public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
desktop.AddCameraToCart();
logger.info("user clicked on add to cart");
WebDriverUtility.takeScreenShot();
}
@And("User select color from dropdown Red")
public void user_select_color_from_dropdown_red() {
desktop.chooseColor();
logger.info("user clicked on color");
WebDriverUtility.takeScreenShot();
}
@And("User select quantity {int}")
public void user_select_quantity(Integer int1) {
WebDriverUtility.takeScreenShot();

}
//@And("User click add to Cart button")
// public void user_click_add_to_cart1_button() {
// desktop.AddCartButton();
// logger.info("user clicked on cart Button");
//}


   

@When("User click on Canon EOS 5D item")
public void user_click_on_canon_eos_5d_item() {
desktop.clickOnCamera();
logger.info("user clicked on EOS Camera");
WebDriverUtility.takeScreenShot();
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
@And("User click on write a review link")
public void user_click_on_write_a_review_link() {
desktop.selectviewLink();
logger.info("user clicked on view link");
WebDriverUtility.takeScreenShot();
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


}
@And("User fill the review information with below information")
public void user_fill_teh_review_information_with_below_information(DataTable dataTable) {
 List<Map<String,String>> reviewInformation = dataTable.asMaps(String.class,String.class);
 desktop.NameField(reviewInformation.get(0).get("yourName"));
 desktop.reviewField(reviewInformation.get(0).get("yourReview"));
 desktop.selectRatingOption(reviewInformation.get(0).get("Rating"));
 logger.info("user selected the rating");
 WebDriverUtility.takeScreenShot();
 try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}}

@And("User click on continiue button")
public void user_click_on_continue_button1(){
desktop.pleaseClickContinue();
logger.info("user clicked on continue button");
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}}


@Then("User should see a message with {string}")
public void user_should_see_a_message_with(String messs) {
    desktop.showsuccessMessage5d();
    logger.info("User saw succes message");
    try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


	


}





	



















