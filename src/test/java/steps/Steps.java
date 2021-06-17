package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.DashboardPage;
import page.LoginPage;
import page.NewAccountPage;
import util.BasePage;
import util.BrowserFactory;

public class Steps extends BasePage{
	
	WebDriver driver;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	NewAccountPage newAccountPage;

	@Given("^User is on the Techfios login page$")
	public void user_is_on_the_techfios_login_page(){
		
		driver = BrowserFactory.init();
		
	}
	
	@When("^User enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
		
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		
	}
	
	@When("^User clicks submit$")
	public void user_clicks_submit() throws Throwable {
		loginPage.clickSignIn();
	}
	
	@Then("^User should log in to dashboard page$")
	public void user_should_log_in_to_dashboard_page() {
		
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.verifyDashboardPage();
	
	}
	
	@Given("^User is on the Techfios dashboard page$")
	public void user_is_on_the_Techfios_dashboard_page() {
		
		driver = BrowserFactory.init();
		
	}
	
	@When("^User clicks on bank and cash$")
	public void user_clicks_on_bank_and_cash() {
		
		dashboardPage.clickBankCash();
		
	}
	
	@When("^User clicks on new account$")
	public void user_clicks_on_new_account() {
		
		dashboardPage.clickNewAccount();
	 
	}
	
	@When("^User fills up the form entering \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\" and clicks on submit$")
	public void user_fills_up_the_form_entering_and_and_and_and_and_and_and_clicks_on_submit(String accountTitle, String description, String balance, String accountNumber, String contact, String phone, String url) {
		
		newAccountPage = PageFactory.initElements(driver, NewAccountPage.class);
		
		BasePage basePage = new BasePage();
		int randomNumber = basePage.randomNumberGenerator();
		
		newAccountPage.enterAccountTitle(accountTitle + randomNumber);
		newAccountPage.enterDescription(description);
		newAccountPage.enterBalance(balance);
		newAccountPage.enterAccountNumber(accountNumber + randomNumber);
		newAccountPage.enterContactPerson(contact);
		newAccountPage.enterPhone(phone + randomNumber);
		newAccountPage.enterBankingURL(url);
		newAccountPage.clickSubmit();
	}
	
	@Then("^User should be able to validate new account created$")
	public void user_should_be_able_to_validate_new_account_created() {
				
		newAccountPage.verifyAccountCreated();
		
		
	}
	
	@After
	public void closeBrowser() {
		
		takeScreenshotAtEndOfTest(driver);
		BrowserFactory.teardown();
		
	}
	
	
}
