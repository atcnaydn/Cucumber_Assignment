package page;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.junit.Assert;
import util.BasePage;

public class NewAccountPage {
	
	boolean success;
	WebDriver driver;

	public NewAccountPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement ACCOUNT_TITLE_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement DESCRIPTION_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement INITIAL_BALANCE_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement ACCOUNT_NUMBER_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	WebElement CONTACT_PERSON_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	WebElement PHONE_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='ib_url']")
	WebElement BANKING_URL_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement SUBMIT_FIELD;
	
	// Interactive Methods

	public void enterAccountTitle(String accountTitle) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(ACCOUNT_NUMBER_FIELD));
		ACCOUNT_TITLE_FIELD.sendKeys(accountTitle);

	}

	public void enterDescription(String description) {

		DESCRIPTION_FIELD.sendKeys(description);

	}

	public void enterBalance(String balance) {

		INITIAL_BALANCE_FIELD.sendKeys(balance);

	}

	public void enterAccountNumber(String accountNumber) {

		ACCOUNT_NUMBER_FIELD.sendKeys(accountNumber);

	}

	public void enterContactPerson(String contactPerson) {

		CONTACT_PERSON_FIELD.sendKeys(contactPerson);

	}

	public void enterPhone(String phone) {

		PHONE_FIELD.sendKeys(phone);

	}

	public void enterBankingURL(String url) {

		BANKING_URL_FIELD.sendKeys(url);

	}

	public void clickSubmit() {

		SUBMIT_FIELD.click();

	}

	public void verifyAccountCreated() {

		BasePage basePage = new BasePage();
		

		try {
			basePage.waitForElement(driver, driver.findElement(By.xpath("//i[@class='fa-fw fa fa-check']")), 2);
			WebElement successMessage = driver.findElement(By.xpath("//i[@class='fa-fw fa fa-check']"));
			
			if (successMessage.isDisplayed()) {
				success = true;	
			}
			
		} catch (NoSuchElementException e) { success = false; 
		} catch (TimeoutException x) { success = false; }
		
		if(success = true) {
			System.out.println("Account created.");
		}

		Assert.assertEquals(true, success);

	}

}
