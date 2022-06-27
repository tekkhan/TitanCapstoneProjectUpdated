package stepDef;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LaptopNoteBooksPageObject;
import utilities.WebDriverUtility;

public class LaptopNoteBookStepDefinition extends Base {

	LaptopNoteBooksPageObject Laptop = new LaptopNoteBooksPageObject();

	@When("User click on Laptop and NoteBook tab")
	public void user_click_on_laptop_and_note_book_tab() {
		Laptop.clickLaptopsNotebooks();
		logger.info("user clicked on Laptop tab");
		WebDriverUtility.takeScreenShot();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("User click on show all Laptops and NoteBook option")
	public void user_click_on_show_all_laptops_and_note_book_option() {
		Laptop.clickShowAllLaptops();
		logger.info("user clicked on show all note book");
		WebDriverUtility.takeScreenShot();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		Laptop.clickOnMacBookItem();
		logger.info("user clicked on macBook");
		WebDriverUtility.takeScreenShot();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("User click on Add to Cart button")
	public void user_click_on_add_to_cart_button() {
		Laptop.AddToCartButton();
		logger.info("user added it to cart");
		WebDriverUtility.takeScreenShot();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String succs) {
		Laptop.successMessage3();
		logger.info("user saw a good message");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("User click on cart option")
	public void user_click_on_cart_option() throws InterruptedException {
		Laptop.cartClick();
		logger.info("user added laptop");
		Thread.sleep(3000);
	}

	@And("User click on red X button to remove the item from the cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_the_cart() throws InterruptedException {
		Laptop.redButtoClick();
		logger.info("user clicked on red button");
		Thread.sleep(2000);
		utilities.WebDriverUtility.takeScreenShot();
	}

	@Then("item should be removed and cart should show {int} item\\(s)")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
		Laptop.cartZero();
		logger.info("value was zero in the cart");
	}

	
//-------------------------------------
//  COMPARISON OPTIONS
	@And("User click on product comparison icon on {string}")
	public void user_click_on_product_comparison_icon_on(String string) {
	Laptop.clickOnComparisonIcon();
	logger.info("user clicked on Comparison link");
	WebDriverUtility.takeScreenShot();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	@And("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
	Laptop.comparisonIconAirBook(); 
	logger.info("user clicked on AirBook Comparison Icon");
	WebDriverUtility.takeScreenShot();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	@Then("User should seee a message {string}")
	public void user_should_seee_a_message(String string) {
	Assert.assertTrue(Laptop.comparisonSuccessMessage());
	Laptop.comparisonSuccessMessage();
	logger.info("user saw success message with no care");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	@And("User click on product comparison link")
	public void user_click_on_product_comparison_link() throws InterruptedException {

	Laptop.clickOncomparisonLink();
	logger.info("user saw the success message with a dam happy face");
	WebDriverUtility.takeScreenShot();
		Thread.sleep(3000);

	}
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() throws InterruptedException {
//	Assert.assertTrue(Laptop.productCompareItem());
	Laptop.productCompareItem();
	logger.info("user saw aproval text with a sad face");
	Thread.sleep(2000);

	}
 
	
	//--------
	//NEW SCENARIO
	
	
	@And("User click on heart icon to add {string} laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) {
	Laptop.heartNeedToClick();
	logger.info("user clicked on heart");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	}
	@Then("User should get a message {string}")
	public void user_should_get_a_message(String string) {
	Laptop.message();
	logger.info("user saw a good message");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
	
//NEW SCENARIO
	
	@And("User click on MacBook Pro item")
	public void user_click_on_macbook_pro_item() {
	Laptop.clickOnProMacBook();
	logger.info("user clicked on MacBook pro ");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	
	@Then("User should see {string} price tag is present on UI")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
	Assert.assertTrue(Laptop.priceOfProMacBook()); 
	logger.info("user saw price with a dam sad and happy face");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

