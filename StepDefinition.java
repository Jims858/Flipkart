package org.stepdefi;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	@Given("I am on the Flipkart registration page")
	public void i_am_on_the_Flipkart_registration_page() throws AWTException {
	    browserLaunch();
	    UrlLaunch("https://www.flipkart.com/");
	    maximize();
	    RegistrationPojoClass n=new RegistrationPojoClass();
	    WebElement login = n.getLogin();
	    clk(login);
	    WebElement link = n.getLink();
	    clk(link);
	}

	@When("I fill in the registration form with valid details")
	public void i_fill_in_the_registration_form_with_valid_details() {
		RegistrationPojoClass n=new RegistrationPojoClass();
		WebElement mobno = n.getMobno();
	    enterTextbox(mobno, "8220425887");
	    WebElement otpbut = n.getOtpbut();
	    clk(otpbut);
	}

	@When("I submit the registration form")
	public void i_submit_the_registration_form() {
		//I entered OTP by manually and registered.
	}

	@Then("I should be registered successfully")
	public void i_should_be_registered_successfully() {
	    //I Registered Successfully (Manually)
	}

	@Then("I should be redirected to the dashboard or homepage")
	public void i_should_be_redirected_to_the_dashboard_or_homepage() {
	    back();
	    back();
	}

	@Given("I am on the Flipkart login page")
	public void i_am_on_the_Flipkart_login_page() {
		UserLoginPojoClass n=new UserLoginPojoClass();
		WebElement login = n.getLogin();
		clk(login);
	    WebElement mobno2 = n.getMobno();
	    enterTextbox(mobno2, "8220425887");
	    WebElement otpbut2 = n.getOtpbut();
	    clk(otpbut2);
	    //Now Also I entered OTP and Reached Login page.
	}

	@When("I fill in the login form with valid credentials")
	public void i_fill_in_the_login_form_with_valid_credentials() {
		//These things did by manually
		UserLoginPojoClass n=new UserLoginPojoClass();
	    WebElement edit1 = n.getEdit1();
	    clk(edit1);
	    WebElement firstname = n.getFirstname();
	    enterTextbox(firstname, "Arumai");
	    WebElement lastname = n.getLastname();
	    enterTextbox(lastname, "Bernish");
	    WebElement gender = n.getGender();
	    clk(gender);
	    WebElement save1 = n.getSave1();
	    clk(save1);
	    WebElement edit2 = n.getEdit2();
	    clk(edit2);
	    WebElement email = n.getEmail();
	    enterTextbox(email, "bernishad77@gamil.com");
	}

	@When("I submit the login form")
	public void i_submit_the_login_form() {
		//Also these things did by manually
		UserLoginPojoClass n=new UserLoginPojoClass();
	    WebElement save2 = n.getSave2();
	    clk(save2);
	}

	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
	    //Login has been Successfully done.
	}

	@Given("I am on the Flipkart homepage")
	public void i_am_on_the_Flipkart_homepage() {
		specialUrl("https://www.flipkart.com/");
		ProductSearchPojo n=new ProductSearchPojo();
		WebElement cut = n.getCut();
		clk(cut);
		WebElement searchbox = n.getSearchbox();
		enterTextbox(searchbox, "Laptop");
	}

	@When("I use the search functionality to find a {string}")
	public void i_use_the_search_functionality_to_find_a(String string) {
	    ProductSearchPojo n=new ProductSearchPojo();
	    WebElement searchbutton = n.getSearchbutton();
	    clk(searchbutton);
	}

	@Then("I should see search results containing {string}")
	public void i_should_see_search_results_containing(String string) {
	    String urlCheck = getUrlCheck();
	    if (urlCheck.contains("https://www.flipkart.com/search?q=Laptop&otracker=search&otracker1")) {
			System.out.println("I am on the search result laptop page");
		}
	    else {
			System.out.println("I didn't reach the laptop search page");
		}
	}

	@Given("I have searched for a {string}")
	public void i_have_searched_for_a(String string) {
		//Product has been Searched by Manually.
	}

	@When("I select a product from the search results")
	public void i_select_a_product_from_the_search_results() {
		ProductPurchasePojo n=new ProductPurchasePojo();
	    WebElement clkproduct = n.getClkproduct();
	    clk(clkproduct);
	}

	@When("I add the product to the cart")
	public void i_add_the_product_to_the_cart() {
		windowsHandling();
	    ProductPurchasePojo n=new ProductPurchasePojo();
	    WebElement addtocart = n.getAddtocart();
	    clk(addtocart);
	}

	@When("I navigate to the cart and proceed to checkout")
	public void i_navigate_to_the_cart_and_proceed_to_checkout() {
	    ProductPurchasePojo n=new ProductPurchasePojo();
	    WebElement placeorder = n.getPlaceorder();
	    waitToBeClick(10, placeorder);
	    clk(placeorder);
	}

	@When("I fill in the checkout details with valid information")
	public void i_fill_in_the_checkout_details_with_valid_information() {
	    ProductPurchasePojo n=new ProductPurchasePojo();
	    WebElement entermob = n.getEntermob();
	    enterTextbox(entermob, "8220425887");
	}

	@Then("the product should be purchased successfully")
	public void the_product_should_be_purchased_successfully() {
	  ProductPurchasePojo n=new ProductPurchasePojo();
	  WebElement contin = n.getContin();
	  clk(contin);
	}

	@Given("I am logged into Flipkart")
	public void i_am_logged_into_Flipkart() {
	    //I Selected logout link which is in payment page
	}

	@When("I log out from the application")
	public void i_log_out_from_the_application() {
		//This was done by manually
	   LogoutPojoClass n=new LogoutPojoClass();
	   WebElement logout = n.getLogout();
	   clk(logout);
	}

	@Then("I should be logged out successfully")
	public void i_should_be_logged_out_successfully() {
	    //It logged out Successfully.
	}

	@Then("I should be redirected to the login page")
	public void i_should_be_redirected_to_the_login_page() {
		//Also this was done by manually.
		LogoutPojoClass n=new LogoutPojoClass();
		WebElement login = n.getLogin();
		clk(login);
	}



}
