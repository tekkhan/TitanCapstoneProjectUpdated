package stepDef;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DesktopPageObject;
import utilities.WebDriverUtility;

public class DesktopPageStepDefinition extends Base{

DesktopPageObject deskop = new DesktopPageObject();
	
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
	    deskop.ClickOnDesktop();
	    logger.info("user clicked on Desktop Tab");
	    WebDriverUtility.takeScreenShot();  
	}
	@And("User click on show all desktops")
	public void user_click_on_show_all_desktops() {
	deskop.clickOnShowAllDesktops();
	logger.info("user clicked on showAllDeskop");
     WebDriverUtility.takeScreenShot();
	 try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	@Then("User should see all items are present  Desktop page")
	public void user_should_see_all_items_are_present_desktop_page() {
    List<WebElement> desktopsElements = deskop.desktopsItem();
    for(WebElement element:desktopsElements) {
    Assert.assertTrue(element.isDisplayed());
    logger.info(element.getAttribute("title" + "is present"));
    }
	WebDriverUtility.takeScreenShot();
    try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	
	
	
	
	
	
	@When("User click ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
	  
	}
	@When("User click quantity {int}")
	public void user_click_quantity(Integer int1) {
	    
	}
	@And("User click add to Cart button")
	public void user_click_add_to_cart_button() {
	  
	}
	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
	   
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















