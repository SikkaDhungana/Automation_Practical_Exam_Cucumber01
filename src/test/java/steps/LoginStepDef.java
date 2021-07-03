package steps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.Pending;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.BasePage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginStepDef {
	WebDriver driver;
	LoginPage loginPage;
	BasePage basepage;

	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}
	
	
	@Given("^Set SkyBlue Background button exists$")
	public void set_SkyBlue_Background_button_exists() throws Throwable {
		driver.get("http://techfios.com/test/101/");
		boolean eleSelected= driver.findElement(By.xpath("//*[@id=\"extra\"]/button[1]")).isDisplayed();
		//eleSelected = 
		//String expectedTitle = "";
		//String actualTitle = loginPage.getPageTitle();
		//Assert.assertEquals(expectedTitle, actualTitle);
		//loginPage.getPageTitle();
		System.out.println(eleSelected);
	}

	
	@When("^I click on the SkyBlue Background button$")
	public void i_click_on_the_SkyBlue_Background_button() throws Throwable {
		loginPage.clickSkyBlueBackgroundButton();
	}
	
	
	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() throws Throwable {
		loginPage.takeScreenshotAtTheEndOfTest(driver);
	}
	
	@Then("^Set SkyWhite Background button exists$")
	public void set_SkyWhite_Background_button_exists() throws Throwable {
		//driver.get("http://techfios.com/test/101/");
		boolean eleSelected1= driver.findElement(By.xpath("//*[@id=\"extra\"]/button[2]")).isDisplayed();
		System.out.println(eleSelected1);
	   
	}

	

	
	
	@Then("^I click on the set White Background button$")
	public void i_click_on_the_set_White_Background_button() throws Throwable {
		loginPage.clickWhiteBackgroundButton();
	   
	}
	
	

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() throws Throwable {
		loginPage.takeScreenshotAtTheEndOfTest1(driver);    
	}
	
	
	
	//@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}