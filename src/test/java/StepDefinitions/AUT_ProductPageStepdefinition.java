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

public class AUT_ProductPageStepdefinition extends TestBase {
//WebDriver driver=null;
	AUT_ProductPage et= new AUT_ProductPage(driver) ;	
	
	@When("I click on Description tab")
	public void i_click_on_description_tab() {
		et.clickdescriptionTab();
	}
	
	@Then("^There should be a \"([^\"]*)\" regarding that book the user clicked on$")
	public void there_should_be_a_regarding_that_book_the_user_clicked_on(String arg1) {		
		et.verifyProductDescription(arg1);
	}

	@When("I click on Review tab")
	public void i_click_on_review_tab() {
	   et.clickreviewsTab();
	}

	@Then("There should be a Reviews regarding that book the user clicked on")
	public void there_should_be_a_reviews_regarding_that_book_the_user_clicked_on() {
	   et.verifyreviewsHeader("Reviews");
	}
}
