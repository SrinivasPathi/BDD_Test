package StepDefinitions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.AUT_HomePage;
import PageObjects.AUT_ProductPage;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testBase.TestBase;

public class AUT_HomePageStepdefinition extends TestBase {
//WebDriver driver=null;
	AUT_HomePage et= new AUT_HomePage(driver) ;	
	 private String iamges;
	
@Given("^I open the URL$")
public void i_open_the_url() throws InterruptedException {
   et.OpenUrl();
}

@When("^I click on Shop Menu$")
public void i_click_on_shop_menu() {
   et.clickonShopLink();
}

@When("^I click on Home menu button$")
public void i_click_on_home_menu_button() {
    et.clickHomeLink();
}

@Then("i should see the sliders count as {int}")
public void i_should_see_the_sliders_count_as(Integer int1) {
    et.verifythesliderscount(int1);
}

@Then("verify Home page must contains only {int} Arrivals")
public void home_page_must_contains_only_arrivals(Integer int1) {
    et.verifytheArrivalscount(int1);
}
@Then("verify Image should be clickable and should navigate to next page where user can add that book to his basket")
public void verify_image_should_be_clickable_and_should_navigate_to_next_page_where_user_can_add_that_book_to_his_basket() throws InterruptedException {
    et.verifyImageClickable();
}

/*
 * @When("I click on the image <imagename>") public void
 * i_click_on_the_image_imagename(String imagename) throws InterruptedException
 * { et.clickonImage(imagename); }
 */

@Then("^verify user navigate to next page where user can add that book to his basket$")
public void verify_user_navigate_to_next_page_where_user_can_add_that_book_to_his_basket() throws InterruptedException {
   et.verifyImageClickable();
}

@When("^I click on the image \"([^\"]*)\"$")
public void i_click_on_the_image(String arg1) {
//	iamges=imagename;
	System.out.println("iamgename:"+arg1);
	switch(arg1){    
	case "Selenium Ruby":    
		driver.findElement(By.xpath("//h3[text()='Selenium Ruby']")).click();	
	 break;  
	case "Thinking in HTML":    
		driver.findElement(By.xpath("//h3[text()='Thinking in HTML']")).click();
	 break;  
	case "Mastering JavaScript":    
		driver.findElement(By.xpath("//h3[text()='Mastering JavaScript']")).click();
	 break;  	    
	
	}    
	
}
//
//@When("I click on the image Thinking in HTML")
//public void i_click_on_the_image_thinking_in_html() {
//	
//}
//
//@When("I click on the image Mastering JavaScript")
//public void i_click_on_the_image_mastering_java_script() {
//	driver.findElement(By.xpath("//h3[text()='Mastering JavaScript']")).click();
//}
}
