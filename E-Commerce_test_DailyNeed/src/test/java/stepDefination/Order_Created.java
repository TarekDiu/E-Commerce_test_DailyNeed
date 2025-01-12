package stepDefination;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Order_Created extends Base {

	@Given("he signed up in the landing page")
	public void he_signed_up_in_the_landing_page() {
		page.navigate("https://dailyneed.prodevsltd.xyz/");
		System.out.println(page.title());
	}
	
	

	@When("he clicked the signed up button")
	public void he_clicked_the_signed_up_button() {
		click("//a[@class='sign-in-btn']");
		
	}
	
	

	@Then("he put it her email")
	public void he_put_it_her_email() throws InterruptedException {
		Thread.sleep(3000);
		page.locator("//input[@id = 'email_phone']").fill("tarek12345@gmail.com");
	}

	
	@Then("he put it her password")
	public void he_put_it_her_password() throws InterruptedException {
		Thread.sleep(3000);
		page.locator("//input[@id = 'password']").fill("Tarek746@");
	}
	

	@Then("he hit the submit button")
	public void he_hit_the_submit_button() {
		page.locator("//button[@class = 'btn w-100 sign-in-btn']").click();
	}

}
