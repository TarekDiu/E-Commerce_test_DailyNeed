package stepDefination;

import com.microsoft.playwright.options.SelectOption;

import base.Base;
import io.cucumber.java.en.Then;

public class Customer_Order_Successfully extends Base {

	@Then("he hit the Add to Cart Button")
	public void he_hit_the_add_to_cart_button() throws InterruptedException {
		click("//body/div[@class='main-wrapper']/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[2]");
		Thread.sleep(5000);
		
	}

	@Then("he put it her Name in the field option")
	public void he_put_it_her_name_in_the_field_option() throws InterruptedException {
		page.locator("//input[@id = 'customer_name']").fill("Anamul Haque Biazid");
		Thread.sleep(3000);
	}

	@Then("he put it her Phone Number  in the field option")
	public void he_put_it_her_phone_number_in_the_field_option() throws InterruptedException {
		Thread.sleep(3000);
		page.locator("//input[@id = 'customer_phone']").fill("01628083476");
	}

	@Then("he put it her Address in the field option")
	public void he_put_it_her_address_in_the_field_option() throws InterruptedException {
		Thread.sleep(3000);
		page.locator("//textarea[@id = 'customer_address']").fill("Ixelles,Brussels,Belgium");
	}

	@Then("he put it her Shipping Sellect the field option")
	public void he_put_it_her_shipping_sellect_the_field_option() {
		page.locator("//select[@id = 'shipping_method']").selectOption(new SelectOption().setIndex(1));
	}

	@Then("he hit the submit button and successfully  Order done")
	public void he_hit_the_submit_button_and_successfully_order_done() throws InterruptedException {
		
		Thread.sleep(3000);
		click("//button[@class = 'btn btn-success w-100 mb-2']");
		
	}

}
