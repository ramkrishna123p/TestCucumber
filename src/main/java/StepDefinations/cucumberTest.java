package StepDefinations;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class cucumberTest{
			
	@Given("Launch amazon URL")
	public void launch_amazon_url() throws InterruptedException {
		
		genericdefinations.Intilization();
		genericdefinations.deleteAllCookies();
		genericdefinations.setup();
		genericdefinations.deleteAllCookies();
		genericdefinations.waitTime(amazonPageConstants.QA_TIMEOUT);
		genericdefinations.windowMaximize();
	}

	@When("Click on Sign In")
	public void click_on_sign_in() {
	    // Write code here that turns .he phrase above into concrete actions
		genericdefinations.Click(LocatorType.XPATH,amazonPageConstants.SIGNINLINK);
	    
	}

	@When("Enter the {string} username")
	public void enter_the_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
		genericdefinations.SendKeys(LocatorType.XPATH,amazonPageConstants.USERNAME, string);
	}

	@When("Click on continue")
	public void click_on_continue() {
	    // Write code here that turns the phrase above into concrete actions
		genericdefinations.Click(LocatorType.XPATH,amazonPageConstants.CONTINUE);
	}

	@When("Enter the {string} password")
	public void enter_the_password(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		/*WebDriverWait wait=new WebDriverWait(driver,90);*/
		genericdefinations.waitTime(amazonPageConstants.QA_TIMEOUT);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(//input[@type='password']")));
		
/*FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofMinutes(120));
		wait.withTimeout(Duration.ofSeconds(2));

		wait.ignoring(NoSuchElementException.class); //make sure that this exception is ignored
		Function<WebDriver, WebElement> function = new Function<WebDriver, WebElement>()
				{
					public WebElement apply(WebDriver arg0) {
						System.out.println("Checking for the element!!");
						WebElement element = arg0.findElement(By.xpath("//input[@type='password']"));
						if(element != null)
						{
							System.out.println("Target element found");
						}
						return element;
					}
				};

		wait.until(function);*/
		// driver.findElement(By.xpath("//input[@type='password']")).sendKeys(string);
		genericdefinations.SendKeys(LocatorType.XPATH,amazonPageConstants.PASSWORD, string);
	}

	@When("Click on Signin")
	public void click_on_signin() {
	    // Write code here that turns the phrase above into concrete actions
	    //driver.findElement(By.xpath("//input[@type='submit']")).click();
		genericdefinations.Click(LocatorType.XPATH,amazonPageConstants.SIGNIN);
	}

	@Then("Validate Username {string}")
	public void validate_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String Text=genericdefinations.getWebElementText(LocatorType.XPATH,amazonPageConstants.SIGNINLINK);
		String[] abc=Text.split(",");
		System.out.println(abc[1].trim());
	
		Assert.assertEquals("Name of the user is displayed after login onn login page", "Venkat", abc[1].trim());
	
	}
	
	@When("Mouse Over on Logged in User")
	public void mouse_over_on_logged_in_user() {
	    // Write code here that turns the phrase above into concrete actions
		genericdefinations.mouseOver(LocatorType.XPATH, amazonPageConstants.LOGGEDINUSERTEXT);
	}

	@When("Click on SignOut")
	public void click_on_sign_out() {
	    // Write code here that turns the phrase above into concrete actions
		genericdefinations.Click(LocatorType.XPATH, amazonPageConstants.SIGNOUT);
	}

	@Then("Validate Amazon Landing Page is displayed")
	public void validate_amazon_landing_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		String Text=genericdefinations.getWebElementText(LocatorType.XPATH, amazonPageConstants.LANDINGPAGE);
	    System.out.println(Text);
		Assert.assertEquals("Name of the user is displayed after login onn login page", "Sign in or create account", Text.trim());
		//genericdefinations.closeBrowser();
	}



}
