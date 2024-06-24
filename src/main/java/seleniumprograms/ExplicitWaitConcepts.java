package seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcepts{


	@Test
	public void launch() {

		WebDriver driver;
		String baseurl ="https://letcode.in/";

		WebDriverManager.chromedriver().setup(); 
		driver =new ChromeDriver();
		driver.get(baseurl);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		XpathObjects xpath =new XpathObjects(driver);

		xpath.loginButton.click();
		xpath.emailTextBox.sendKeys("revathygovindasamy241193@gmail.com");
		xpath.passwordTextBox.sendKeys("Revathyg@123"); 
		xpath.submitButton.click();
		
		wait.until(ExpectedConditions.visibilityOf(xpath.welcometextmessage));
		System.out.println(xpath.welcometextmessage.getText());
		wait.until(ExpectedConditions.invisibilityOf(xpath.welcometextmessage));
		xpath.signoutButton.click();
		 driver.close();


	}

}
