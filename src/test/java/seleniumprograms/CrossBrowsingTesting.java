package seleniumprograms;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowsingTesting{

	WebDriver driver;
	String baseurl ="https://letcode.in/";
	@Parameters({"emailId","password","browser"})
	@Test
	public void launch(String emailId,String password,String browser) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup(); 
			driver =new ChromeDriver();
			driver.get(baseurl);
		}else
			System.err.println("chrome browser is not defined");

		if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup(); 
			driver =new FirefoxDriver();
			driver.get(baseurl);
		}else
			System.err.println("firefox browser is not defined");


		XpathObjects xpath =new XpathObjects(driver);

		xpath.loginButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		xpath.emailTextBox.sendKeys(emailId);
		xpath.passwordTextBox.sendKeys(password); 
		xpath.submitButton.click();
		xpath.forgotButton.isDisplayed(); 
		String title = driver.getTitle();
		System.out.println(title); 
		driver.close();


	}

}
