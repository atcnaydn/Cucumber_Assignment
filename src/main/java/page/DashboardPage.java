package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {

	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element Library
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Bank & Cash')]") WebElement BANK_CASH_FIELD;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'New Account')]") WebElement NEW_ACCOUNT_FIELD;
	
	//Interactive Methods
	
	public void clickBankCash() {
		BANK_CASH_FIELD.click();
	}
	
	public void clickNewAccount() {
		NEW_ACCOUNT_FIELD.click();
	}
	
	public void verifyDashboardPage() {
		
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle);
		
		
	}

}
