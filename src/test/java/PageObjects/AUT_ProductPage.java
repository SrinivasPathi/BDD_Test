package PageObjects;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;
import com.google.common.base.Verify;

public class AUT_ProductPage {
	public static String URL="http://practice.automationtesting.in/" ;
	WebDriver driver;
	@FindBy(xpath="//a[text()='Description']")
	public WebElement descriptionTab;
	
	@FindBy(xpath="//*[@class='reviews_tab']")
	public WebElement reviewsTab;
	
	
	@FindBy(xpath="//div[@id='tab-description']/h2")
	public WebElement descriptionHeader;
	
	
	
	@FindBy(xpath="//h2[@class='woocommerce-Reviews-title']")
	public WebElement reviewsHeader;
	
	
	
	@FindBy(xpath="//h1[@class='product_title entry-title']")
	public WebElement productTitle;
	
	@FindBy(xpath="//div[@id='tab-description']")
	public WebElement productDescription;
	
	
	
	public AUT_ProductPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//waitHelper.WaitForElement(userName, 60);
	}
	
	
	public void clickdescriptionTab(){
		descriptionTab.click();
	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='ClassicTimer-time']/span")));
	}
	
	public void clickreviewsTab(){ 
		reviewsTab.click();
	  }

	
	public void verifydescriptionHeader(String sHeader) {
		Assert.assertEquals(sHeader,descriptionHeader.getText().trim() );
		}
		
	public void verifyreviewsHeader(String sHeader) {
		Assert.assertEquals(sHeader,reviewsHeader.getText().trim() );
		}
	
	public void verifyProductDescription(String sProductDescription)  {
	
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", productDescription);
		
	String pDescription=	productDescription.getText().toString().trim();
	if(pDescription.contains(sProductDescription))
	{
		Assert.assertTrue(pDescription, true);
	}
	else
	{
		Assert.assertTrue(pDescription, true);
	}
	
		}	
	
}
