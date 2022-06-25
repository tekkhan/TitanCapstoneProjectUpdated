package stepDef;

import java.util.List;

import org.openqa.selenium.WebElement;

import core.Base;
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
		
		
		
	
	
    //ADd HP LP 3065 SCENARIO
	@When("User click ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
	desktop.AddToCartOption();
	logger.info("user clicked on Add to cart optoin");
	}
	@When("User click quantity {string}")
	public void user_click_quantity(String quantity) {
	desktop.selectquantity(quantity);
	logger.info("user selected 1");
	}
	@And("User click add to Cart button")
	public void user_click_add_to_cart_button() {
	desktop.AddCartButton();
	logger.info("user clicked on Add to cart Button");
	}
	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
	desktop.seeSuccessMessage();
	logger.info("user saw a success message");
	}



@When("User click ADD TO CART option on Canon EOS 5D item")
public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
   
}
@When("User select color from dropdown Red")
public void user_select_color_from_dropdown_red() {
  
}
@When("User select quantity {int}")
public void user_select_quantity(Integer int1) {
   
}


@When("user click on show all deskttops")
public void user_click_on_show_all_deskttops() {
   
}
@When("User click on Canon EOS 5D item")
public void user_click_on_canon_eos_5d_item() {
   
}
@And("User click on write a review link")
public void user_click_on_write_a_review_link() {
   
}
@When("User fill teh review information with below information")
public void user_fill_teh_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
    

}}















