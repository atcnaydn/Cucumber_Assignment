package util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	int randomNumber;

	public void selectFromDropdown(WebElement dropdownElement, String selection) {
		Select select = new Select(dropdownElement);
		select.selectByVisibleText(selection);
	}

	public int randomNumberGenerator() {

		Random random = new Random();
		return randomNumber = random.nextInt(999);
	}

	public void waitForElement(WebDriver driver, WebElement element, int waitTime) {

		WebDriverWait wait = new WebDriverWait(driver, waitTime);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void takeScreenshotAtEndOfTest(WebDriver driver) {
		
		TakesScreenshot ts= ((TakesScreenshot) driver);
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		
		try {
			FileUtils.copyFile(sourcefile, new File(currentDir + "/screenshots/" + label + ".png"));
		} catch (IOException e) {	}
		
		System.out.println("Screenshot taken.");
		
	}
	
}