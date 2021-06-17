package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library

	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement USERNAME_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PASSWORD_FIELD;
	@FindBy(how = How.XPATH, using = "//button[contains(text(), 'Sign in')]")
	WebElement SIGNIN_BUTTON;

	// Interactive Methods

	public void enterUsername(String username) {
		USERNAME_FIELD.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		PASSWORD_FIELD.sendKeys(password);
	}
	
	public void clickSignIn() {
		SIGNIN_BUTTON.click();
	}
	
	
	
	public void verifyDashboardPage() {
		String expectedTitle= "Dashboard- iBilling";
		String actualTitle= driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

}
