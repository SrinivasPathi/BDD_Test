package PageObjects;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;
import com.google.common.base.Verify;

public class AUT_HomePage {
	public static String URL="http://practice.automationtesting.in/" ;
	WebDriver driver;
	@FindBy(xpath="//li[@id='menu-item-40']")
	public WebElement shopMenu;
	
	@FindBy(xpath="//a[text()='Home']")
	public WebElement homeLink;
	
	@FindBy(xpath="//*[contains(@class, 'n2-ss-canvas')]")
	public List<WebElement> sliders;
	
	@FindBy(xpath="//ul[@class='products']")
	public List<WebElement> arrivals;
	
	@FindBy(xpath="//h1[@class='product_title entry-title']")
	public WebElement productTitle;
	
	public AUT_HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		//waitHelper.WaitForElement(userName, 60);
	}
	
	public void OpenUrl() throws InterruptedException{ 
		driver.get(URL);
		Thread.sleep(1000);

	  }
	public void clickHomeLink(){
		homeLink.click();
	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='ClassicTimer-time']/span")));
	}
	
	public void clickonShopLink(){ 
		shopMenu.click();
	  }
	public void verifythesliderscount(int count) {
	List<WebElement> ele=	sliders;
	Assert.assertEquals(count, ele.size());
	}
	
	public void verifytheArrivalscount(int count) {
		List<WebElement> ele=	arrivals;
		Assert.assertEquals(count, ele.size());
		}
		
	
	public void verifyImageClickable() throws InterruptedException {
		/*
		 * List<WebElement> ele=
		 * driver.findElements(By.xpath("//div[@class='woocommerce']")); for(int
		 * i=1;i<=ele.size();i++) {
		 * driver.findElement(By.xpath("(//div[@class='woocommerce'])["+i+"]")).click();
		 * Assert.assertTrue(productTitle.isDisplayed()); clickHomeLink();
		 * Thread.sleep(3000); }
		 */
		Assert.assertTrue(productTitle.isDisplayed());
		}
		
	
	public void clickonImage(String sImage) throws InterruptedException {
		driver.findElement(By.xpath("//h3[text()='"+sImage+"']")).click();		
		}	
	
	public  void isAlertPresent(){
	    try{
	    Alert alert = driver.switchTo().alert();
	    alert.accept();
	    System.out.println(alert.getText()+" Alert is Displayed"); 
	    }
	    catch(NoAlertPresentException ex){
	    System.out.println("Alert is NOT Displayed");
	    }
	    }
}
