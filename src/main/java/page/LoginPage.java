package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import cucumber.api.java.en.When;

public class LoginPage extends BasePage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"label-first\"]/b")
	WebElement BUTTON_EXISTS_FIELD;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[1]")
	WebElement SKYBLUE_BACKGROUND_BUTTON_FIELD;
	
	@FindBy(how = How.XPATH, using = "/html/body")
	WebElement SKYBLUE_BACKGROUND;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[2]")
	WebElement WHITE_BACKGROUND_BUTTON_FIELD;

	
	
	
	//public String getPageTitle() {
	//	return driver.getTitle();
	//}

	public void clickSkyBlueBackgroundButton() {
		SKYBLUE_BACKGROUND_BUTTON_FIELD.click();
	}


	public void takeScreenshotAtTheEndOfTest(WebDriver driver) throws IOException {
		TakesScreenshot srnshot = ((TakesScreenshot) driver);
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
		File sourceFile = srnshot.getScreenshotAs(OutputType.FILE);
		String CurrentDirectory = System.getProperty("user.dir");
		FileUtils.copyFile(sourceFile, new File(CurrentDirectory + "/screenshots/" + label + ".png"));
	}
	
	//public String getPageTitle1() {
	//	return driver.getTitle();
		//SKYBLUE_BACKGROUND
	//}
	
	public void clickWhiteBackgroundButton() {
		WHITE_BACKGROUND_BUTTON_FIELD.click();
	}
	
	public void takeScreenshotAtTheEndOfTest1(WebDriver driver) throws IOException {
		TakesScreenshot srnshot1 = ((TakesScreenshot) driver);
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
		File sourceFile = srnshot1.getScreenshotAs(OutputType.FILE);
		String CurrentDirectory = System.getProperty("user.dir");
		FileUtils.copyFile(sourceFile, new File(CurrentDirectory + "/screenshots/" + label + ".png"));
	}

	
}
